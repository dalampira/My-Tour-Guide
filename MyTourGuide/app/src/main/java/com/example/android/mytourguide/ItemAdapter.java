package com.example.android.mytourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sissy on 6/7/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int mColorResourceId;

    public ItemAdapter(Context context, ArrayList<Item> pItems, int colorResourceId)
    {
        super(context,0, pItems);
        mColorResourceId=colorResourceId;
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_city_info, parent, false);
        }
        Item local_item = getItem(position);
        TextView infoTextView = (TextView) listItemView.findViewById(R.id.information_text_view);
        infoTextView.setText(local_item.getInformation());
        TextView explanationTextView = (TextView) listItemView.findViewById(R.id.explanation_text_view);
        explanationTextView.setText(local_item.getExplanation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(local_item.hasImage()){
            imageView.setImageResource(local_item.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;

    }
}

