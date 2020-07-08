package com.mirkamal.fragmentslesson.ui.fragments.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mirkamal.fragmentslesson.R;
import com.mirkamal.fragmentslesson.ui.activities.main.FakeDataBase;
import com.mirkamal.fragmentslesson.ui.activities.main.StatusesRecyclerViewAdapter;

public class SecondFragment extends Fragment {

    private RecyclerView recyclerViewStatuses;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewStatuses = view.findViewById(R.id.recycler_view_statuses);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerViewStatuses.setLayoutManager(new LinearLayoutManager(getContext()));

        StatusesRecyclerViewAdapter adapter = new StatusesRecyclerViewAdapter();
        recyclerViewStatuses.setAdapter(adapter);

        adapter.submitList(new FakeDataBase().getChats());
    }
}
