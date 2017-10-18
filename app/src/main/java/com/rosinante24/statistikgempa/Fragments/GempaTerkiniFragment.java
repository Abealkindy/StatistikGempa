package com.rosinante24.statistikgempa.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rosinante24.statistikgempa.Adapter.AdapterGempaTerkini;
import com.rosinante24.statistikgempa.Network.ApiServices;
import com.rosinante24.statistikgempa.Network.InitRetrofit;
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
public class GempaTerkiniFragment extends Fragment {


    @BindView(R.id.recycler_fragment_gempa_terkini)
    RecyclerView recyclerFragmentGempaTerkini;
    Unbinder unbinder;

    public GempaTerkiniFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gempa_terkini, container, false);
        getDataGempaTerkini();
        unbinder = ButterKnife.bind(this, v);
        return v;
    }

    private void getDataGempaTerkini() {
        ApiServices api = InitRetrofit.getInstances();
        Call<PojoGempaTerkini> callgempaterkini = api.getGempaTerkini("gempa-terkini");
        callgempaterkini.enqueue(new Callback<PojoGempaTerkini>() {
            @Override
            public void onResponse(Call<PojoGempaTerkini> call, Response<PojoGempaTerkini> response) {
                if (response.isSuccessful()) {
                    List<PojoGempaTerkini.DataGempaTerkini> datagempaterkini = response.body().getDataGempaTerkiniList();
                    AdapterGempaTerkini adapter = new AdapterGempaTerkini(datagempaterkini, getActivity());
                    recyclerFragmentGempaTerkini.setAdapter(adapter);
                    recyclerFragmentGempaTerkini.setLayoutManager(new LinearLayoutManager(getActivity()));
                }
            }

            @Override
            public void onFailure(Call<PojoGempaTerkini> call, Throwable t) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
