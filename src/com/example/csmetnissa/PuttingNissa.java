package com.example.csmetnissa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PuttingNissa extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.putting_nissa);
	        Button BPutMoreNissa = (Button) findViewById(R.id.button2);
	        final TextView sakili = (TextView) findViewById(R.id.textView2);
	        BPutMoreNissa.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					sakili.setText("Assez matelot!!!");
				}
			});
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }
	
}
