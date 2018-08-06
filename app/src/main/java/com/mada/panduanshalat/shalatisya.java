package com.mada.panduanshalat;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shalatisya extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;



    String [] judul = {
            "Shalat Isya","1","2","3","4","5","6","7","8"
    };
    String [] isi = {
            String.valueOf(R.string.shalat_isya), String.valueOf(R.string.shalat_isya1), String.valueOf(R.string.shalat_isya2),
            String.valueOf(R.string.shalat_isya3), String.valueOf(R.string.shalat_isya4), String.valueOf(R.string.shalat_isya5),
            String.valueOf(R.string.shalat_isya6), String.valueOf(R.string.shalat_isya7), String.valueOf(R.string.shalat_isya8)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalatisya);
        viewPager = (ViewPager) findViewById(R.id.pager5);

        adapter = new viewpageradapter(getApplication(),judul,isi);
        viewPager.setAdapter(adapter);

    }
}
