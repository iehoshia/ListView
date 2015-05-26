package com.guatemala.api.twitterdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity{

    //private ListView listView;
    private TweetAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tweetItemArrayAdapter = new TweetAdapter(this, new String[10]);
        // listView = (ListView)findViewById(R.id.list);
        // listView.setAdapter(tweetItemArrayAdapter);
        setListAdapter(tweetItemArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        //TextView t = (TextView) v.findViewById(R.id.titulo);
        //t.setText("Usted hizo clic aquí");
        Intent intent = new Intent(this, TweetDetail.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
