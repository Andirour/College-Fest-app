package com.sunnyapps.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class pronit extends AppCompatActivity {
    ListView list1;
    ListAdapter5 adapter;
    String[] name1 = {"FAKIRA"};
    String[] name2 = {"SHIRLEY SETIA","CHRONIC XORN"};
    String[] name3 = {"NAKASH AZIZ","THE DEEPAK RATHORE PROJECT", "THE RADICAL ARRAY PROJECT"};
    String[] detl1 = {"Date : 9th March 2017\nTime : 24 Hrs 00 Mins"};
    String[] detl2 = {"Date : 10th March 2017\nTime : 22 Hrs 00 Mins", "Date : 10th March 2017\nTime : 24 Hrs 00 Mins"};
    String[] detl3 = {"Date : 11th March 2017\nTime : 20 Hrs 00 Mins","Date : 11th March 2017\nTime : 23 Hrs 00 Mins", "Date : 12th March 2017\nTime : 02 Hrs 00 Mins"};
    int[] images1={R.drawable.fakira};
    int[] images2={R.drawable.shirley_setia,R.drawable.chronic_xorn};
    int[] images3={R.drawable.nakash,R.drawable.deepak_rathore,R.drawable.trapcopy};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronit);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        list1 = (ListView) findViewById(R.id.listpro);
        adapter = new ListAdapter5(getApplicationContext(), R.layout.list3);

        int j=getIntent().getExtras().getInt("day");
        list1.setAdapter(adapter);
        if(j==1){
            int i=0;
        for(String Name : name1){
            ListModel2 obj=new ListModel2(images1[i],Name,detl1[i]);
            i++;
            adapter.add(obj);}
        }
        else if(j==2){
            int i=0;
            for(String Name : name2){
                ListModel2 obj=new ListModel2(images2[i],Name,detl2[i]);
                i++;
                adapter.add(obj);}
        }
        else if(j==3){
            int i=0;
            for(String Name : name3){
                ListModel2 obj=new ListModel2(images3[i],Name,detl3[i]);
                i++;
                adapter.add(obj);}
        }
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
