package com.mirkamal.fragmentslesson.ui.fragments.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;
import com.mirkamal.fragmentslesson.ui.activities.main.ChatsRecyclerViewAdapter;
import com.mirkamal.fragmentslesson.ui.activities.main.FakeDataBase;

public class FirstFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler_view_chats);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ChatsRecyclerViewAdapter adapter = new ChatsRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);

        adapter.submitList(new FakeDataBase().getChats());
    }
}
