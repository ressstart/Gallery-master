package com.example.pc.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by PC on 05.05.2018.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    //if we want download photos by URL, we need activate method setImage() at MainActivity class and remake array to vector
    public Integer[] mThumbIds = { R.drawable.image1, R.drawable.image2, R.drawable.image3,
                                   R.drawable.image4, R.drawable.image5, R.drawable.image6,
                                   R.drawable.image7, R.drawable.image8, R.drawable.image9,
                                   R.drawable.image10, R.drawable.image11, R.drawable.image12,
                                   R.drawable.image13};

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        return imageView;
    }
}