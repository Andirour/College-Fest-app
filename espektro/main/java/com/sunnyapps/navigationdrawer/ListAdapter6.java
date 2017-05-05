package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ListAdapter6 extends ArrayAdapter {
    private List list=new ArrayList();

    public ListAdapter6(Context context, int resource) {
        super(context, resource);

    }
    static class ImgHolder{

        TextView NAME;
        TextView NAME1;
        TextView NAME2;
    }
    public void add(ListModel3 object){
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
            row = inflater.inflate(R.layout.list4, parent, false);
            holder = new ImgHolder();

            holder.NAME = (TextView) row.findViewById(R.id.name);
            holder.NAME1 = (TextView) row.findViewById(R.id.name1);
            holder.NAME2 = (TextView) row.findViewById(R.id.name2);

            row.setTag(holder);
        } else {
            holder = (ImgHolder) row.getTag();
        }

        ListModel3 FR = (ListModel3) getItem(position);

        holder.NAME.setText(FR.getName());
        holder.NAME1.setText(FR.getName1());
        holder.NAME2.setText(FR.getName2());

        return row;

    }
}