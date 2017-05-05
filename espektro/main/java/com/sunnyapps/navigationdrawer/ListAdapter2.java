package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.*;


public class ListAdapter2 extends RecyclerView.Adapter<ListAdapter2.My2ViewHolder> {

    List<String> mListData;

    public ListAdapter2(List<String> mListData) {
        this.mListData = mListData;
    }

    @Override
    public My2ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,
                viewGroup, false);
        return new My2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(My2ViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(mListData.get(i));
    }

    @Override
    public int getItemCount() {
        return mListData == null ? 0 : mListData.size();
    }


    class My2ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        private final Context context;
        public My2ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            title = (TextView) itemView.findViewById(R.id.listitem_name);
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        public void onClick(View view) {
            final Intent intent;
            int i=getAdapterPosition();
            if(i==0) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==1) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==2) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==3) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==4) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==5) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==6) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
            else if(i==7) {
                intent = new Intent(context, ScrollingActivity.class);
                intent.putExtra("extra",i);
                context.startActivity(intent);
            }
        }
    }

}