package com.example.mohammedshafiullah.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MultipleListViews extends AppCompatActivity
{

    multipleListAdaptor multiplelistAdoptor;
    RecyclerView recyclerViewobj ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_list_views);

        recyclerViewobj = (RecyclerView) findViewById(R.id.multiplelists);

        multiplelistAdoptor = new multipleListAdaptor ();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewobj.setLayoutManager(mLayoutManager);
        recyclerViewobj.setAdapter(multiplelistAdoptor);

    }




}
