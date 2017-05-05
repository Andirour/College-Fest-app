package com.sunnyapps.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.*;


public class ListAdapter4 extends RecyclerView.Adapter<ListAdapter4.MyViewHolder> {

    List<String> mListData;

    public ListAdapter4(List<String> mListData) {
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

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

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
            int j = 0;
            String a = mListData.get(0);
            if (a == "Robo_T_Racer") {
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
                } else if (i == 1) {
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
                        String l="http://www.espektro.in/media/ROBO_SOCCER.pdf";
                        intent.putExtra("link",l);
                        intent.putExtra("detail", s);
                        intent.putExtra("schedule", c);
                        intent.putExtra("title", mListData.get(3));
                        context.startActivity(intent);
                }
            } else if (a == "Code Dictator") {
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
            } else if (a == "NFS") {
                if (i == 0) {
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
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                } else if (i == 1) {
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
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
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
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            } else if (a == "Inquizimania") {
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
                    String l="http://www.espektro.in/media/Quiz.pdf";
                    intent.putExtra("link",l);
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
                    String l="http://www.espektro.in/media/Muse_the_Moot.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
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
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            }  else if (a == "Cryptography") {
                if (i == 0) {
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
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                }
            } else if (a == "Case Study") {
                if (i == 0) {
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
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                }
            } else if (a == "Director's Cut") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "All you need to say is 'Lights! Camera! Action!'. Espektro'17 presents a platform for the young minds filled with " +
                            "receipies and ingredients of short film making through the event Directors' Cut";
                    String c = "The team comprises max of 15 members including actors\n" +
                            "Mail us your participation with proper format as per rules.\n" +
                            "Winner : Prizes Worth Rs.1000\n" +
                            "First Runner Up : Prizes Worth Rs.500\n";
                    String l="http://www.espektro.in/media/Directors_Cut.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                }
            } else if (a == "Band-e-Arena") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "We are back with BAND-e-Arena the band competetion.Get a chance to showcase your music skills yet again " +
                            "in ESPEKTRO 2017, the annual cultural & tech fest of KGEC. So hurry up and " +
                            "register asap.";
                    String c = "Prizes worth Rs.15000. ";
                    String l="http://www.espektro.in/media/Band-e-Arena.pdf\n";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                }
            } else if (a == "Dance") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "Almost in an expression of ecstasy, our world of novels will feature some of the most breath-taking performances of all times. Come, dance, lose yourself in our world!";
                    String c = "";
                    String l="http://espektro.kgec.edu.in/events/exotica/#top_bar";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    context.startActivity(intent);
                }
            } else if (a == "Pratibimb") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "Witnessing the magic of Espektro'17 is itself a treat, but when it comes to capturing its flavour..it's no less " +
                            "than beautiful memories";
                    String c = "";
                    String l="http://www.espektro.in/media/Pratibimb.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    intent.putExtra("extra", i);
                    context.startActivity(intent);
                } else if (i == 1) {
                    intent = new Intent(context, Details.class);
                    String s = "We believe that there's a photographer in everyone. So Espektro'17 presents 'Drishti', an online weekly theme " +
                            "based photography contest to bring out the shutterbugs in you.";
                    String c = "";
                    String l="http://espektro.kgec.edu.in/media/Sample_0FbzGaT.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
                    intent = new Intent(context, Details.class);
                    String s = "A new event of its kind, the creative photography contest 'PIC-ASSO' by Espektro'17 which brings out your " +
                            "unique perspective of looking at things. Think out of the box, display the mind-blowig side";
                    String c = "For submission email to: shutterbug@espektro.in";
                    String l="http://espektro.kgec.edu.in/media/PICASSO.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            } else if (a == "La Moda") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "Watch all your favourite characters spin out with a swish, from underneath the heavy covers onto the runway. " +
                            "Glitz and glam is what defines La Moda - The fashion show.";
                    String c = "Event is exclusive for KGEC students.";
                    String l="http://www.espektro.in/media/Sample_dpiFGRv.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    intent.putExtra("extra", i);
                    context.startActivity(intent);
                } else if (i == 1) {
                    intent = new Intent(context, Details.class);
                    String s = "Action speaks louder than words, Dum charade calls forth all you filmy nerds";
                    String c = "";
                    String l="http://www.espektro.in/media/Dumb_Charades.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
                    intent = new Intent(context, Details.class);
                    String s = "Don't fret if u've got no hat or lasso. All budding Indiana Jones are welcomed at the KGEC Treasure Hunt- El Dorado";
                    String c = "";
                    String l="http://www.espektro.in/media/Treasure_Hunt.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
                else if (i == 3) {
                    intent = new Intent(context, Details.class);
                    String s = "Awaz";
                    String c = "";
                    String l="http://espektro.kgec.edu.in/media/Awaz.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            } else if (a == "Zorb Fight") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "Get all your friends together for the Zorb fight. Hit, punch, bounce back and laugh out loud.";
                    String c = "";
                    String l="";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(0));
                    intent.putExtra("extra", i);
                    context.startActivity(intent);
                } else if (i == 1) {
                    intent = new Intent(context, Details.class);
                    String s = "Paint Gun Description";
                    String c = "";
                    String l="";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
                    intent = new Intent(context, Details.class);
                    String s = "The ancient skill of archery has surely not lost its charm, to this day. Show your swag, strike the bull's eye.";
                    String c = "Schedule:\n\t KGEC MSB-108 \n\t 10th feb 10:30 A.M. onwards";
                    String l="";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                } else if (i == 3) {
                    intent = new Intent(context, Details.class);
                    String s = "Straight out from a sleep-over party, to right under the broad day-light. Smash it all out with the Pillow fight.";
                    String c = "";
                    String l="";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            } else if (a == "Mathematicos") {
                if (i == 0) {
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
                    intent.putExtra("title", mListData.get(0));
                    intent.putExtra("extra", i);
                    context.startActivity(intent);
                } else if (i == 1) {
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
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
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
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
                }else if (a == "Brevity Brews") {
                if (i == 0) {
                    intent = new Intent(context, Details.class);
                    String s = "\"'Brevity is the soul of wit' - Shakespeare. \" " +
                            "\n\"Craft out a teensy weensy puny cheeky peachy tale, great prizes to be won!\"";
                    String c = "Registration Fees : Free\nIndividual Participation\nPrizes Worth Rs. 1000";
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    String l="http://espektro.kgec.edu.in/media/Brevity_Brews_2017.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("title", mListData.get(0));
                    intent.putExtra("extra", i);
                    context.startActivity(intent);
                } else if (i == 1) {
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
                    intent.putExtra("title", mListData.get(1));
                    context.startActivity(intent);
                } else if (i == 2) {
                    intent = new Intent(context, Details.class);
                    String s = "\"In this digital age,we have an opportunity to transform lives of people in ways that was hard to imagine a couple of decades ago\" " +
                            "were the words of Sri Narendra Modi while addressing heads of tech giants at Silicon Valley in San Jose."+
                            "Since we are the future of our nation,it is time for us to step up and shoulder this responsibility in realising this Vision set by our respected Prime Minister."+
                            "To support this initiative,Techtix presents ‘Srishti’ which is a platform for budding entrepreneurs to pitch their ideas on Digital India implementation programme."+
                            "The emphasis should be laid on the foundation of a Smart City with special focus on Sanitation,Traffic Management,Healthcare Facilities,IoT and Smart Education.";
                    String c = "";
                    String l="http://espektro.kgec.edu.in/media/Shristi.pdf";
                    intent.putExtra("link",l);
                    intent.putExtra("detail", s);
                    intent.putExtra("schedule", c);
                    intent.putExtra("title", mListData.get(2));
                    context.startActivity(intent);
                }
            }
                else if (a == "Best out of Waste") {
                    if (i == 0) {
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
                        intent.putExtra("title", mListData.get(0));
                        intent.putExtra("extra", i);
                        context.startActivity(intent);
                    } else if (i == 1) {
                        intent = new Intent(context, Details.class);
                        String s = "\"It's not about Ideas, It's about making Ideas happen.\"\n" +
                                "This event is also a new attraction of this year's technical fest. In this event there will be a group of 4 student's(max). Each group will be given a specific product which they have to advertise or promote. The best part is that they have to do the promotion by acting out a skit much like a real life ad campaign.\n";
                        String c = "Date : 9th and 10th March\nTime : 12.00 hrs onwards\nRegistration Fees : Free\nTeam maximum of 2 members\nWinner :Prizes Worth Rs. 1000\nRunner up : Prizes Worth Rs. 500";
                        String l="http://www.espektro.in/media/madads.pdf";
                        intent.putExtra("link",l);
                        intent.putExtra("detail", s);
                        intent.putExtra("schedule", c);
                        intent.putExtra("title", mListData.get(1));
                        context.startActivity(intent);
                    } else if (i == 2) {
                        intent = new Intent(context, Details.class);
                        String s = "\"Painting is silent poetry, and poetry is painting that speaks.\"\n" +
                                "Use your creativity and imagination to paint the masterpiece and be coined as the Picasso of the campus. Design what you think. This time get your ideas on T-shirt. Share them. Wear them.";
                        String c = "";
                        String l="http://www.espektro.in/media/Sample_x37737n.pdf";
                        intent.putExtra("link",l);
                        intent.putExtra("detail", s);
                        intent.putExtra("schedule", c);
                        intent.putExtra("title", mListData.get(2));
                        context.startActivity(intent);
                    }
                }
        }

    }}