package com.mirkamal.fragmentslesson.ui.activities.main;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;

public class ItemChatsViewHolder extends RecyclerView.ViewHolder {

    private TextView username, message, time;

    public ItemChatsViewHolder(@NonNull View itemView) {
        super(itemView);

        username = itemView.findViewById(R.id.text_view_name);
        message = itemView.findViewById(R.id.text_view_message);
        time = itemView.findViewById(R.id.text_view_time);

    }

    public void bindItems(Chat chat) {
        username.setText(chat.getSenderName());
        message.setText(chat.getMessage());
        time.setText(chat.getTime());
    }
}
