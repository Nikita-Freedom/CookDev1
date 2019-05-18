package ru.startandroid.cookdev1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityMid extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private FragmentPagerAdapter _fragmentPagerAdapter;
    /** список фрагментов для отображения. */
    private final List<Fragment> _fragments = new ArrayList<Fragment>();
    //private final List<Fragment> _fragments = new ArrayList<Fragment>();
    /** сам ViewPager который будет все это отображать. */
    //private ViewPager _viewPager;
    //public static final int FRAGMENT_ONE = 0;
    /** идентификатор второго. */
    public static final int FRAGMENT_ONE = 0;
    public static final int FRAGMENT_TWO = 1;
    public static final int FRAGMENT_THREE = 2;
    public static final int FRAGMENT_FOUR = 3;
    public static final int FRAGMENT_FIVE = 4;
    public static final int FRAGMENT_SIX = 5;
    public static final int FRAGMENT_SEVEN = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        _fragments.add(FRAGMENT_ONE, new TbMidFragment());
        _fragments.add(FRAGMENT_TWO, new ZadMidFragment());
        //_fragments.add(FRAGMENT_ONE, new TbFragment());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nov);
        BottomNavigationView navigation = (findViewById(R.id.navigation));
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new TbMidFragment());
    }
    //public void setPage(int page) {
        //_viewPager.setCurrentItem(page, true); //второй параметр для плавного перелистывания
    //}

    public boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.navigation_Tb:
                fragment = new TbMidFragment();
                break;
            case R.id.navigation_General:
                fragment = new AbcMidFragment();
                break;
            case R.id.navigation_Recipe:
                fragment = new RecipeMidFragment();
                break;
            case  R.id.navigation_Teach:
                fragment = new ZadMidFragment();
                break;
        }
        return loadFragment(fragment);
    }
}