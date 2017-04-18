package com.buzz.yora.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.buzz.yora.infrastructure.YoraApplication;

/**
 * Created by lehtone1 on 18/04/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected YoraApplication application;

    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        application = (YoraApplication) getApplication();

    }
}
