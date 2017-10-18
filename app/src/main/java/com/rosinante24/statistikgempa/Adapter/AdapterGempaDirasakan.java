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
import com.rosinante24.statistikgempa.POJO.PojoGempaDirasakan;
import com.rosinante24.statistikgempa.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public class AdapterGempaDirasakan extends RecyclerView.Adapter<AdapterGempaDirasakan.ViewHolder> {

    List<PojoGempaDirasakan.DataGempaDirasakan> dataGempaDirasakanList;
    FragmentActivity fragmentActivity;

    public AdapterGempaDirasakan(List<PojoGempaDirasakan.DataGempaDirasakan> dataGempaTerkiniList, FragmentActivity fragmentActivity) {
        this.dataGempaDirasakanList = dataGempaTerkiniList;
        this.fragmentActivity = fragmentActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(fragmentActivity).inflate(R.layout.item_list_gempa_dirasakan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String listkedua = dataGempaDirasakanList.get(position).getDirasakanlist().toString();
        String abcd = listkedua.substring(1, listkedua.length() - 1);
        String abc = abcd.replace(",", "\n");
        holder.isigempadirasakan.setText(abc);

        Glide.with(fragmentActivity)
                .load(dataGempaDirasakanList.get(position).getUrlimagegempadirasakan())
                .placeholder(R.mipmap.ic_launcher_round)
                .into(holder.imageitem2);

        holder.textWaktu2.setText("Waktu gempa : " + dataGempaDirasakanList.get(position).getWaktugempadirasakan());
        holder.textLintang2.setText("Lintang bujur gempa : " + dataGempaDirasakanList.get(position).getLintangbujurgempadirasakan());
        holder.textMagnitudo2.setText("Magnitudo : " + dataGempaDirasakanList.get(position).getMagnitudogempadirasakan());
        holder.textKedalaman2.setText("Kedalaman gempa : " + dataGempaDirasakanList.get(position).getKedalamangempadirasakan());
        holder.textWilayah2.setText("Wlayah : " + dataGempaDirasakanList.get(position).getWilayahgempadirasakan());
    }

    @Override
    public int getItemCount() {
        return dataGempaDirasakanList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageitem2)
        ImageView imageitem2;
        @BindView(R.id.textWaktu2)
        TextView textWaktu2;
        @BindView(R.id.textLintang2)
        TextView textLintang2;
        @BindView(R.id.textMagnitudo2)
        TextView textMagnitudo2;
        @BindView(R.id.textKedalaman2)
        TextView textKedalaman2;
        @BindView(R.id.textWilayah2)
        TextView textWilayah2;
        @BindView(R.id.isigempadirasakan)
        TextView isigempadirasakan;
        @BindView(R.id.carditemearthquake)
        CardView carditemearthquake;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
