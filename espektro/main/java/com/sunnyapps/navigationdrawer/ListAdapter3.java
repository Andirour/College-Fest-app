package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.*;


public class ListAdapter3 extends ArrayAdapter {
    private List list=new ArrayList();

    public ListAdapter3(Context context, int resource) {
        super(context, resource);

    }
    static class ImgHolder{
        ImageView IMG;
        TextView NAME;
    }
    public void add(ListModel object){
        super.add(object);
        list.add(object);
    }
    public int getCount(){
        return  this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        ImgHolder holder;
        row = convertView;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_item2, parent, false);
            holder = new ImgHolder();
            holder.IMG = (ImageView) row.findViewById(R.id.images);
            holder.NAME = (TextView) row.findViewById(R.id.title);
            row.setTag(holder);
        } else {
            holder = (ImgHolder) row.getTag();
        }

        ListModel FR = (ListModel) getItem(position);
        holder.IMG.setImageResource(FR.getImg_resource());
        holder.NAME.setText(FR.getName());
        return row;

    }
}