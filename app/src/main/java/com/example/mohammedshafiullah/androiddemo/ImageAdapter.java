package com.example.mohammedshafiullah.androiddemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import android.content.Context;

/**
 * Created by developer on 12/07/17.
 */

public class ImageAdapter extends BaseAdapter {



    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {

            R.mipmap.image1, R.mipmap.image2,
            R.mipmap.image3, R.mipmap.image4,
            R.mipmap.image5, R.mipmap.image6,
            R.mipmap.image7, R.mipmap.image8,
            R.mipmap.image9, R.mipmap.image10,
            R.mipmap.image11, R.mipmap.image12,
            R.mipmap.image13, R.mipmap.image14,
            R.mipmap.image15, R.mipmap.image16,
            R.mipmap.image17,  R.mipmap.image18,
            R.mipmap.image19, R.mipmap.image20
    };

    // Constructor
    public ImageAdapter(Context c){
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
        imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
        return imageView;
    }
}
