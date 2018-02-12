package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NEW TECH on 2/9/2018.
 */

public class WordAdpater extends ArrayAdapter<Word> {
    private int colorResourceId;
    public WordAdpater(Activity context, ArrayList<Word> words, int Color) {

        super( context, 0, words );
        colorResourceId =Color;
    }

    private static final String LOG_TAG = WordAdpater.class.getSimpleName();

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_item, parent, false );
        }
        View linearLayout =(LinearLayout) listItemView.findViewById( R.id.layout_view_group ) ;
        int color = ContextCompat.getColor( getContext(),colorResourceId );
        linearLayout.setBackgroundColor(color);
        Word currentAndroidWord = getItem( position );
        TextView defaultTextView = (TextView) listItemView.findViewById( R.id.mdefault );
        TextView miwokTextView = (TextView) listItemView.findViewById( R.id.miwok );
        ImageView imageForWord = (ImageView) listItemView.findViewById(R.id.image );
        defaultTextView.setText( currentAndroidWord.getDefault() );
        miwokTextView.setText( currentAndroidWord.getMiwok() );
        if(currentAndroidWord.hasImage()) {
            imageForWord.setImageResource( currentAndroidWord.getImageResourceID() );
        }
        else{
            imageForWord.setVisibility( View.GONE );
        }

        return listItemView;
    }
}