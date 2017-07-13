package com.example.reddi.trackart.RecyclerViewClasses.FriendsRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Reddi on 12/07/2017.
 */

public class FriendsViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView userName;
    public TextView userInformation;
    public ImageView viewProfileButton;
    public ImageView deleteFrienButton;

    public FriendsViewHolder(View itemView) {
        super(itemView);
    }

}
