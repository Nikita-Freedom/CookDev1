package ru.startandroid.cookdev1.FragmentTask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ru.startandroid.cookdev1.R;

public class ZadMidFragment extends Fragment{
    Fragment fragment1mid1;
    private TextView text;
    private TextView text1;
    private ImageView image;
    private ImageView image1;
    private int score;
    private int score1;
    private boolean flag;

    private static final String SCORE_KEY = "123";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null)
            score = 0;
        else
            score = savedInstanceState.getInt("score", 0);
    }

    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        fragment1mid1 = new ZadMidFragment();
        View v = inflater.inflate(R.layout.fragment_zad_mid, null);
        text = v.findViewById(R.id.text);
        text1 = v.findViewById(R.id.text1);
        image = v.findViewById(R.id.btn);
        image1 = v.findViewById(R.id.btn1);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyLog", "меня таки нажали, да...");
                score1++;

                if (flag)
                    image1.setImageDrawable(getResources().getDrawable(R.drawable.lisapovar));

                flag = !flag;
                text1.setText(String.valueOf(score1));
                if(score1 == 50)
                    image1.setClickable(false);

            }

        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MyLog", "меня таки нажали, да...");
                score++;

                if (flag)
                    image.setImageDrawable(getResources().getDrawable(R.drawable.lisapovar));

                flag = !flag;
                text.setText(String.valueOf(score));
                if(score == 50)
                    image.setClickable(false);

            }

        });
        return v;
    }
     @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_KEY, score);
    }

    private void onRestoreInstanceState(Bundle savedInstanceState){
        score = savedInstanceState.getInt(SCORE_KEY);
        text.setText(String.valueOf(score));
        text1.setText(String.valueOf(score1));
        }
     }



