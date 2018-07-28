package com.example.android.mytourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class CityInfoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.blanc,R.string.city_info1, R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info2,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info3,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info4,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info5,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info6,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info7,R.drawable.fact));
        items.add(new Item(R.string.blanc,R.string.city_info8,R.drawable.fact));

        ItemAdapter adapter = new ItemAdapter(this, items, R.color.mainColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


            }


}