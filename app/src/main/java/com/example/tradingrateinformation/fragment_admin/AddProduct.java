package com.example.tradingrateinformation.fragment_admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;

public class AddProduct extends Fragment {
    View layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_add_product, container, false);

        return layout;
    }
}