package com.example.mohammedshafiullah.androiddemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by developer on 20/06/17.
 */

public class ImageFromUrlAdaptor  extends PagerAdapter
{

    Context context;
    String imagesURLS[];
    LayoutInflater layoutInflater;


    public ImageFromUrlAdaptor (Context context, String images[]) {
        this.context = context;
        this.imagesURLS = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return imagesURLS.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position)
    {
        View itemView = layoutInflater.inflate(R.layout.image_url_item, container, false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageViewimageURL);
        Picasso.with(context).load(imagesURLS[position]).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher_round).into(imageView);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
