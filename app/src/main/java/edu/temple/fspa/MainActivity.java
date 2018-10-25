package edu.temple.fspa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    ColorFragment fragments[];

    /*
        Generic Example of the FSPA
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        fragments = new ColorFragment[4];

        fragments[0] = new ColorFragment();
        fragments[1] = new ColorFragment();
        fragments[2] = new ColorFragment();
        fragments[3] = new ColorFragment();

        //Get FSPA
        FragmentStatePagerAdapter fspa = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return fragments[i];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }
        };

        //Set FSPA
        viewPager.setAdapter(fspa);
    }
}
