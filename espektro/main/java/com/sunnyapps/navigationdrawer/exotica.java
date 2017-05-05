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


public class exotica extends Fragment {
CollapsingToolbarLayout cp;
    private ListAdapter mAdapter;

    private String mItemData = "Music  Dance  Photography  Film-Making  Informals  Fun Zone  Miscellaneous";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exotica, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(
                R.id.fragment_list_rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        String[] listItems = mItemData.split("  ");

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, listItems);

        mAdapter = new ListAdapter(list);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}