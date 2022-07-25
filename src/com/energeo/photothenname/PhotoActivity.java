package com.energeo.photothenname;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class PhotoActivity extends Activity{

	Button button2;
	ImageView imageview;
	
 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo_activity);
		
		button2 = (Button) findViewById(R.id.button2);
		imageview = (ImageView)findViewById(R.id.imageView); 
		
		
		//Capture button clicks
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {

				//Start NewActivity.class{
				Intent myIntent = new Intent(PhotoActivity.this, MainActivity.class);
				startActivity(myIntent);
				}});



}{
;
};
}// Locate the button in activity_main.xml











