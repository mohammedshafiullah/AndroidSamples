package com.example.mohammedshafiullah.androiddemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohammedshafiullah on 25/05/17.
 */

public class DeleteListViewAdaptor extends RecyclerView.Adapter<DeleteListViewAdaptor.MyViewHolder> {


public List<Delete_list_Pojo>deletelist;

    public  DeleteListViewAdaptor( List<Delete_list_Pojo>deletelist )
    {
        this.deletelist = deletelist;

    }


    public class MyViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView name;
        ImageView deleteImage;
         TextView place;


        public MyViewHolder(View itemView)
        {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTV);
            place = (TextView) itemView.findViewById(R.id.placeTV);
            deleteImage = (ImageView)itemView.findViewById(R.id.deleteImage);

            deleteImage.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Delete_list_Pojo delete_list_pojoObj = (Delete_list_Pojo) view.getTag();
            deletelist.remove(delete_list_pojoObj);
            notifyDataSetChanged();
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.delete_layout_cell, parent, false);

        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        Delete_list_Pojo delete_list_pojoObj = deletelist.get(position);
        holder.name.setText(delete_list_pojoObj.nameString);
        holder.place.setText(delete_list_pojoObj.placeString);
        holder.deleteImage.setTag(delete_list_pojoObj);

        //holder.place.setText(stuObj.placeStr);
    }


    @Override
    public int getItemCount()
    {
        return deletelist.size();
    }



}
