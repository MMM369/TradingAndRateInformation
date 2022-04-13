
package com.example.tradingrateinformation.fragment_admin;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tradingrateinformation.R;
import com.example.tradingrateinformation.adapter.SectionAdapter;
import com.google.android.material.tabs.TabLayout;

public class Home extends Fragment {
    View layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_home, container, false);

        SectionAdapter adapter = new SectionAdapter(getActivity(),getChildFragmentManager());
        ViewPager viewPager = layout.findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = layout.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return layout;
    }
}