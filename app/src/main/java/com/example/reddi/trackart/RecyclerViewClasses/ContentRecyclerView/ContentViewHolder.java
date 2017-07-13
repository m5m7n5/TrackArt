package com.example.reddi.trackart.RecyclerViewClasses.ContentRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.example.reddi.trackart.R;

/**
 * Created by Reddi on 09/07/2017.
 */

public class ContentViewHolder extends RecyclerView.ViewHolder {

    public ImageView contentImage;
    public TextView contentTitle;
    public TextView contentDescription;

    public ImageView swipeButton;

    public SwipeRevealLayout swipeLayout;

    public View backgroundView;

    public ContentViewHolder(View itemView) {
        super(itemView);
        contentImage = (ImageView) itemView.findViewById(R.id.content_image);
        contentTitle = (TextView) itemView.findViewById(R.id.content_title);
        contentDescription = (TextView) itemView.findViewById(R.id.content_description);
        swipeLayout = (SwipeRevealLayout) itemView.findViewById(R.id.swipe_layout);
        swipeButton = (ImageView) itemView.findViewById(R.id.swipe_button);

        backgroundView = itemView.findViewById(R.id.content_background);

        swipeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //True para que haga la animacion
                swipeLayout.open(true);
            }
        });
    }

}
