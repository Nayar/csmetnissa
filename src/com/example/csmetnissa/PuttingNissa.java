package com.example.csmetnissa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class PuttingNissa extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.putting_nissa);
	        Button BPutMoreNissa = (Button) (Button) findViewById(R.id.button2);
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }
	
}
