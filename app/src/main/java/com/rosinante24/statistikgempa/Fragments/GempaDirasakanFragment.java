package com.rosinante24.statistikgempa.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rosinante24.statistikgempa.Adapter.AdapterGempaDirasakan;
import com.rosinante24.statistikgempa.Adapter.AdapterGempaTerkini;
import com.rosinante24.statistikgempa.Network.ApiServices;
import com.rosinante24.statistikgempa.Network.InitRetrofit;
import com.rosinante24.statistikgempa.POJO.PojoGempaDirasakan;
import com.rosinante24.statistikgempa.POJO.PojoGempaTerkini;
import com.rosinante24.statistikgempa.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class GempaDirasakanFragment extends Fragment {


    @BindView(R.id.recycler_fragment_gempa_dirasakan)
    RecyclerView recyclerFragmentGempaDirasakan;
    Unbinder unbinder;

    public GempaDirasakanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gempa_dirasakan, container, false);
        getDataGempaDirasakan();
        // Inflate the layout for this fragment
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    private void getDataGempaDirasakan() {
        ApiServices api = InitRetrofit.getInstances();
        Call<PojoGempaDirasakan> callgempadirasakan = api.getGempaDirasakan("gempa-dirasakan");
        callgempadirasakan.enqueue(new Callback<PojoGempaDirasakan>() {
            @Override
            public void onResponse(Call<PojoGempaDirasakan> call, Response<PojoGempaDirasakan> response) {
                if (response.isSuccessful()) {
                    List<PojoGempaDirasakan.DataGempaDirasakan> datagempadirasakan = response.body().getDataGempaDirasakanList();
                    AdapterGempaDirasakan adapter = new AdapterGempaDirasakan(datagempadirasakan, getActivity());
                    recyclerFragmentGempaDirasakan.setAdapter(adapter);
                    recyclerFragmentGempaDirasakan.setLayoutManager(new LinearLayoutManager(getActivity()));
                }
            }

            @Override
            public void onFailure(Call<PojoGempaDirasakan> call, Throwable t) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
