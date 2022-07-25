package com.energeo.photothenname;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	ImageButton imagebutton;
	Button button1;
	ImageView imageview;
	
	
	static final int CAM_REQUEST = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	// Locate the button in activity_main.xml
		
 
		imagebutton = (ImageButton) findViewById(R.id.imageButton4);
		imageview = (ImageView)findViewById(R.id.imageView); 
		imagebutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				File file = getFile();
				camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
				startActivityForResult(camera_intent, CAM_REQUEST);
			}
		});
	}
	private File getFile()
	{
		
		File folder = new File("sdcard/photo_then_name");
		
		if(!folder.exists())
		{
			folder.mkdir();
		}
		File image_file = new File(folder,"cam_image.jpg");
		return image_file;
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	
		String path = "sdcard/photo_then_name/cam_image.jpg";
		imageview.setImageDrawable(Drawable.createFromPath(path));
		
		
		//Capture button clicks
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
	public void onClick(View arg0) {

		//Start NewActivity.class{
		Intent myIntent = new Intent(MainActivity.this, SplashScreen2.class);
		startActivity(myIntent);
		}
});



}{
;
};
}// Locate the button in activity_main.xml