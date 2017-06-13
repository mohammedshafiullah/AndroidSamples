package com.example.mohammedshafiullah.androiddemo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mohammedshafiullah on 07/06/17.
 */

public class multipleListAdaptor extends RecyclerView.Adapter<multipleListAdaptor.MyViewHolder>

{
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        if (viewType % 2 == 0) {

            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.multi_list_cell1, parent, false);
            return new MyViewHolder(itemView);

        }
        else
       {

            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.multi_list_cell2, parent, false);
            return new MyViewHolder(itemView);

       }

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.i("====Pos","==="+position);



    }


    @Override
    public int getItemCount()
    {
        return 15;
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener
    {
        public MyViewHolder(View itemView)
        {
            super(itemView);

        }

        @Override
        public void onClick(View view)
        {

        }
    }

}
