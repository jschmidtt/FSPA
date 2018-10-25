package edu.temple.fspa;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


/**
 * This is just a color fragment that generates a 'random' background color onCreateView
 */
public class ColorFragment extends Fragment {


    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_color, container, false);
        int i;
        int colors[] = {Color.RED, Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN};
        i = new Random().nextInt(6);
        v.setBackgroundColor(colors[i]);
        return v;
    }

}
