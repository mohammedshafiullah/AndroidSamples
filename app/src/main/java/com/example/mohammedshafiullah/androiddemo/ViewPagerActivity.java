package com.example.mohammedshafiullah.androiddemo;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerActivity extends AppCompatActivity {


    ViewPager viewPager;
    int images[] = {R.mipmap.image1,R.mipmap.image2, R.mipmap.image3, R.mipmap.image4};
    ViewPagerAdaptor viewPagerAdaptor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = (ViewPager)findViewById(R.id.viewPager);

        viewPagerAdaptor = new ViewPagerAdaptor(this, images);
        viewPager.setAdapter(viewPagerAdaptor);

    }



    }

