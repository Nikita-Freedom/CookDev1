package ru.startandroid.cookdev1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.List;

public class AbcFragment1 extends Fragment {
    Fragment fragmentabc2;
    Fragment fragmentabc3;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentabc2 = new AbcFragment();
        View v = inflater.inflate(R.layout.fragment_abc1, null);
        Button button1 = (Button) v.findViewById(R.id.buttonabc1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc2);
                transaction.commit();
            }

        });
        Button button2 = (Button) v.findViewById(R.id.buttonabc2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentabc3 = new AbcFragment2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc3);
                transaction.commit();
            }
        });return v;

    }
}
