package com.example.reddi.trackart.RecyclerViewClasses.ContentRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reddi.trackart.Model.BaseContent;
import com.example.reddi.trackart.Model.ContentType;
import com.example.reddi.trackart.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Reddi on 09/07/2017.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {

    ArrayList<BaseContent> contents;

    public ContentAdapter(ArrayList<BaseContent> contents) {

        this.contents = contents;

    }

    @Override
    public ContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_view_holder, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ContentViewHolder vh = new ContentViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ContentViewHolder holder, int position) {

        holder.contentTitle.setText("Title:" + contents.get(position).Title);
        holder.contentDescription.setText("Description:" + contents.get(position).Description);
        Picasso.with(holder.contentImage.getContext()).load(contents.get(position).ImgUrl).into(holder.contentImage);

        holder.backgroundView.setBackgroundColor(ContentType.getAsociatedColor(contents.get(position).ctype, holder.backgroundView.getContext()));

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

}
