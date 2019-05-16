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

public class TbFragment extends Fragment{
    Fragment fragment1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment1 = new TbFragment();
        setRetainInstance(true);
        View v = inflater.inflate(R.layout.fragment_tb, null);
       // Button button1 = (Button) v.findViewById(R.id.buttontbmid);
       // button1.setOnClickListener(new View.OnClickListener() {
       //     @Override
       //     public void onClick(View v) {
       //         FragmentTransaction transaction = getFragmentManager().beginTransaction();
       //         transaction.replace(R.id.fragment_container, fragment1);
       //         transaction.commit();
       //     }
//       });

return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
