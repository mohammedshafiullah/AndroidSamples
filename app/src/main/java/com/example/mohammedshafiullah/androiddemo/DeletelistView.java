package com.example.mohammedshafiullah.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class DeletelistView extends AppCompatActivity  implements View.OnClickListener{

    RecyclerView recyclerViewobj ;
    DeleteListViewAdaptor deleteListViewAdaptor;
    List<Delete_list_Pojo>delete_list = new ArrayList<>();

    public String[] nameArray = {
            "Abundance",
            "Anxiety",
            "Bruxism",
            "Discipline",
            "Drug Addiction"
    };

    public String[] placeArray = {
            "Delhi ",
            "Punjab",
            "Mysore",
            "Gujarat",
            "Hyderabad"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletelist_view);

        recyclerViewobj = (RecyclerView) findViewById(R.id.recyclerViewOBJ);

        deleteListViewAdaptor = new DeleteListViewAdaptor(delete_list);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewobj.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerViewobj.setAdapter(deleteListViewAdaptor);

        for (int i = 0 ; i< nameArray.length ; i++)
        {
            delete_list.add(new Delete_list_Pojo (nameArray[i] , placeArray[i]));
        }

        // studentList.add(new Student( "Sachin","mumbai"));
        deleteListViewAdaptor.notifyDataSetChanged();



    }


    @Override
    public void onClick(View view)

    {


    }
}
