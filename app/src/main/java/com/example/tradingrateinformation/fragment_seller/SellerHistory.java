package com.example.tradingrateinformation.fragment_seller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;

public class SellerHistory extends Fragment {
    View layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_seller_history, container, false);

        return layout;
    }
}