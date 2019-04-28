package ru.startandroid.cookdev1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AbcFragment2 extends Fragment {
    Fragment fragmentabc4;
    Fragment fragmentabc5;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentabc4 = new AbcFragment1();
        View v = inflater.inflate(R.layout.fragment_abc2, null);
        Button button1 = (Button) v.findViewById(R.id.buttonabc13);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc4);
                transaction.commit();
            }

        });
        Button button2 = (Button) v.findViewById(R.id.buttonabc3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentabc5 = new AbcFragment3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc5);
                transaction.commit();
            }
        });return v;

    }
}
