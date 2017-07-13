package com.example.reddi.trackart.RecyclerViewClasses.NotificationRecyclerView;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reddi.trackart.Model.ContentType;
import com.example.reddi.trackart.Model.Notification;
import com.example.reddi.trackart.Model.NotificationType;
import com.example.reddi.trackart.R;
import com.example.reddi.trackart.RecyclerViewClasses.ContentRecyclerView.ContentViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Reddi on 10/07/2017.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationViewHolder> {

    ArrayList<Notification> list;

    public NotificationAdapter(ArrayList<Notification> itemList) {
        list = itemList;
    }

    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_view_holder, parent, false);
        // set the view's size, margins, paddings and layout parameters
        NotificationViewHolder vh = new NotificationViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, int position) {
        Notification item = list.get(position);

        holder.fromUser.setText(item.getFrom().getName());

        switch (item.getType()) {
            case FRIENDREQUEST:
                holder.background.setBackgroundColor(ContextCompat.getColor(holder.background.getContext(),R.color.softgrey));
                holder.description.setText(NotificationType.getDescription(NotificationType.FRIENDREQUEST, item.getFrom().getName()));
                Picasso.with(holder.image.getContext()).load(item.getFrom().getUserPic()).into(holder.image);
                break;
            case RECOMMENDATION:
                holder.background.setBackgroundColor(ContentType.getAsociatedColor(item.getContent().ctype, holder.background.getContext()));
                holder.description.setText(NotificationType.getDescription(NotificationType.RECOMMENDATION, item.getFrom().getName()));
                Picasso.with(holder.image.getContext()).load(item.getContent().ImgUrl).into(holder.image);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
