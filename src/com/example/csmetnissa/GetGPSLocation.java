package com.example.csmetnissa;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class GetGPSLocation extends Activity {
	TextView disp_long,disp_lat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_gpslocation);
		LocationManager locationManager = (LocationManager) 
				getSystemService(Context.LOCATION_SERVICE);
		LocationListener locationListener = new MeraLocationListener();  
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 10, locationListener);
		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 10, locationListener);
		


		disp_long = (TextView) findViewById(R.id.display_lon);
		disp_lat = (TextView) findViewById(R.id.display_lat);
		_getLocation();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_gpslocation, menu);
		return true;
	}
	
	private void _getLocation() {
	    // Get the location manager
	    LocationManager locationManager = (LocationManager) 
	            getSystemService(LOCATION_SERVICE);
	    Criteria criteria = new Criteria();
	    String bestProvider = locationManager.getBestProvider(criteria, false);
	    Location location = locationManager.getLastKnownLocation(bestProvider);
	    try {
	    	disp_lat.setText(Double.toString(location.getLatitude()));
	        disp_long.setText(Double.toString(location.getLongitude()));
	    } catch (NullPointerException e) {
	    	disp_lat.setText(Double.toString(0.1));
	        disp_long.setText(Double.toString(0.1));
	    }
	}
	
	private class MeraLocationListener implements LocationListener {

		@Override
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
			disp_lat.setText(Double.toString(location.getLatitude()));
	        disp_long.setText(Double.toString(location.getLongitude()));
		}

		@Override
		public void onProviderDisabled(String arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
