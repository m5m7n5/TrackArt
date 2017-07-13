package com.example.reddi.trackart.RecyclerViewClasses.ProfileContentRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reddi.trackart.Model.BaseContent;
import com.example.reddi.trackart.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Reddi on 10/07/2017.
 */

public class ProfileContentAdapter extends RecyclerView.Adapter<ProfileContentViewHolder> {

    ArrayList<BaseContent> contents;

    public ProfileContentAdapter(ArrayList<BaseContent> contents) {

        this.contents = contents;

    }

    @Override
    public ProfileContentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_profile_view_holder, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ProfileContentViewHolder vh = new ProfileContentViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ProfileContentViewHolder holder, int position) {

        holder.title.setText("Title:" + contents.get(position).Title);
        Picasso.with(holder.image.getContext()).load(contents.get(position).ImgUrl).into(holder.image);


    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

}
