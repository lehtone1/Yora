package com.buzz.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.buzz.yora.R;

/**
 * Created by lehtone1 on 18/04/17.
 */

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private View loginButton;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.activity_login_login);
        if(loginButton != null) {
            loginButton.setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {

        if (view == loginButton) {
            startActivity(new Intent(this, LoginNarrowActivity.class));
        }

    }
}
