package com.saranr689.disable_log;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final boolean LOG_ENABLED = BuildConfig.DEBUG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (LOG_ENABLED)
        {
            Log.d("DEBUG_D", "onCreate1: ");
            Log.e("DEBUG_D", "onCreate2: ");
            Log.i("DEBUG_D", "onCreate3: ");
            Log.d("DEBUG_D", "onCreate4: ");
            Log.e("DEBUG_D", "onCreate5: ");
            Log.i("DEBUG_D", "onCreate6: ");
            Log.d("DEBUG_D", "onCreate7: ");
            Log.e("DEBUG_D", "onCreate8: ");
            Log.i("DEBUG_D", "onCreate9: ");
        }

    }
}
