package com.bbm.dhian;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity
{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }
	
	public void changeCover(View view) {
		Intent intent = new Intent(this, CoverPictureChanger.class);
		startActivity(intent);
	}
}
