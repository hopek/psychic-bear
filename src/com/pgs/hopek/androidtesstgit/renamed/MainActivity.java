package com.pgs.hopek.androidtesstgit.renamed;

import java.math.BigInteger;
import java.security.SecureRandom;

import com.pgs.hopek.androidtesstgit.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private TextView mTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((Button) findViewById(R.id.button1)).setOnClickListener(this);
		mTextView = (TextView) findViewById(R.id.textView1);
		((Button) findViewById(R.id.button2)).setOnClickListener(this);
		((Button) findViewById(R.id.button3)).setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			mTextView.setText(new BigInteger(130, new SecureRandom()).toString(32));
			Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show();
		} else if (v.getId() == R.id.button2) {
			mTextView.setText(null);
		} else if (v.getId() == R.id.button3) {
			startActivity(new Intent(this, NewActivity.class));
		}
	}

}
