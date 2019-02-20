package ru.tebloev.navigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment2 extends Fragment {




    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString("arg1", param1);
        args.putString("arg2", param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Fragment2Args args = Fragment2Args.fromBundle(getArguments());
        String s = args.getArg1();
        long l = args.getArg2();
        boolean b = args.getArg3();


        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }
}
