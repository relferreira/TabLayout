package com.relferreira.tablayout.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.relferreira.tablayout.R;



public class TabFragment extends Fragment {

    public static String ARG_POSITION = "arg_position";

    public TabFragment(){}

    public static TabFragment newInstance(int postion){
        Bundle parameters = new Bundle();
        parameters.putInt(ARG_POSITION, postion);
        TabFragment frag = new TabFragment();
        frag.setArguments(parameters);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View fragView = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView text = (TextView) fragView.findViewById(R.id.frag_text);
        text.setText(String.format(getActivity().getResources().getString(R.string.frag_message), getArguments().getInt(ARG_POSITION)));
        return fragView;
    }
}

