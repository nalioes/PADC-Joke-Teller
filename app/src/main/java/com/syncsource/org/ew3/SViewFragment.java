package com.syncsource.org.ew3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SyncSource on 6/25/2016.
 */
public class SViewFragment extends Fragment {
    public static final String BARG_USERNAME = "bundle_data";
    public static final String BARG_VIEW = "second_view";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_view_fragment, container, false);

        return view;
    }
    public static Bundle bundleData() {

        Bundle bundle = new Bundle();
        bundle.putString(BARG_USERNAME, BARG_VIEW);

        return bundle;
    }
}
