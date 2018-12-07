package com.example.omistaja.lab61;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView=(ListView) findViewById(R.id.list);

        PresidentList listPresident=PresidentList.getPresidentList();
        listPresident.addPresident("Obama",2009,2017,"America");
        listPresident.addPresident("Trump",2017,2018,"America");


        Log.d("here", "I am here");

        ArrayList<String> a=PresidentList.getPresidentList().getAllPresident();

        ArrayAdapter arrayAdapter=new ArrayAdapter(list.this,android.R.layout.simple_list_item_1,a);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(list.this,DetailOfEach.class);
                intent.putExtra("index",position);
                startActivity(intent);
            }
        });



    }


}
