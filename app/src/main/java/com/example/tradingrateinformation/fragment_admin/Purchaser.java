package com.example.tradingrateinformation.fragment_admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;
import com.example.tradingrateinformation.adapter.BuyerAdapter;

public class Purchaser extends Fragment {
    View view;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_purchaser, container, false);

        BuyerAdapter adapter = new BuyerAdapter();
        recyclerView = view.findViewById(R.id.buyer_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}