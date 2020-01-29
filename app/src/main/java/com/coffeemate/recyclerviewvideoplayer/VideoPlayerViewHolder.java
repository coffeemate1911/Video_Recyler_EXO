package com.coffeemate.recyclerviewvideoplayer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.coffeemate.recyclerviewvideoplayer.models.MediaObject;


public class VideoPlayerViewHolder extends RecyclerView.ViewHolder {

    FrameLayout media_container;
    TextView title;
    ImageView thumbnail, volumeControl;
    ProgressBar progressBar;
    View parent;
    RequestManager requestManager;

    public VideoPlayerViewHolder(@NonNull View itemView) {
        super(itemView);
        parent = itemView;
        media_container = itemView.findViewById(com.coffeemate.recyclerviewvideoplayer.R.id.media_container);
        thumbnail = itemView.findViewById(com.coffeemate.recyclerviewvideoplayer.R.id.thumbnail);
        title = itemView.findViewById(com.coffeemate.recyclerviewvideoplayer.R.id.title);
        progressBar = itemView.findViewById(com.coffeemate.recyclerviewvideoplayer.R.id.progressBar);
        volumeControl = itemView.findViewById(com.coffeemate.recyclerviewvideoplayer.R.id.volume_control);
    }
    //Using a Glide Binder // Using Requestmanager object default glide parameters
    public void onBind(MediaObject mediaObject, RequestManager requestManager) {
        this.requestManager = requestManager;
        parent.setTag(this);
        title.setText(mediaObject.getTitle());
        this.requestManager
                .load(mediaObject.getThumbnail())
                .into(thumbnail);
    }

}














