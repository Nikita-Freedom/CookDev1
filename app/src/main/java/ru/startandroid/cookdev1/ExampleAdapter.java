package ru.startandroid.cookdev1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<ExampleItem> mExampleList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        Fragment fragmentMid;
        Fragment fragmentMid1;

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextViewRec1;
        public TextView mTextViewRec2;
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
         mImageView = itemView.findViewById(R.id.imageView);
         mTextView1 = itemView.findViewById(R.id.textView);
         mTextView2 = itemView.findViewById(R.id.textView2);
         itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int position = getAdapterPosition();
                 Snackbar.make(v, "Click detected on item " + position,
                         Snackbar.LENGTH_LONG)
                         .setAction("Action", null).show();
                 Intent intent = new Intent(v.getContext(), ActivityRecipe.class);
                 startActivity(v.getContext(), intent, null);
                 intent.putExtra("Text", mTextViewRec1.getText().toString());
                 intent.putExtra("Text", mTextViewRec2.getText().toString());
             }
         });
        }

    }
    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_card_layout, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
       ExampleItem currentItem = mExampleList.get(position);
       holder.mImageView.setImageResource(currentItem.getmImageResource());
       holder.mTextView1.setText(currentItem.getmText1());
       holder.mTextView2.setText(currentItem.getmText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}
