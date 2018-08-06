package com.mada.panduanshalat;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Hp on 08/02/2018.
 */

public class viewpageradapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    String [] judul;
    String[] isi;

    public viewpageradapter (Context context, String[] judul,String[] isi){
        this.context = context;
        this.judul = judul ;
        this.isi = isi;
    }
    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ScrollView) object);
    }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView txt,txtisi;

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v = layoutInflater.inflate(R.layout.galeri_item,container,false);

            txtisi = (TextView) v.findViewById(R.id.txtitem);
            txt = (TextView) v.findViewById(R.id.txtjudul);

            txt.setText(judul[position]);
            txtisi.setText(Integer.parseInt(isi[position]));

            ((ViewPager) container).addView(v);
            return v;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((ScrollView) object);
    }
}
