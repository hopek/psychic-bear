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
		int z = b * a + 56;
		int asd = 34321;
	}
	
	private void conflictMethod02() {
		int b = 4;
		int z = b + 98;
	}
}
