package com.android.profilez;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;


import com.android.profilez.utils.Constants;

public class MainActivity extends FragmentActivity {


    protected Context mContext;
    private FrameLayout mainLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.v(Constants.Log.METHOD, "MainActivity - OnCreate");

		getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        super.onCreate(savedInstanceState);

        mContext = this;

        setContentView(R.layout.main_layout);
        mainLayout = (FrameLayout) findViewById(R.id.main_layout);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }

    @Override
	protected void onPause() {

    	Log.v(Constants.Log.METHOD, "MainActivity - OnPause");

		super.onPause();
	}

    @Override
    protected void onRestart() {
        Log.v(Constants.Log.METHOD, "MainActivity - onRestart");

        super.onRestart();
    }

    @Override
    protected void onStop() {

        Log.v(Constants.Log.METHOD, "MainActivity - onStop");

        super.onStop();
    }

	@Override
	protected void onDestroy() {
		
		Log.v(Constants.Log.METHOD, "MainActivity - OnDestroy");
		
		super.onDestroy();
	}

	@Override
	protected void onResume() {
		Log.v(Constants.Log.METHOD, "MainActivity - OnResume");

		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.v(Constants.Log.METHOD, "MainActivity - onSaveInstanceState");
		super.onSaveInstanceState(outState);
	}
	
    @Override
    public void onBackPressed() {
    	
    	Log.v(Constants.Log.METHOD, "MainActivity - onBackPressed");
    }

}
