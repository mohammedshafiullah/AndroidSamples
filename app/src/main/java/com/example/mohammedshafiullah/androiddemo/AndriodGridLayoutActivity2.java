package com.example.mohammedshafiullah.androiddemo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AndriodGridLayoutActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_andriod_grid_layout2);


        Intent i = getIntent(); //Creating INtetnt here
        int pos = i.getExtras().getInt("id");//Getting position  from the post Intent
        AndriodGridLayoutAdaptor imageAdapter = new AndriodGridLayoutAdaptor(this); //calling image Adoptor for images


        ViewPager viPgr = (ViewPager) findViewById(R.id.gridview_viewpager);
        AndriodGridLayoutViewPagerAdaptor viPgrAdp  = new AndriodGridLayoutViewPagerAdaptor (this,imageAdapter.mThumbIds,pos);

        viPgr.setAdapter(viPgrAdp);
        viPgr.setCurrentItem(pos);

    }
}
