package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ListAdapter5 extends ArrayAdapter {
    private List list=new ArrayList();

    public ListAdapter5(Context context, int resource) {
        super(context, resource);

    }
    static class ImgHolder{
        ImageView IMG;
        TextView NAME;
        TextView DETL;
    }
    public void add(ListModel2 object){
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
            row = inflater.inflate(R.layout.list3, parent, false);
            holder = new ImgHolder();
            holder.IMG = (ImageView) row.findViewById(R.id.imagep);
            holder.NAME = (TextView) row.findViewById(R.id.titlep);
            holder.DETL = (TextView) row.findViewById(R.id.detlp);
            row.setTag(holder);
        } else {
            holder = (ImgHolder) row.getTag();
        }

        ListModel2 FR = (ListModel2) getItem(position);
        holder.IMG.setImageResource(FR.getImg_resource());
        holder.NAME.setText(FR.getName());
        holder.DETL.setText(FR.getDetl());
        return row;

    }
}