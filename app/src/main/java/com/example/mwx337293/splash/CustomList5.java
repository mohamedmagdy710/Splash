package com.example.mwx337293.splash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomList5 extends BaseAdapter {


    Context con;
    String s[];
    int img[];

    public CustomList5(Context con, String[] s, int[] i) {
        this.con = con;
        this.s = s;
        this.img = i;
    }

    @Override
    public int getCount() {
        return s.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myview;
        LayoutInflater inflate = (LayoutInflater) con
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        myview = inflate.inflate(R.layout.list_item5, null);
        TextView tv = (TextView) myview.findViewById(R.id.textView19);
        //ImageView im = (ImageView) myview.findViewById(R.id.img1);
         tv.setText(s[i]);
       //  im.setImageResource(img[i]);

        return myview;    }
}
