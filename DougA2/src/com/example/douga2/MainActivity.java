package com.example.douga2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends BaseActivity {
	private static final String DOUGTAG = "Doug2";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void ButtonClick(View v) {
		Log.i(DOUGTAG, "buttonCLick");
		Intent intent = new Intent(this, NewActivity.class);
		intent.putExtra("screenText", "Hello World");
		startActivity(intent);

	}
	




	@Override
	protected void onStart() {
		super.onStart();
		Log.i(DOUGTAG, "onStart!");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(DOUGTAG, "onResume!");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(DOUGTAG, "onPause!");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(DOUGTAG, "onStop!");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(DOUGTAG, "onDestroy!");
	}

}
