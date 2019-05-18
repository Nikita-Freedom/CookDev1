package ru.startandroid.cookdev1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.solver.widgets.Rectangle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
                if(score1 == 100)
                    image.setImageDrawable(getResources().getDrawable(R.drawable.lisasad));
                   // Snackbar.make(v, "Победа!" + score1,
                   //         Snackbar.LENGTH_LONG)
                   //         .setAction("Action", null).show();

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
                if(score == 100)
                    image1.setImageDrawable(getResources().getDrawable(R.drawable.lisasad));

                    //Snackbar.make(v, "Победа!" + score1,
                    //        Snackbar.LENGTH_LONG)
                    //        .setAction("Action", null).show();

            }

        });
    return v;
    }
    class TestSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
        private DrawThread drawThread;
        public TestSurfaceView(Context context) {
            super(context);
            getHolder().addCallback(this);
        }

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            drawThread = new DrawThread(getContext(),getHolder());
            drawThread.start();// создание SurfaceView
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
// изменение размеров SurfaceView
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
            drawThread.requestStop();
            boolean retry = true;
            while (retry) {
                try {
                    drawThread.join();
                    retry = false;
                } catch (InterruptedException e) {
//
                }
            }// уничтожение SurfaceView
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
//drawThread.set(event.getX(), event.getY(), 0);
            return super.onTouchEvent(event);
        }
    }
    class DrawThread extends Thread {

        private SurfaceHolder surfaceHolder;

        private volatile boolean running = true;

        public DrawThread(Context context, SurfaceHolder surfaceHolder) {
            this.surfaceHolder = surfaceHolder;
        }

        public void requestStop() {
            running = false;
        }

        @Override
        public void run() {
            Paint paint = new Paint();
            paint.setColor(Color.YELLOW);
            int c=0;
            while (running) {
                Canvas canvas = surfaceHolder.lockCanvas();
                if (canvas != null) {
                    try {
                        if(c==0){
                            canvas.drawColor(Color.GREEN);
                        }else if(c==1){
                            canvas.drawColor(Color.YELLOW);
                        }else if(c==2){
                            canvas.drawColor(Color.RED);
                        }

                    } finally {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    }

                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                c=(c+1)%3;
            }
        }
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



