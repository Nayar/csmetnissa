package com.example.csmetnissa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SaveToDatabase extends Activity {
	int amt = 0;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_save_to_database);
		
		SeekBar sb = (SeekBar) findViewById(R.id.seekBar1);		
		sb.setOnSeekBarChangeListener(new MeraSeekBarListener());
		
		tv = (TextView) findViewById(R.id.textView2);
		
	}
	
	class MeraSeekBarListener implements OnSeekBarChangeListener{
		
		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			// TODO Auto-generated method stub
			tv.setText("Amount of nissa put: "+Integer.toString(progress));
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.save_to_database, menu);
		return true;
	}

}
