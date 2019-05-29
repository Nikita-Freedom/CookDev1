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
import ru.startandroid.cookdev1.FragmentTask.Task10Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task11Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task12Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task13Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task14Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task15Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task1Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task2Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task3Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task4Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task5Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task6Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task7Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task8Fragment;
import ru.startandroid.cookdev1.FragmentTask.Task9Fragment;
import ru.startandroid.cookdev1.FragmentTask.TaskFragment;
import ru.startandroid.cookdev1.RecipeFragment.RecipeFragment;

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
    TaskFragment zadFragment = new TaskFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        _fragments.add(FRAGMENT_ONE, new TbFragment());
        _fragments.add(FRAGMENT_TWO, new TbFragment());
        _fragments.add(FRAGMENT_THREE, new AbcFragment());
        _fragments.add(FRAGMENT_FOUR, new AbcFragment1());
        _fragments.add(FRAGMENT_FIVE, new AbcFragment2());
        _fragments.add(FRAGMENT_SIX, new AbcFragment3());
        _fragments.add(FRAGMENT_SEVEN, new AbcFragment4());
        _fragments.add(FRAGMENT_EIGHT, new TaskFragment());
        _fragments.add(FRAGMENT_NINE, new Task1Fragment());
        _fragments.add(FRAGMENT_TEN, new Task2Fragment());
        _fragments.add(FRAGMENT_ELEVEN, new Task3Fragment());
        _fragments.add(FRAGMENT_TWELVE, new Task4Fragment());
        _fragments.add(FRAGMENT_THIRTY, new Task5Fragment());
        _fragments.add(FRAGMENT_14, new Task6Fragment());
        _fragments.add(FRAGMENT_15, new Task7Fragment());
        _fragments.add(FRAGMENT_16, new Task8Fragment());
        _fragments.add(FRAGMENT_17, new Task9Fragment());
        _fragments.add(FRAGMENT_18, new Task10Fragment());
        _fragments.add(FRAGMENT_19, new Task11Fragment());
        _fragments.add(FRAGMENT_20, new Task12Fragment());
        _fragments.add(FRAGMENT_21, new Task13Fragment());
        _fragments.add(FRAGMENT_22, new Task14Fragment());
        _fragments.add(FRAGMENT_23, new Task15Fragment());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nov);
        BottomNavigationView navigation = (findViewById(R.id.navigation));
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new TbFragment());


    }

    public void setPage(int page) {
        _viewPager.setCurrentItem(page, true);
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