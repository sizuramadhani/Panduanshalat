package com.mada.panduanshalat;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shalatsubuh extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;



        String [] judul = {
                "Shalat Subuh","1","2","3","4","5","6","7","8"
        };
        String [] isi = {
                String.valueOf(R.string.shalat_subuh), String.valueOf(R.string.shalat_subuh1), String.valueOf(R.string.shalat_subuh2),
                String.valueOf(R.string.shalat_subuh3), String.valueOf(R.string.shalat_subuh4), String.valueOf(R.string.shalat_subuh5),
                String.valueOf(R.string.shalat_subuh6), String.valueOf(R.string.shalat_subuh7), String.valueOf(R.string.shalat_subuh8)
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalatsubuh);
        viewPager = (ViewPager) findViewById(R.id.pager1);

        adapter = new viewpageradapter(getApplication(),judul,isi);
        viewPager.setAdapter(adapter);

    }
}
