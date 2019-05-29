package ru.startandroid.cookdev1.FragmentTask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.startandroid.cookdev1.R;

public class Zad7Fragment extends Fragment {
    Fragment fragmentzad8;
    Fragment fragmentzad9;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentzad8 = new Zad8Fragment();

        View v = inflater.inflate(R.layout.fragment_zad7, null);


        final Button button1 = (Button) v.findViewById(R.id.buttonzadnext7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragmentzad8);
                transaction.commit();}

        });


        Button button2 = (Button) v.findViewById(R.id.buttonzadBack7);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentzad9 = new Zad6Fragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, fragmentzad9);
                transaction.commit();
            }
        });


        final EditText textTolkushka = (EditText) v.findViewById(R.id.shumovka);

        final Button buttonCheck = (Button) v.findViewById(R.id.buttonzadcheck7);
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String answer2 = "Половник";
                String answer1 = "Половник";
                boolean answer = false;
                if(TextUtils.isEmpty(textTolkushka.getText().toString())){
                    Toast toast = Toast.makeText(getContext(),"Ты не ответил!",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(false);
                }
                else if (textTolkushka.getText().toString().equals("растительное")){
                    Toast toast = Toast.makeText(getContext(),"Верно!",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(true);
                }else {
                    Toast toast = Toast.makeText(getContext(),"Подсказка: растительное",Toast.LENGTH_LONG);
                    toast.show();
                    button1.setClickable(false);
                }
            }
        });
        return v;



    }
}