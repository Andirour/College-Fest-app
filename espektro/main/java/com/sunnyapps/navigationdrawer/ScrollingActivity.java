package com.sunnyapps.navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScrollingActivity extends AppCompatActivity {

    private ListAdapter4 mAdapter;
    ImageView toolBack;
    CollapsingToolbarLayout cp2;
    String[] listRobo = {"Robo_T_Racer","Turbulance","WrestleMania","Robo Soccer"};
    String[] listcode = {"Code Dictator","Bug of Debug"};
    String[] listgame = {"NFS","FIFA 11","CS 1.6"};
    String[] listquizzard = {"Inquizimania","Muse the Moot","Have your Say"};
    String[] liston = {"Cryptography"};
    String[] listbusi = {"Case Study"};
    String[] listfilm = {"Director's Cut"};
    String[] listmusic = {"Band-e-Arena"};
    String[] listdance = {"Dance"};
    String[] listphoto = {"Pratibimb","Drishti","Pic-Asso"};
    String[] listinfrm = {"La Moda","Dumb Charades","Treasure Hunt","Awaz"};
    String[] listfun = {"Zorb Fight","Paint Gun","Archery","Pillow Fighting"};
    String[] listsolve = {"Mathematicos","Sudoku","CheckMate"};
    String[] listMisct = {"Brevity Brews","Circuit-O-Genesis","Shristi"};
    String[] listMisce = {"Best out of Waste","Mad Ads","Paint-T"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cp2=(CollapsingToolbarLayout)findViewById(R.id.toolbar_layout2) ;
        cp2.setTitle("Robo");
        toolBack=(ImageView)cp2.findViewById(R.id.header2);
        final int s = getIntent().getIntExtra("extra", 0);

        toolBack.setImageResource(R.drawable.glow_rays);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.fragment_list_rv4);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        List<String> list = new ArrayList<String>();
        if(s==0) {
            cp2.setTitle("Robotics");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listRobo);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==1){
            cp2.setTitle("Coding");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listcode);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==2){
            cp2.setTitle("Gaming");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listgame);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==3){
            cp2.setTitle("Online");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, liston);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==4){
            cp2.setTitle("Quizzard");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listquizzard);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==5){
            cp2.setTitle("Business");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listbusi);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==6){
            cp2.setTitle("Solve it");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listsolve);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==7){
            cp2.setTitle("Miscellaneous");
            toolBack.setImageResource(R.drawable.techtix);
            Collections.addAll(list, listMisct);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==8){
            cp2.setTitle("Music");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listmusic);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==9){
            cp2.setTitle("Dance");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listdance);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==10){
            cp2.setTitle("photography");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listphoto);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==11){
            cp2.setTitle("Film making");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listfilm);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==12){
            cp2.setTitle("Informals");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listinfrm);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==13){
            cp2.setTitle("Fun Zone");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listfun);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
        else if(s==14){
            cp2.setTitle("Miscellaneous");
            toolBack.setImageResource(R.drawable.exotica);
            Collections.addAll(list, listMisce);
            mAdapter = new ListAdapter4(list);
            recyclerView.setAdapter(mAdapter);
        }
    }
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
