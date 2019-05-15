package ru.startandroid.cookdev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRecipe extends AppCompatActivity {
    TextView mText1;
    TextView mText2;
    TextView mText3;
    TextView mText4;
    TextView mText5;
    TextView mText6;
    TextView mText7;
    TextView mText8;
    TextView mText9;
    TextView mText10;
    TextView mText11;
    TextView mText12;
    TextView mText13;
    TextView mText14;

    ImageView mImage1;
    ImageView mImage2;
    ImageView mImage3;
    ImageView mImage4;
    ImageView mImage5;
    ImageView mImage6;
    ImageView mImage7;
    ImageView mImage8;
    ImageView mImage9;
    ImageView mImage10;
    ImageView mImage11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
       String mText1 = getIntent().getStringExtra("Название");
       String mText2 = getIntent().getStringExtra("Ингредиенты");
    }
}
