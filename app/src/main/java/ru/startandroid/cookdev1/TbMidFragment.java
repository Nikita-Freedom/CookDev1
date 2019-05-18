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

public class TbMidFragment extends Fragment {
    Fragment fragment1mid;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment1mid = new TbMidFragment();
        View v = inflater.inflate(R.layout.fragment_tbmid, null);
       // Button button1 = (Button) v.findViewById(R.id.buttontbmid);
       // button1.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View v) {
       //         FragmentTransaction transaction = getFragmentManager().beginTransaction();
       //         transaction.replace(R.id.fragment_container, fragment1mid);
       //         transaction.commit();
       //     }
        //});
return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}