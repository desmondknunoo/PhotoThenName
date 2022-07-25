package com.energeo.photothenname;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Chimp  extends Activity {


	Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chimp);
		finish();
		button2 = (Button) findViewById(R.id.button1);
		
		
		//Capture button clicks
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {

				//Start NewActivity.class{
				Intent myIntent = new Intent(Chimp.this, MainActivity.class);
				startActivity(myIntent);
				}});



}{
;
};
}// Locate the button in activity_main.xml











