package com.example.mohammedshafiullah.androiddemo;

import android.content.Context;
import android.provider.Settings;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by developer on 12/07/17.
 */

public class AndriodGridLayoutViewPagerAdaptor extends PagerAdapter
{
    Context context;
    LayoutInflater layoutInflater;
    Integer imageArray [];
    int pos;


    public AndriodGridLayoutViewPagerAdaptor (Context context ,  Integer imageArray[], int pos)
    {
        this.context = context;
        this.imageArray = imageArray;
       this.pos = pos;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount()
    {

        System.out.println ( "sgafhgafsdghafsghdfas========"+String.valueOf(imageArray.length));

        return imageArray.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }


    @Override
    public void startUpdate(ViewGroup container)
    {
        super.startUpdate(container);


    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position)
    {
        View itemView = layoutInflater.inflate(R.layout.view_pager_adaptor_item, container, false);


        ImageView imageView = (ImageView) itemView.findViewById(R.id.viewPagerImageView);

        imageView.setImageResource(imageArray[position]);
        System.out.println ( "Position========"+String.valueOf(imageArray[position]));


       container.addView(itemView);
        return itemView;
    }




    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((LinearLayout) object);
    }

}
