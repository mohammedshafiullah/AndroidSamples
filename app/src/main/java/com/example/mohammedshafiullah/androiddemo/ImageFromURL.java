package com.example.mohammedshafiullah.androiddemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ImageFromURL extends AppCompatActivity {

    static ImageView imagevw;
    ViewPager viewPagerimgUrl;
    ImageFromUrlAdaptor imageFromUrlAdaptor;

 @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_from_url);

         String [] urls =
                 {
                 "https://www.nasa.gov/sites/default/files/styles/image_card_4x3_ratio/public/thumbnails/image/pia20645_main.jpg?itok=dLn7SngD",
                  "http://www.gettyimages.pt/gi-resources/images/Homepage/Hero/PT/PT_hero_42_153645159.jpg",
                  "http://humminglove.com/wp-content/uploads/2013/08/l-is-l.jpg",
                  "http://api.androidhive.info/images/sample.jpg","http://theopentutorials.com/totwp331/wp-content/uploads/totlogo.png",
                  "http://img6a.flixcart.com/image/shoe/b/v/g/black-coaster-globalite-10-200x200-imadw577jjh5fsry.jpeg",
                  "http://img6a.flixcart.com/image/shoe/b/v/g/black-coaster-globalite-10-200x200-imadw577shaeghnn.jpeg",
                  };

        viewPagerimgUrl = (ViewPager)findViewById(R.id.viewPagerImageURL);
        imageFromUrlAdaptor = new ImageFromUrlAdaptor (this,  urls );
        viewPagerimgUrl.setAdapter(imageFromUrlAdaptor);

}

}
