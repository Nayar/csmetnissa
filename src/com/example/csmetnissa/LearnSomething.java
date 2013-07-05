package com.example.csmetnissa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LearnSomething extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_learn_something);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.learn_something, menu);
		return true;
	}

}
