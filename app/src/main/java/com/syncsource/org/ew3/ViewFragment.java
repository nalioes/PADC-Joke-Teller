package com.syncsource.org.ew3;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class ViewFragment extends Fragment {
    public static final String BARG_USERNAME = "bundle_data";
    public static final String BARG_VIEW = "main_view";

    public ViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }

    public static Bundle bundleData() {

        Bundle bundle = new Bundle();
        bundle.putString(BARG_USERNAME, BARG_VIEW);

        return bundle;
    }
}
