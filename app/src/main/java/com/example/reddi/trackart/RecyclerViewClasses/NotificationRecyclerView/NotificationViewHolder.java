package com.example.reddi.trackart.RecyclerViewClasses.NotificationRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.reddi.trackart.R;

import org.w3c.dom.Text;

/**
 * Created by Reddi on 10/07/2017.
 */

public class NotificationViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView fromUser;
    public TextView description;
    public ImageView checkButton;
    public ImageView discardButton;

    public View background;


    public NotificationViewHolder(View itemView) {
        super(itemView);

        background = itemView.findViewById(R.id.notification_background);
        image = (ImageView) itemView.findViewById(R.id.notification_image);
        fromUser = (TextView) itemView.findViewById(R.id.notification_from_user);
        description = (TextView) itemView.findViewById(R.id.notification_description);
        checkButton = (ImageView) itemView.findViewById(R.id.notification_check_button);
        discardButton = (ImageView) itemView.findViewById(R.id.notification_discard_button);

    }

}
