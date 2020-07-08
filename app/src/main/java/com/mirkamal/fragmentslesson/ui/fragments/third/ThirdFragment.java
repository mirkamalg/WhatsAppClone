package com.mirkamal.fragmentslesson.ui.fragments.third;

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
import com.mirkamal.fragmentslesson.ui.activities.main.CallsRecyclerViewAdapter;
import com.mirkamal.fragmentslesson.ui.activities.main.FakeDataBase;

public class ThirdFragment extends Fragment {

    private RecyclerView recyclerViewCalls;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewCalls = view.findViewById(R.id.recycler_view_calls);

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        recyclerViewCalls.setLayoutManager(new LinearLayoutManager(getContext()));

        CallsRecyclerViewAdapter adapter = new CallsRecyclerViewAdapter();
        recyclerViewCalls.setAdapter(adapter);

        adapter.submitList(new FakeDataBase().getChats());
    }
}
