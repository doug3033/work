package com.example.douga2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SideFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) 
	{
		View view;
		
		view = inflater.inflate(R.layout.new_activity, container, false);
		
		Button comment = (Button) view.findViewById(R.id.button1);
		comment.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				String name, comment, other;
				
				EditText nameIn = (EditText) view.findViewById(R.id.namein);
				EditText commentIn = (EditText) view.findViewById(R.id.commentin);
				EditText otherIn = (EditText) view.findViewById(R.id.otherin);
				
				name = nameIn.getText().toString();
				comment = commentIn.getText().toString();
				other = otherIn.getText().toString();
				
				EditText nameOut  = (EditText) view.findViewById(R.id.nameout);
				EditText commentOut  = (EditText) view.findViewById(R.id.commentout);
				EditText otherOut  = (EditText) view.findViewById(R.id.otherout);
				
				nameOut.setText(name);
				commentOut.setText(comment);
				otherOut.setText(other);
			}
			
			
		});
		
		return(view);
	}

}
