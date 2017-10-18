package com.rosinante24.statistikgempa.Activities;

import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.rosinante24.statistikgempa.Fragments.GempaDirasakanFragment;
import com.rosinante24.statistikgempa.Fragments.GempaTerkiniFragment;
import com.rosinante24.statistikgempa.Fragments.PrakiraanCuacaFragment;
import com.rosinante24.statistikgempa.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTitle("Gempa Terkini");

        fragmentManager = getSupportFragmentManager();

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.navigation_home:
                        fragment = new GempaTerkiniFragment();
                        setTitle("Gempa Terkini");
                        break;
                    case R.id.navigation_dashboard:
                        fragment = new GempaDirasakanFragment();
                        setTitle("Gempa Dirasakan");
                        break;
                    case R.id.navigation_notifications:
                        fragment = new PrakiraanCuacaFragment();
                        setTitle("Cuaca Terkini");
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.content, fragment).commit();
                return true;
            }
        });
    }

}
