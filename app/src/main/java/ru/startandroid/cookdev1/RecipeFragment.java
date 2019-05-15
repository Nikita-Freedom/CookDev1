package ru.startandroid.cookdev1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecipeFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    //RecyclerView recyclerView;
    //RecyclerView.LayoutManager layoutManager;
    //RecyclerView.Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.shaurma, "Шаурма", "Рецепт"));
        exampleList.add(new ExampleItem(R.drawable.abcmid1, "Котлеты", "Рецепт"));
        exampleList.add(new ExampleItem(R.drawable.abcmid2, "Мясо", "Рецепт"));


        exampleList.add(new ExampleItem(R.drawable.shaurma, "жопа", "Рецепт"));
        exampleList.add(new ExampleItem(R.drawable.abcmid1, "писька", "Рецепт"));
        exampleList.add(new ExampleItem(R.drawable.abcmid2, "Мясо", "Рецепт"));

        View v = inflater.inflate(R.layout.fragment_recipe, null);
        mRecyclerView = v.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        //Toolbar toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);

        //recyclerView = v.findViewById(R.id.recycler_view);
        //layoutManager = new LinearLayoutManager(this);
        //recyclerView.setLayoutManager(layoutManager);
        //adapter = new RecyclerAdapter();
        //recyclerView.setAdapter(adapter);
        return v;
    }

}
