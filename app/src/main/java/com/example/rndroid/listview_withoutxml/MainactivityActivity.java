package com.example.rndroid.listview_withoutxml;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
/*It is only posissble if you have only one view on screen that is ListView and you have to extend ListActivity to achieve this*/


public class MainactivityActivity extends ListActivity {

    String[] s = {"Setting","Ring Tone","Vibration Mode","Display","Screen Saver","App lock","Network","Developer Setting","About"};
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
        setListAdapter(aa);



    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
       super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        Toast.makeText(this, ""+o.toString(), Toast.LENGTH_SHORT).show();
    }
}
