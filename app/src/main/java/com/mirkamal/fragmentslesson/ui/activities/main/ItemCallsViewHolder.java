package com.mirkamal.fragmentslesson.ui.activities.main;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;

public class ItemCallsViewHolder extends RecyclerView.ViewHolder {

    private TextView username, time;

    public ItemCallsViewHolder(@NonNull View itemView) {
        super(itemView);

        username = itemView.findViewById(R.id.text_view_name);
        time = itemView.findViewById(R.id.text_view_time);
    }

    public void bindItems(Chat chat) {

        username.setText(chat.getSenderName());
        time.setText("Today, " + chat.getTime());

    }
}
