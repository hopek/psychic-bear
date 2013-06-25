package com.pgs.hopek.androidtesstgit;

import android.app.Activity;
import android.os.Bundle;

public class NewActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
	}

	private void tmpMethod() {
		int a = 0;
		int b = a;
		int c = b - a;
		int d = c * 3;
		int f = 0;
	}
}
