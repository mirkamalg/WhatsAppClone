package com.mirkamal.fragmentslesson.ui.activities.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;

import java.util.List;

public class ChatsRecyclerViewAdapter extends RecyclerView.Adapter<ItemChatsViewHolder> {

    List<Chat> chats;

    @NonNull
    @Override
    public ItemChatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_chats, parent, false);

        return new ItemChatsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemChatsViewHolder holder, int position) {
        holder.bindItems(chats.get(position));
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public void submitList(List<Chat> chats) {
        this.chats = chats;
        notifyDataSetChanged();
    }
}
