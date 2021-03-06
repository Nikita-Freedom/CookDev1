package ru.startandroid.cookdev1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import ru.startandroid.cookdev1.R;


public class MainActivity extends AppCompatActivity {
    TextView Childcook;
    ImageView cat;
    TextView Age;
    Button btnNov;
    Button btnMid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
        Childcook = (TextView) findViewById(R.id.ChildCook);
        cat = findViewById(R.id.cat);
        Age = (TextView) findViewById(R.id.Age);
        btnNov = (Button) findViewById(R.id.Nov);
        btnMid = (Button) findViewById(R.id.Mid);
        View.OnClickListener oclbtnNov = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityNov.class );
                startActivity(intent);
            }
        };
        btnNov.setOnClickListener(oclbtnNov);
        View.OnClickListener oclbtnMid = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityMid.class );
                startActivity(intent);
            }
        };
        btnMid.setOnClickListener(oclbtnMid);
    }
}
