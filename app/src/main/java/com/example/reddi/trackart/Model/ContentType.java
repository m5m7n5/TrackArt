package com.example.reddi.trackart.Model;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import com.example.reddi.trackart.R;

/**
 * Created by Reddi on 09/07/2017.
 */

public enum ContentType {
    FILM,
    ANIME,
    COMIC_MANGA,
    SERIES,
    BOOKS,
    GAMES;

    public static int getAsociatedColor(ContentType c,Context context){
        switch(c){
            case FILM:
                return ContextCompat.getColor(context,R.color.softFilm);
            case ANIME:
                return ContextCompat.getColor(context,R.color.softAnime);
            case COMIC_MANGA:
                return ContextCompat.getColor(context,R.color.softManga);
            case SERIES:
                return ContextCompat.getColor(context,R.color.softSeries);
            case BOOKS:
                return ContextCompat.getColor(context,R.color.softBook);
            case GAMES:
                return ContextCompat.getColor(context,R.color.softGame);
            default:
                return 0;
        }

    }


}
