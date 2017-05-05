package com.sunnyapps.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class accc extends AppCompatActivity {
    ListView list;
    ListAdapter3 adapter;
    String[] name = {"Day 1","Day 2", "Day 3"};
    int[] images={R.drawable.day1,R.drawable.day2,R.drawable.day3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        list = (ListView) findViewById(R.id.list);
        adapter = new ListAdapter3(getApplicationContext(), R.layout.list_item2);
        int i=0;
        list.setAdapter(adapter);
        for(String Name : name){
            ListModel obj=new ListModel(images[i],Name);
            i++;
            adapter.add(obj);

        }
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                if(position==0){
                    Intent i=new Intent(accc.this,pronit.class);
                    i.putExtra("day",1);

                    startActivity(i);
                }
                else if(position==1){
                    Intent i=new Intent(accc.this,pronit.class);
                    i.putExtra("day",2);
                    startActivity(i);

                }

                else if(position==2){
                    Intent i=new Intent(accc.this,pronit.class);
                    i.putExtra("day",3);
                    startActivity(i);

                }
            }

        });

        }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
