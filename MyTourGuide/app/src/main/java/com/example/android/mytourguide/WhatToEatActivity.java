package com.example.android.mytourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WhatToEatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.blanc,R.string.to_eat1, R.drawable.koulourieat));
        items.add(new Item(R.string.blanc,R.string.to_eat2, R.drawable.mpougatsa));
        items.add(new Item(R.string.blanc,R.string.to_eat3, R.drawable.trigona));
        items.add(new Item(R.string.blanc,R.string.to_eat4, R.drawable.tsoureki));
        items.add(new Item(R.string.blanc,R.string.to_eat5, R.drawable.keftedakia));
        items.add(new Item(R.string.blanc,R.string.to_eat6, R.drawable.dolmdakia));
        items.add(new Item(R.string.blanc,R.string.to_eat7, R.drawable.roxakia));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.mainColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}