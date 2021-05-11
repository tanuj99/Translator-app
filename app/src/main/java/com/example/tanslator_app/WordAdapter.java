package com.example.tanslator_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorResourceId;

    public  WordAdapter(Activity context, ArrayList<Word> words , int colorResourceId) {
        super(context,0,words);
        mcolorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);


        TextView frenchTextView =  listItemView.findViewById(R.id.french_text_view);
        frenchTextView.setText(currentWord.getMfrenchTrans());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getMdefaultTrans());

        ImageView imageResource = listItemView.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
            imageResource.setImageResource(currentWord.getMimageId());
            imageResource.setVisibility(View.VISIBLE);
        }
        else imageResource.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(),mcolorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;



        //return super.getView(position, convertView, parent);
    }
}
