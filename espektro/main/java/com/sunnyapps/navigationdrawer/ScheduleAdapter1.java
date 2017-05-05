package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class ScheduleAdapter1 extends RecyclerView.Adapter<ScheduleAdapter1.My2ViewHolder> {

    List<String> mListData;

    public ScheduleAdapter1(List<String> mListData) {
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


        @Override
        public void onClick(View v) {
            final Intent intent;
            int i = getAdapterPosition();
            if (i == 0) {
                intent = new Intent(context, Details.class);
                String s = "\t The objective of this event is to" +
                        " design an autonomous robot which can follow a line (white, thickness – 3cm)," +
                        " and can make its way while facing hurdles in the path." +
                        " The robot to complete the course in the shortest period of time from the start to the" +
                        " finish will be the winner";
                String c = "Date : 9th and 10th March\nTime : 11.00 to 14.00\n" +
                        "Registration Fees : Rs. 200 per Team\n" +
                        "Maximum Team members : 5\n" +
                        "Winner : Rs. 3000\n" +
                        "First Runner up : Rs. 2000";
                String l="http://www.espektro.in/media/Robo.T.Race.pdf";
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("link",l);
                intent.putExtra("title", mListData.get(0));
                context.startActivity(intent);
            }

        }
    }

}