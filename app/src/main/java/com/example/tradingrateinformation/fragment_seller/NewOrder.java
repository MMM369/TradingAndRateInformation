package com.example.tradingrateinformation.fragment_seller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;
import com.example.tradingrateinformation.adapter.NewOrderAdapter;

public class NewOrder extends Fragment {
    View layout;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_new_order, container, false);

        recyclerView = layout.findViewById(R.id.new_order_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        NewOrderAdapter adapter = new NewOrderAdapter();
        recyclerView.setAdapter(adapter);

        return layout;
    }
}