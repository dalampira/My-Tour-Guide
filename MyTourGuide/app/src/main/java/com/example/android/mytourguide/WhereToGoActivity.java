package com.example.android.mytourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WhereToGoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);



        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.to_go_explan1, R.string.to_go_info1, R.drawable.whitetower));
        items.add(new Item(R.string.to_go_explan2, R.string.to_go_info2, R.drawable.alexander));
        items.add(new Item(R.string.to_go_explan3, R.string.to_go_info3, R.drawable.aristotelous));
        items.add(new Item(R.string.to_go_explan4, R.string.to_go_info4, R.drawable.agiassofias));
        items.add(new Item(R.string.to_go_explan5, R.string.to_go_info5, R.drawable.modiano));
        items.add(new Item(R.string.to_go_explan6, R.string.to_go_info6, R.drawable.ladadika));
        items.add(new Item(R.string.to_go_explan7, R.string.to_go_info7, R.drawable.museum));
        items.add(new Item(R.string.to_go_explan8, R.string.to_go_info8, R.drawable.anopoli));
        items.add(new Item(R.string.to_go_explan9, R.string.to_go_info9, R.drawable.kamara));
        items.add(new Item(R.string.to_go_explan10, R.string.to_go_info10, R.drawable.roman));


        ItemAdapter adapter = new ItemAdapter(this, items, R.color.mainColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}