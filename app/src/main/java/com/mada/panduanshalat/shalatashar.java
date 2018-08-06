package com.mada.panduanshalat;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class shalatashar extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;



    String [] judul = {
            "Shalat Ashar","1","2","3","4","5","6","7","8"
    };
    String [] isi = {
            String.valueOf(R.string.shalat_ashar), String.valueOf(R.string.shalat_ashar1), String.valueOf(R.string.shalat_ashar2),
            String.valueOf(R.string.shalat_ashar3), String.valueOf(R.string.shalat_ashar4),String.valueOf(R.string.shalat_ashar5),
            String.valueOf(R.string.shalat_ashar6), String.valueOf(R.string.shalat_ashar7), String.valueOf(R.string.shalat_ashar8)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalatashar);
        viewPager = (ViewPager) findViewById(R.id.pager3);

        adapter = new viewpageradapter(getApplication(),judul,isi);
        viewPager.setAdapter(adapter);

    }
}
