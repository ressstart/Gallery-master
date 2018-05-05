package com.example.pc.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by PC on 05.05.2018.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = { R.drawable.image1, R.drawable.image2, R.drawable.image3 };

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mThumbIds.length; // длина массива
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(120, 110));
        return imageView;
    }
}