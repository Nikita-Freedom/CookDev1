package ru.startandroid.cookdev1.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.cookdev1.FragmentBase.AbcFragment;
import ru.startandroid.cookdev1.FragmentBase.AbcFragment1;
import ru.startandroid.cookdev1.FragmentBase.AbcFragment2;
import ru.startandroid.cookdev1.FragmentBase.AbcFragment3;
import ru.startandroid.cookdev1.FragmentBase.AbcFragment4;
import ru.startandroid.cookdev1.R;
import ru.startandroid.cookdev1.FragmentSafetyEngineering.TbFragment;
import ru.startandroid.cookdev1.FragmentTask.Zad10Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad11Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad12Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad13Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad14Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad15Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad1Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad2Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad3Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad4Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad5Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad6Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad7Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad8Fragment;
import ru.startandroid.cookdev1.FragmentTask.Zad9Fragment;
import ru.startandroid.cookdev1.FragmentTask.ZadFragment;

public class ActivityNov extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    private FragmentPagerAdapter _fragmentPagerAdapter;
    private final List<Fragment> _fragments = new ArrayList<Fragment>();
    private static String FRAGMENT_INSTANCE_NAME = "fragment";
    private ViewPager _viewPager;
    public static final int FRAGMENT_ONE = 0;
    public static final int FRAGMENT_TWO = 1;
    public static final int FRAGMENT_THREE = 2;
    public static final int FRAGMENT_FOUR = 3;
    public static final int FRAGMENT_FIVE = 4;
    public static final int FRAGMENT_SIX = 5;
    public static final int FRAGMENT_SEVEN = 6;
    public static final int FRAGMENT_EIGHT = 7;
    public static final int FRAGMENT_NINE = 8;
    public static final int FRAGMENT_TEN = 9;
    public static final int FRAGMENT_ELEVEN = 10;
    public static final int FRAGMENT_TWELVE = 11;
    public static final int FRAGMENT_THIRTY = 12;
    public static final int FRAGMENT_14 = 13;
    public static final int FRAGMENT_15 = 14;
    public static final int FRAGMENT_16 = 15;
    public static final int FRAGMENT_17 = 15;
    public static final int FRAGMENT_18 = 16;
    public static final int FRAGMENT_19 = 17;
    public static final int FRAGMENT_20 = 18;
    public static final int FRAGMENT_21 = 19;
    public static final int FRAGMENT_22 = 20;
    public static final int FRAGMENT_23 = 21;

    TbFragment tbFragment = new TbFragment();
    AbcFragment abcFragment = new AbcFragment();
    RecipeFragment recipeFragment = new RecipeFragment();
    ZadFragment zadFragment = new ZadFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        _fragments.add(FRAGMENT_ONE, new TbFragment());
        _fragments.add(FRAGMENT_TWO, new TbFragment());
        _fragments.add(FRAGMENT_THREE, new AbcFragment());
        _fragments.add(FRAGMENT_FOUR, new AbcFragment1());
        _fragments.add(FRAGMENT_FIVE, new AbcFragment2());
        _fragments.add(FRAGMENT_SIX, new AbcFragment3());
        _fragments.add(FRAGMENT_SEVEN, new AbcFragment4());
        _fragments.add(FRAGMENT_EIGHT, new ZadFragment());
        _fragments.add(FRAGMENT_NINE, new Zad1Fragment());
        _fragments.add(FRAGMENT_TEN, new Zad2Fragment());
        _fragments.add(FRAGMENT_ELEVEN, new Zad3Fragment());
        _fragments.add(FRAGMENT_TWELVE, new Zad4Fragment());
        _fragments.add(FRAGMENT_THIRTY, new Zad5Fragment());
        _fragments.add(FRAGMENT_14, new Zad6Fragment());
        _fragments.add(FRAGMENT_15, new Zad7Fragment());
        _fragments.add(FRAGMENT_16, new Zad8Fragment());
        _fragments.add(FRAGMENT_17, new Zad9Fragment());
        _fragments.add(FRAGMENT_18, new Zad10Fragment());
        _fragments.add(FRAGMENT_19, new Zad11Fragment());
        _fragments.add(FRAGMENT_20, new Zad12Fragment());
        _fragments.add(FRAGMENT_21, new Zad13Fragment());
        _fragments.add(FRAGMENT_22, new Zad14Fragment());
        _fragments.add(FRAGMENT_23, new Zad15Fragment());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nov);
        BottomNavigationView navigation = (findViewById(R.id.navigation));
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new TbFragment());


    }

    public void setPage(int page) {
        _viewPager.setCurrentItem(page, true); //второй параметр для плавного перелистывания
    }

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
                fragment = tbFragment;
               break;
            case R.id.navigation_General:
                fragment = abcFragment;
                break;
            case R.id.navigation_Recipe:
                fragment = recipeFragment;
                break;
            case  R.id.navigation_Teach:
                fragment = zadFragment;
                break;
        }
       return loadFragment(fragment);
    }
}