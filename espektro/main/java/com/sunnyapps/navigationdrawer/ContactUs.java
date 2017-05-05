package com.sunnyapps.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ContactUs extends AppCompatActivity {
    ListView list2;
    ListAdapter6 adapter;
    String[] name1 = {"OVERALL CO-ORDINATOR","TECHTIX CO-ORDINATOR","SPONSORSHIP AND FINANCE","PROMOTION AND MARKETING","EVENTS MANAGER","PRONITES","TECHNICAL SUPPORT","CREATIVES AND DESIGN","SECURITY AND ONGROUND MANAGEMENT","HOSPITALITY AND PR"};
    String[] name2 = {"name1\name1@espektro.in\n ","name2\name2@espektro.in \n ","name3\n name3@espektro.in\n ",
    "name4\nname4@espektro.in\n ","name5\nname5@espektro.in\n ",
    "name6\n name6@espektro.in\n ","name7\nname7@espektro.in\n ", "name8\n name8@espektro.in\n ",
    "name9\n name9@espektro.in\n ","name10\name10@espektro.in\n "};
    String[] name3 = {"","name11\nname11@espektro.in\n ","name12\ndebashish@espektro.in\n ","","name12\ndwip@espektro.in\n ",
            "name13\nname13@espektro.in\n ","name13\nname14@espektro.in\n ","name15\nname15@espektro.in\n ","",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        list2 = (ListView) findViewById(R.id.list6);
        adapter = new ListAdapter6(getApplicationContext(), R.layout.list4);
        int i=0;
        list2.setAdapter(adapter);
        for(String Name : name1){
            ListModel3 obj=new ListModel3(Name,name2[i],name3[i]);
            i++;
            adapter.add(obj);

        }
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
