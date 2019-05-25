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

public class AbcFragment3 extends Fragment {
        Fragment fragmentabc5;
        Fragment fragmentabc6;
        Fragment fragmentabc7;
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            fragmentabc5 = new AbcFragment2();
            View v = inflater.inflate(R.layout.fragment_abc3, null);
            Button button1 = (Button) v.findViewById(R.id.buttonabc14);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.add(R.id.fragment_container, fragmentabc5);
                    transaction.commit();
                }

            });
            Button button2 = (Button) v.findViewById(R.id.buttonabc4);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentabc6 = new AbcFragment4();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.add(R.id.fragment_container, fragmentabc6);
                    transaction.commit();
                }
            });
            Button button3 = (Button) v.findViewById(R.id.buttonabc1223);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentabc7 = new AbcFragment2();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.add(R.id.fragment_container, fragmentabc7);
                    transaction.commit();
                }
            });
            Button button4 = (Button) v.findViewById(R.id.buttonabc3up);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentabc6 = new AbcFragment4();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.add(R.id.fragment_container, fragmentabc6);
                    transaction.commit();
                }
            });return v;

        }
    }

