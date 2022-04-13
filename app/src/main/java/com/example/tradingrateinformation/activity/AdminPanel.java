package com.example.tradingrateinformation.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tradingrateinformation.R;
import com.example.tradingrateinformation.fragment_admin.AddProduct;
import com.example.tradingrateinformation.fragment_admin.AdminHistory;
import com.example.tradingrateinformation.fragment_admin.Home;
import com.example.tradingrateinformation.fragment_admin.NewSeller;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class AdminPanel extends AppCompatActivity {

    BottomNavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        nv = findViewById(R.id.admin_nv);
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction().replace(R.id.admin_fl,new Home());
        transaction.commit();

        nv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        transaction.replace(R.id.admin_fl,new Home());
                        break;
                    case R.id.new_seller:
                        transaction.replace(R.id.admin_fl,new NewSeller());
                        break;
                    case R.id.add_product:
                        transaction.replace(R.id.admin_fl,new AddProduct());
                        break;
                    case R.id.admin_history:
                        transaction.replace(R.id.admin_fl,new AdminHistory());
                        break;
                }
                transaction.commit();
                return true;
            }
        });

    }
}