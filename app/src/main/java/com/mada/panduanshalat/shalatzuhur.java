package com.mada.panduanshalat;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shalatzuhur extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;



    String [] judul = {
            "Shalat Dzuhur","1","2","3","4","5","6","7","8","9"
    };
    String [] isi = {
            String.valueOf(R.string.shalat_zuhur), String.valueOf(R.string.shalat_zuhur1), String.valueOf(R.string.shalat_zuhur2),
            String.valueOf(R.string.shalat_zuhur3), String.valueOf(R.string.shalat_zuhur4), String.valueOf(R.string.shalat_zuhur5),
            String.valueOf(R.string.shalat_zuhur6), String.valueOf(R.string.shalat_zuhur7), String.valueOf(R.string.shalat_zuhur8)
            , String.valueOf(R.string.shalat_zuhur9)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalatzuhur);
        viewPager = (ViewPager) findViewById(R.id.pager2);

        adapter = new viewpageradapter(getApplication(),judul,isi);
        viewPager.setAdapter(adapter);

    }
}

