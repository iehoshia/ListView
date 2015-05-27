package com.guatemala.api.twitterdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by API on 26/05/2015.
 */
public class TweetAdapter extends ArrayAdapter<Tweet> {

    private LayoutInflater inflater;
    private TextView textView;

    public TweetAdapter(Activity activity, ArrayList<Tweet> items) {
        super(activity, R.layout.row_tweet, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Tweet tweet = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_tweet, parent, false);
        }
        TextView tTitle = (TextView) convertView.findViewById(R.id.titulo);
        tTitle.setText(tweet.title);
        return convertView;

    }






}
