package com.buzz.yora.fragments;


import android.app.Fragment;
import android.os.Bundle;

import com.buzz.yora.infrastructure.YoraApplication;

public abstract class BaseFragment extends Fragment {
    protected YoraApplication application;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (YoraApplication) getActivity().getApplication();
    }

}
