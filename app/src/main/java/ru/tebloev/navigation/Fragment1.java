package ru.tebloev.navigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        Button button = v.findViewById(R.id.button);




        Bundle bundle = new Bundle();
        bundle.putString("arg1", "bla bla");
        bundle.putString("arg2", "la la");
        NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
        navController.navigate(R.id.action_fragment1_to_fragment2, bundle);


        Fragment1Directions.ActionFragment1ToFragment2 action =
                Fragment1Directions.actionFragment1ToFragment2(true);
        action.setArg1("bla bla")
                .setArg2(33333L);
        navController.navigate(action);


        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setEnterAnim(R.anim.nav_default_enter_anim)
                .setExitAnim(R.anim.nav_default_exit_anim)
                .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
                .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
                .setLaunchSingleTop(true)
                .setPopUpTo(R.id.fragment4, true);
        navController.navigate(action, builder.build());



        button.setOnClickListener(v1 -> navController.navigate(R.id.action_fragment1_to_fragment2));


        return v;
    }

}
