package com.mada.panduanshalat;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shalatmaghrib extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;



    String [] judul = {
            "Shalat Maghrib","1","2","3","4","5","6","7","8"
    };
    String [] isi = {
            String.valueOf(R.string.shalat_maghrib), String.valueOf(R.string.shalat_maghrib1), String.valueOf(R.string.shalat_maghrib2),
            String.valueOf(R.string.shalat_maghrib3), String.valueOf(R.string.shalat_maghrib4), String.valueOf(R.string.shalat_maghrib5),
            String.valueOf(R.string.shalat_maghrib6), String.valueOf(R.string.shalat_maghrib7), String.valueOf(R.string.shalat_maghrib8)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalatmaghrib);
        viewPager = (ViewPager) findViewById(R.id.pager4);

        adapter = new viewpageradapter(getApplication(),judul,isi);
        viewPager.setAdapter(adapter);

    }
}
