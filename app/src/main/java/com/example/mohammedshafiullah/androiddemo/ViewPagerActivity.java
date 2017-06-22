package com.example.mohammedshafiullah.androiddemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ViewPagerActivity extends AppCompatActivity {


    ViewPager viewPager;
    ViewPagerAdaptor viewPagerAdaptor;

    // for loading hard coded images//
    int images[] = {R.mipmap.image1,R.mipmap.image2, R.mipmap.image3, R.mipmap.image4};




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

       // for loading hard coded images//

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPagerAdaptor = new ViewPagerAdaptor(this, images);
        viewPager.setAdapter(viewPagerAdaptor);

    }
}

