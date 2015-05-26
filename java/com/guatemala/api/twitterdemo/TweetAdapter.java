package com.guatemala.api.twitterdemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by API on 26/05/2015.
 */
public class TweetAdapter extends ArrayAdapter {

    private LayoutInflater inflater;

    public TweetAdapter(Activity activity, String[] items) {
        super(activity, R.layout.row_tweet, items );
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return inflater.inflate(R.layout.row_tweet, parent, false);
    }
}
