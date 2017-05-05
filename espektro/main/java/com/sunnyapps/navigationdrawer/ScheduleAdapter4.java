package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class ScheduleAdapter4 extends RecyclerView.Adapter<ScheduleAdapter4.My2ViewHolder> {

    List<String> mListData;

    public ScheduleAdapter4(List<String> mListData) {
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
                String s = "Tricky Questions to vindicate their erudition of the goofy as well as the pedantic. " +
                        "Inquizimania, based on one of the most addictive mind sports, is very popular and " +
                        "commands great viewership. " +
                        "Amidst the nail biting tension and deafening silence, the best minds in the KGEC battle " +
                        "out their wits for questions put forth by the quizmaster. " +
                        "The silence is broken by the enthusiastic crowd, which greets every brilliant answer with " +
                        "a roaring applause. " +
                        "With higher participation figures and great rewards this event would certainly grab more " +
                        "eyeballs and turn more heads.";
                String c = "Date : 11th March\nTime : 12.00 hrs to 15.00 hrs\n" +
                        "Registration Fees : Rs. 50(KGEC) and Rs. 100(Non-KGEC)\n" +
                        "Number of Team Members : 2\n" +
                        "Winner : Prizes Worth Rs. 3500\n" +
                        "First Runner up : Prizes Worth Rs. 1500";
                String l = "http://www.espektro.in/media/Quiz.pdf";
                intent.putExtra("link", l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(0));
                intent.putExtra("extra", i);
                context.startActivity(intent);
            } else if (i == 1) {
                intent = new Intent(context, Details.class);
                String s = "The event will feature the best spokespersons and debaters of KGEC fighting it out to be the best in our " +
                        "college. This event is organized keeping in mind the increasing demand for good speaking skills. Fierce " +
                        "debating amidst a courtroom buzz arguing as lawyers has always proved its excitement.";
                String c = "Date : 11th March\nTime : 13.00 hrs to 15.30 hrs\n" +
                        "Registration Fees : Rs. 100\n" +
                        "Individual Event\n" +
                        "Prizes Updating Soon";
                String l = "http://www.espektro.in/media/Muse_the_Moot.pdf";
                intent.putExtra("link", l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(1));
                context.startActivity(intent);
            }
            else if (i == 2) {
                intent = new Intent(context, Details.class);
                String s = "You have brains in your head and feet in your shoes. " +
                        "You can steer in any directions you choose. " +
                        "Sudoku is most renowned event to check your manipulation capability with numbers. " +
                        "Participant who can solve the given Sudoku in minimum time will be the winner.";
                String c = "Date : 11th March\nTime : 11.00 hrs\n" +
                        "Registration Fees : Free\n" +
                        "Individual Participation\n" +
                        "Winner : Prizes Worth Rs. 3000";
                String l="http://www.espektro.in/media/Sudoku.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(2));
                context.startActivity(intent);
            }
            else if (i == 3) {
                intent = new Intent(context, Details.class);
                String s = "\"RETHINK RECYCLE REMAKE.\" \n" +
                        "An event heavily loaded with fun & innovations, it also carries with it primal social cause, and a showcase of unprecedented creativity. A competition to conjure up the most refreshing art.";
                String c = "Date: 11th March\nTime: 11.00 hrs to 14.00 hrs\n" +
                        "Registration Fees: Free\n" +
                        "Individual Participation\n" +
                        "Winner: Prizes Worth Rs. 1500\n" +
                        "First Runner up: Prizes Worth Rs. 1000";
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                String l="http://www.espektro.in/media/Best_Out_of_Waste.pdf";
                intent.putExtra("link",l);
                intent.putExtra("title", mListData.get(3));
                intent.putExtra("extra", i);
                context.startActivity(intent);
            }
        }
    }
}