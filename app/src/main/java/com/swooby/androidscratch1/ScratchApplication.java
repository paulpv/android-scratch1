package com.swooby.androidscratch1;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by Paul on 1/27/2015.
 */
public class ScratchApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Application Context Toast", Toast.LENGTH_LONG).show();
    }
}
