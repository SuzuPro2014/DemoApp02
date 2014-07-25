package com.google.demoapp;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button b = (Button)findViewById(R.id.where_button);
		b.setOnClickListener(new View.OnClickListener(){
		
	    public void onClick(View v){
	    	WifiManager manager = (WifiManager) getSystemService(WIFI_SERVICE);
			WifiInfo info = manager.getConnectionInfo();
			String[] apInfo = new String[2];
			apInfo[0] = String.format("SSID : %s", info.getSSID());		
	    	AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity.this);
	    	dialog.setTitle("åªç›ín");
	    	
	    	dialog.setMessage(apInfo[0]);
	    	
	    	dialog.setPositiveButton("OK", null);
	    	dialog.show();
	    }
	 }
	);
	}    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}

