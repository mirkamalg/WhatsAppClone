package com.mirkamal.fragmentslesson.ui.activities.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;

import java.util.Collections;
import java.util.List;

public class CallsRecyclerViewAdapter extends RecyclerView.Adapter<ItemCallsViewHolder> {

    List<Chat> chats;

    @NonNull
    @Override
    public ItemCallsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_calls, parent, false);

        return new ItemCallsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCallsViewHolder holder, int position) {
        holder.bindItems(chats.get(position));
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public void submitList(List<Chat> chats) {
        this.chats = chats;
        Collections.shuffle(this.chats);
        notifyDataSetChanged();
    }
}
