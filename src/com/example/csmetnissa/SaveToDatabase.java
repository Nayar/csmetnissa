package com.example.csmetnissa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SaveToDatabase extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_save_to_database);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.save_to_database, menu);
		return true;
	}

}
