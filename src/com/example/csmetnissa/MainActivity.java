package com.example.csmetnissa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button BPutNissa = (Button) findViewById(R.id.button1);
        BPutNissa.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				movetonissa();				
			}
		});
        
        // Getting the button object
        Button BLearnSomething = (Button) findViewById(R.id.button2);
        
        // Add an onclick listener
        BLearnSomething.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// Call the function movetolearnsomething
				movetolearnsomething();
			}
		});
        
    }
    public void movetonissa(){
    	Intent IPuttingNissa = new Intent(this,PuttingNissa.class);
		startActivity(IPuttingNissa);
    }
    
    // Defining the function
    public void movetolearnsomething(){
    	
    	// We say our intent is to move to LearnSomething
    	Intent i = new Intent(this,LearnSomething.class);
    	
    	// We start the intention
		startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
