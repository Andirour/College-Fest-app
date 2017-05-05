package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;



public class ScheduleAdapter2 extends RecyclerView.Adapter<ScheduleAdapter2.My2ViewHolder> {

    List<String> mListData;

    public ScheduleAdapter2(List<String> mListData) {
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


    class My2ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

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
                intent.putExtra("title", mListData.get(i));
                context.startActivity(intent);
            }
            else if (i == 1) {
                intent = new Intent(context, Details.class);
                String s = "\t Design a manually controlled bot & ride your way through the narrow alleys to find a way out of the " +
                        "perplexing maze and collect maximum points as you travel through it. Here bots are to be made to overcome " +
                        "obstacles like sand, stone, inclination and much more than expected. The robot completing all the tasks with " +
                        "minimum time will be the winner.";
                String l="http://www.espektro.in/media/turbulence.PDF";
                intent.putExtra("link",l);
                String c = "Date : 9th and 10th March | Time : 11.00 to 14.00\n" +
                        "Registration Fees : Rs. 200 per Team\n" +
                        "Maximum Team members : 5\n" +
                        "Winner : Rs. 3000\n" +
                        "First Runner up : Rs. 2000";
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(1));
                context.startActivity(intent);
            } else if (i == 2) {
                intent = new Intent(context, Details.class);
                String s = "Gone are the days of peace, now it's time to put your bot's muscles to test. Wrestlemania is another " +
                        "manually controlled robotics event involving a fight between two bots till they are at the brink of their health. " +
                        "This event gives the participants a chance to showcase their skills in warfare, bringing with it a lot of " +
                        "innovation. This is the only event where no two bots will be of the same nature and functionality as each other, " +
                        "so power up the motors, boost up the torque and let those gears speak.";
                String c = "Date : 9th and 10th March \nTime : 11.00 to 14.00\n" +
                        "Registration Fees : Rs. 200 per Team\n" +
                        "Maximum Team members : 5\n" +
                        "Winner : Rs. 3000\n" +
                        "First Runner up : Rs. 2000";
                String l="http://www.espektro.in/media/Wrestlemania.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(2));
                context.startActivity(intent);
            } else if (i == 3) {
                intent = new Intent(context, Details.class);
                String s = "Are you confident that your bot can challenge the soccer legends we adore? If so it's time to prove it. Robo " +
                        "Soccer brings to you the opportunity of displaying your bot's finesse in the game of soccer. Compete and fight " +
                        "until you can shout";
                String c = "Date : 9th and 10th March\nTime : 11.00 to 14.00\n" +
                        "Registration Fees : Rs. 200 per Team\n" +
                        "Maximum Team members : 5\n" +
                        "Winner : Rs. 3000\n" +
                        "First Runner up : Rs. 2000";
                String l = "http://www.espektro.in/media/ROBO_SOCCER.pdf";
                intent.putExtra("link", l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(3));
                context.startActivity(intent);
            }
            else if (i == 4) {
                intent = new Intent(context, Details.class);
                String s = "The game is already very popular among the gamers ,it's going to be even more exhilarating this time as you " +
                        "switch between terrorists and counter terrorists. " +
                        "See how good you are under pressure. " +
                        "Experience the excitement and energy- blink and you are doomed.Shoot them before " +
                        "they shoot you… Jump into the match and GO! GO! GO!";
                String c = "Date : 9th and 10th March\nTime : 11.00 to 17.00\n" +
                        "Registration Fees : Rs. 500 per Team\n" +
                        "Number of Team members : 5\n"+"Winner: Rs. 4000\n" +
                        "First Runner up: Rs. 2000";
                String l="http://www.espektro.in/media/cs1.6.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(4));
                context.startActivity(intent);
            }
            else if (i == 5) {
                intent = new Intent(context, Details.class);
                String s = "Consolidate your thoughts, present them, enchant your audience! This extempore competition will surely be a " +
                        "fun ride. Register to participate";
                String c = "Date : 9th March\nTime : 14.00 hrs to 16.00 hrs\n" +
                        "Registration Fees : Free\n" +
                        "Individual Event\n" +
                        "Prizes Worth Rs. 1000";
                String l="http://www.espektro.in/media/Sample_HozoqYE.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(5));
                context.startActivity(intent);
            }
            else if (i == 6) {
                intent = new Intent(context, Details.class);
                String s = "One of the most popular and mind-numbing events of our fest, Cryptix is an online event, that involves " +
                        "application of your knowledge in cryptography, and your code-breaking skills. Lap up all the clues, what do you " +
                        "see?";
                String c = "Date and Time : From 9th March 11.00 hrs to 11th March 17.00 hrs\n" +
                        "Registration Fees : Free\n" +
                        "Individual Online Event\n" +
                        "Prizes Worth Rs. 1000";
                String l="http://www.espektro.in/media/Cryptix.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(6));
                context.startActivity(intent);
            }
            else if (i == 7) {
                intent = new Intent(context, Details.class);
                String s = "Chess is eminently and emphatically the philosopher's game. Come with all the practice in the world and " +
                        "great moves under your sleeve. The time is right to use your mind to overpower your opponent's move and " +
                        "utter at last Checkmate. Crown yourself as the Grandmaster of Techtix '17.";
                String c = "Date : 9th and 10th March\nTime : 11.00 hrs to 15.00 hrs\n" +
                        "Registration Fees : Rs. 50\n" +
                        "Individual Participation\n" +
                        "Winner : Prizes Worth Rs. 1000\n" +
                        "First Runner up : Prizes Worth Rs. 500";
                String l="http://www.espektro.in/media/checkmate_problem_statement.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(7));
                context.startActivity(intent);
            }
            else if (i == 8) {
                intent = new Intent(context, Details.class);
                String s = "Here is the event for the circuit lovers." +
                        "This is an event based on the problem on electrical and electronics circuits." +
                        "Candidates can form a team consisting a maximum 2 members. " +
                        "The team who will solve the circuit problem with minimum time would be declared as the winner.";
                String c = "Date : 9th and 10th March\nTime : 12.00 hrs onwards\nRegistration Fees : Free\nTeam maximum of 2 members\nWinner :Prizes Worth Rs. 1000\nRunner up : Prizes Worth Rs. 500";
                String l="http://espektro.kgec.edu.in/media/Circuit-O-Genesis.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(8));
                context.startActivity(intent);
            }
            else if (i == 9) {
                intent = new Intent(context, Details.class);
                String s = "\"It's not about Ideas, It's about making Ideas happen.\"\n" +
                        "This event is also a new attraction of this year's technical fest. In this event there will be a group of 4 student's(max). Each group will be given a specific product which they have to advertise or promote. The best part is that they have to do the promotion by acting out a skit much like a real life ad campaign.\n";
                String c = "Date : 9th and 10th March\nTime : 12.00 hrs onwards\nRegistration Fees : Free\nTeam maximum of 2 members\nWinner :Prizes Worth Rs. 1000\nRunner up : Prizes Worth Rs. 500";
                String l="http://www.espektro.in/media/madads.pdf";
                intent.putExtra("link",l);
                intent.putExtra("detail", s);
                intent.putExtra("schedule", c);
                intent.putExtra("title", mListData.get(9));
                context.startActivity(intent);
            }
        }
    }

}