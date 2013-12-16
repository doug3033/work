package com.example.douga2;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends FragmentActivity {
	private static final String DOUGTAG = "Doug2";
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case(R.id.twitter):
			Log.i(DOUGTAG, "In Twitter");
			return(true);
		case(R.id.facebook):
			Log.i(DOUGTAG, "In Facebook");
			return(true);
		case(R.id.resources):
			Log.i(DOUGTAG, "In Resources");
			return(true);
			
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
