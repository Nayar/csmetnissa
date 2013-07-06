package com.example.csmetnissa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LearnSomething extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learn_something);
		Button BsaveToDb = (Button) findViewById(R.id.button2);
		BsaveToDb.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				meraActivityStarter(SaveToDatabase.class);
			}
		});
		
		Button BviewGPS = (Button) findViewById(R.id.button4);
		BviewGPS.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				meraActivityStarter(GetGPSLocation.class);
			}
		});
	}
	
	void meraActivityStarter(Class name){
		Intent i = new Intent(this,name);
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.learn_something, menu);
		return true;
	}

}
