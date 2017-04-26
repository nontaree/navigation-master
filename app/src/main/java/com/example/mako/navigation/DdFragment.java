package com.example.mako.navigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DdFragment extends Fragment {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    public DdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dd, null);
        listView = (ExpandableListView) rootView.findViewById(R.id.lvExp);

        initData();

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listHash);
        listView.setAdapter(listAdapter);
        return rootView;
//
//        return inflater.inflate(R.layout.fragment_dd, container, false);
    }

//    @Override
//    public void onViewCreated(View view,Bundle savedInstanceState){
//        super.onViewCreated(view,savedInstanceState);
//
//        listView = (ExpandableListView) listView.findViewById(R.id.lvExp);
//        initData();
//        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
//        listView.setAdapter(listAdapter);
//
//    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("ประกาศนียบัตรเวชกิจฉุกเฉิน");
        listDataHeader.add("ประกาศนียบัตรพยาบาลศาสตร์และผดุงครรภ์ชั้นสูง");
//        listDataHeader.add("C");
//        listDataHeader.add("D");


        List<String> expan = new ArrayList<>();
        expan.add("พยาบาลศาสตร์และผดุงศรรภ์ชั้นสูง");
        expan.add("วิทยาลัยพยาบาลบรมราชนนี กรุงเทพ");
        expan.add("2530 -2535");

        List<String> android = new ArrayList<>();
        android.add("พยาบาลศาสตร์และผดุงศรรภ์ชั้นสูง");
        android.add("วิทยาลัยพยาบาลบรมราชนนี กรุงเทพ");
        android.add("2530 -2535");

//        List<String> secure = new ArrayList<>();
//        secure.add("secure Expandable ListView");
//        secure.add("secure Google Map");
//        secure.add("secure Application");
//        secure.add("secure Line");
//
//        List<String> data = new ArrayList<>();
//        data.add("data Expandable ListView");
//        data.add("data Google Map");
//        data.add("data Application");
//        data.add("data Line");

        listHash.put(listDataHeader.get(0), expan);
        listHash.put(listDataHeader.get(1), android);
//        listHash.put(listDataHeader.get(2), secure);
//        listHash.put(listDataHeader.get(3), data);

    }
}
