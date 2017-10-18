package com.rosinante24.statistikgempa.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rosinante24.statistikgempa.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrakiraanCuacaFragment extends Fragment {


    public PrakiraanCuacaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prakiraan_cuaca, container, false);
    }

}
