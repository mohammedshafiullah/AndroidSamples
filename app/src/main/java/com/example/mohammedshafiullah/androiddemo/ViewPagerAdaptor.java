package com.example.mohammedshafiullah.androiddemo;

import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by mohammedshafiullah on 13/06/17.
 */

public class ViewPagerAdaptor extends PagerAdapter
{
    Context context;
    int images[];
    LayoutInflater layoutInflater;


    public ViewPagerAdaptor (Context context, int images[])
    {
        this.context = context;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount()
    {
        return images.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {

        return view == ((LinearLayout) object);

    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position)
    {
        View itemView = layoutInflater.inflate(R.layout.view_pager_adaptor_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.viewPagerImageView);
        imageView.setImageResource(images[position]);


        //listening to image click
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show();
            }
        });

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView((LinearLayout) object);
    }

}
