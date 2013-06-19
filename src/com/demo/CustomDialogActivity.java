
package com.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

import com.demo.widget.Switch;

public class CustomDialogActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/*Switch sw = (Switch)findViewById(R.id.switchBtn);
		sw.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				Toast.makeText(CustomDialogActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
			}
		});*/
	}
}
