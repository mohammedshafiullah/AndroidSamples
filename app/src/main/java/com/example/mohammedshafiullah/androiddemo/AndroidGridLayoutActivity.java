package com.example.mohammedshafiullah.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class AndroidGridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_grid_layout);

        GridView gridView = (GridView) findViewById(R.id.grid_view_withImages);

        // Instance of ImageAdapter Class

        AndriodGridLayoutAdaptor imageAdapter = new AndriodGridLayoutAdaptor (this); // Calling Adaoptor
        gridView.setAdapter(imageAdapter); //setting image Adoptor to gridview

        /**
         * On Click event for Single Gridview Item
         * */
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), AndriodGridLayoutActivity2.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });


    }
}
