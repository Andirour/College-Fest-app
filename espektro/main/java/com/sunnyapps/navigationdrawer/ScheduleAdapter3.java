package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class ScheduleAdapter3 extends RecyclerView.Adapter<ScheduleAdapter3.My2ViewHolder> {

    List<String> mListData;

    public ScheduleAdapter3(List<String> mListData) {
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
                String s = "Show off your skills as you battle an army of problems equipped with any " +
                        "programming language as your weapon. A coding competition for all the code enthusiasts out there, Code " +
                        "Dictator consists of five problems " +
                        "carrying the same amount of points to be solved within 3 hours. Crack to win great prizes!";
                String c = "Date : 10th and 11th March\nTime : 11.00 to 15.00\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Participation\n" +
                        "Winner : Rs. 1000\n" +
                        "First Runner up : Rs. 500";
                String l="http://www.espektro.in/media/Code_Dictator.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(0));
                context.startActivity(intent);
            } else if (i == 1) {
                intent = new Intent(context, Details.class);
                String s = "Find the bugs and debug the given maze of code. Fix it and take home great prizes";
                String c = "Date : 10th and 11th March\nTime : 11.00 to 15.00\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Participation\n" +
                        "Winner : Rs. 1000\n" +
                        "First Runner up : Rs. 500";
                String l="http://www.espektro.in/media/Bug_of_Debug.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(1));
                context.startActivity(intent);
            }
            else if (i == 2) {
                intent = new Intent(context, Details.class);
                String s = "Need for Speed Most Wanted by EA Sports is one of the most popular racing games in the world of computer " +
                        "gaming. Techtix'17, in this era of virtual reality, brings for you a chance to participate and win great prizes.";
                String c = "Date : 10th March\nTime : 11.00 to 17.00\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Event\n" +
                        "Winner : Rs. 1000\n" +
                        "First Runner up : Rs. 500";
                String l="http://www.espektro.in/media/NFS_MOST_WANTED.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(2));
                context.startActivity(intent);
            } else if (i == 3) {
                intent = new Intent(context, Details.class);
                String s = "The most popular computer game of all times that was introduced by EA Sports, " +
                        "FIFA is a favourite for all of us out here. " +
                        "Thus, Techtix'17 brings the gaming tournament of FIFA.";
                String c = "Date : 10th March\nTime : 11.00 to 15.00\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Participation\n" +
                        "Winner : Rs. 1000\n" +
                        "First Runner up : Rs. 500";
                String l=
                        "http://www.espektro.in/media/FIFA_11.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(3));
                context.startActivity(intent);
        }
            else if (i == 4) {
                intent = new Intent(context, Details.class);
                String s = "For the very first time, Techtix presents Case Study Challenge. " +
                        "It's time to showcase your strong business and entrepreneurial skills and only those with " +
                        "spark of creativity will make it through. " +
                        "Gear up yourselves and mark your way among the top 4 teams and get invited to fight " +
                        "for the final glory. " +
                        "Wishing you best of luck to all the participating teams.";
                String c = "Date : 10th and 11th March\nTime : 11.00 hrs onwards\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Participation\n" +
                        "Prizes Worth Rs. 2000";
                String l="http://www.espektro.in/media/Case_Study.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(4));
                context.startActivity(intent);
            }
            else if (i == 5) {
                intent = new Intent(context, Details.class);
                String s = "Mathematicians need not be boring always, this competition proves just that. " +
                        "Do you have an innate desire to do with numbers what artists do with colors? " +
                        "Or do you see music in equations? We are sure this competition will turn out to be a " +
                        "sheer display of talented math-minds. " +
                        "So pit yourself against the toughest opponents in the battle to solve the trickiest " +
                        "questions in the least amount of time, to be crowned the winner!";
                String c = "Date : 10th March\nTime : 13.00 hrs to 16.00 hrs\n" +
                        "Registration Fees : Rs. 50\n" +
                        "Individual Participation\n" +
                        "Winner : Prizes Worth Rs. 1000\n" +
                        "First Runner up : Prizes Worth Rs. 500";
                String l="http://www.espektro.in/media/MATEMATICOS.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(5));
                intent.putExtra("extra", i);
                context.startActivity(intent);
            }
    }}
}