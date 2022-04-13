package com.example.tradingrateinformation.fragment_admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;
import com.example.tradingrateinformation.adapter.HistoryAdapter;

public class AdminHistory extends Fragment {
    View layout;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_admin_history, container, false);

        recyclerView = layout.findViewById(R.id.history_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        HistoryAdapter adapter = new HistoryAdapter();
        recyclerView.setAdapter(adapter);

        return layout;
    }
}