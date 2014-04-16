package com.marcosrosada.ciclodevida;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStart() {
		
		Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}

	@Override
	protected void onResume() {
		
		Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}

	@Override
	protected void onPause() {
		
		Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}

	@Override
	protected void onStop() {
		
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}


	@Override
	protected void onDestroy() {
		
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
		
		super.onStart();
	}
}
