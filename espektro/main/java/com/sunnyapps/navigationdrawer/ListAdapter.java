package com.sunnyapps.navigationdrawer;

import android.content.Intent;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.*;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    List<String> mListData;

    public ListAdapter(List<String> mListData) {
        this.mListData = mListData;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,
                viewGroup, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(mListData.get(i));
    }
    @Override
    public int getItemCount() {
        return mListData == null ? 0 : mListData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        private final Context context;
        public MyViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            title = (TextView) itemView.findViewById(R.id.listitem_name);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }
        public void onClick(View view) {
            final Intent intent;
            int i = getAdapterPosition();
            if (i == 0) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            } else if (i == 1) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            } else if (i == 2) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            } else if (i == 3) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            }
            else if (i == 4) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            } else if (i == 5) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
            }else if (i == 6) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra", i+8);
                context.startActivity(intent);
        }
    }

}}