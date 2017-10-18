package com.rosinante24.statistikgempa.Adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rosinante24.statistikgempa.POJO.PojoGempaTerkini;
import com.rosinante24.statistikgempa.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public class AdapterGempaTerkini extends RecyclerView.Adapter<AdapterGempaTerkini.ViewHolder> {

    List<PojoGempaTerkini.DataGempaTerkini> dataGempaTerkiniList;
    FragmentActivity fragmentActivity;

    public AdapterGempaTerkini(List<PojoGempaTerkini.DataGempaTerkini> dataGempaTerkiniList, FragmentActivity fragmentActivity) {
        this.dataGempaTerkiniList = dataGempaTerkiniList;
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(fragmentActivity).inflate(R.layout.item_list_gempa_terkini, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.textwaktu.setText(dataGempaTerkiniList.get(position).getWaktugempaterkini());
        holder.textlintang.setText(dataGempaTerkiniList.get(position).getLintangbujurgempaterkini());
        holder.textmagnitudo.setText(dataGempaTerkiniList.get(position).getMagnitudogempaterkini());
        holder.textkedalamangempa.setText(dataGempaTerkiniList.get(position).getKedalamangempaterkini());
        holder.textwilayah.setText(dataGempaTerkiniList.get(position).getWilayahgempaterkini());
        Glide.with(fragmentActivity)
                .load(dataGempaTerkiniList.get(position).getUrlimagegempaterkini())
                .placeholder(R.mipmap.ic_launcher_round)
                .into(holder.imageitem);
    }

    @Override
    public int getItemCount() {
        return dataGempaTerkiniList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageitem)
        ImageView imageitem;
        @BindView(R.id.textwaktu)
        TextView textwaktu;
        @BindView(R.id.textlintang)
        TextView textlintang;
        @BindView(R.id.textmagnitudo)
        TextView textmagnitudo;
        @BindView(R.id.textkedalamangempa)
        TextView textkedalamangempa;
        @BindView(R.id.textwilayah)
        TextView textwilayah;
        @BindView(R.id.carditem)
        CardView carditem;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
