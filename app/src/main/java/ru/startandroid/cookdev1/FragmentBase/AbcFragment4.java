package ru.startandroid.cookdev1.FragmentBase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ru.startandroid.cookdev1.R;

public class AbcFragment4 extends Fragment {
    Fragment fragmentabc6;
    Fragment fragmentabc7;
    Fragment fragmentabc8;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentabc6 = new AbcFragment4();
        View v = inflater.inflate(R.layout.fragment_abc4, null);
        Button button2 = (Button) v.findViewById(R.id.buttonabc5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentabc7 = new AbcFragment3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc7);
                transaction.commit();
            }
        });
        Button button3 = (Button) v.findViewById(R.id.buttonabc1321);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentabc8 = new AbcFragment3();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentabc8);
                transaction.commit();
            }
        });return v;

    }
}
