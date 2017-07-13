package com.example.reddi.trackart.RecyclerViewClasses.ProfileContentRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reddi.trackart.R;

/**
 * Created by Reddi on 10/07/2017.
 */

public class ProfileContentViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView title;

    public ProfileContentViewHolder(View itemView) {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.profile_content_holder_image);
        title = (TextView) itemView.findViewById(R.id.profile_content_holder_text);

    }

}
