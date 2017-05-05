package com.sunnyapps.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.CollapsingToolbarLayout;
import java.util.*;


public class Day2 extends Fragment {

    private ScheduleAdapter2 mAdapter;

    private String mItemData = "Robo_T_Racer  Turbulance  WrestleMania  Robo Soccer  CS 1.6  Have your Say  Cryptography  CheckMate  Circuit-O-Genesis  Mad Ads";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.day2, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(
                R.id.fragment_list_rv_day2);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        String[] listItems = mItemData.split("  ");

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, listItems);

        mAdapter = new ScheduleAdapter2(list);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}