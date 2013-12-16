package com.example.douga2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class NewActivity extends BaseActivity {
	private static final String DOUGTAG = "Doug2";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		Intent inputIntent = getIntent();
		String inputText = inputIntent.getStringExtra("screenText");
		Log.i(DOUGTAG, "The input is" + inputText);
		EditText nameIn = (EditText) findViewById(R.id.namein);
		nameIn.setText(inputText);
	}
	
	public void addComment(View v) {
		String name, comment, other;
		
		EditText nameIn = (EditText) findViewById(R.id.namein);
		EditText commentIn = (EditText) findViewById(R.id.commentin);
		EditText otherIn = (EditText) findViewById(R.id.otherin);
		
		name = nameIn.getText().toString();
		comment = commentIn.getText().toString();
		other = otherIn.getText().toString();
		
		EditText nameOut  = (EditText) findViewById(R.id.nameout);
		EditText commentOut  = (EditText) findViewById(R.id.commentout);
		EditText otherOut  = (EditText) findViewById(R.id.otherout);
		
		nameOut.setText(name);
		commentOut.setText(comment);
		otherOut.setText(other);
		
	}
}
