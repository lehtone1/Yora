package com.buzz.yora.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by lehtone1 on 18/04/17.
 */

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected final void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        if(!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onYoraCreate(savedState);
    }

    protected  abstract void onYoraCreate(Bundle savedState);
}
