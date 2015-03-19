package com.toomanycooksapp.mathapp.lessons;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toomanycooksapp.mathapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DefinitionFragment extends Fragment {

    public DefinitionFragment() {
    }
    int subject;
    int pass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle b = getArguments();
        subject = b.getInt("subject");
        pass = b.getInt("pass");

        return inflater.inflate(R.layout.fragment_definition, container, false);

    }
}