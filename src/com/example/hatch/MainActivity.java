package com.example.hatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.activity_main);
        
        Button menu = (Button) findViewById(R.id.menuButton);
        menu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent menuIntent = new Intent(getApplicationContext(), MenuActivity.class);
        		startActivity(menuIntent);
			}
        });
        
        
        Button feed = (Button) findViewById(R.id.feedButton);
        feed.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent feedIntent = new Intent(getApplicationContext(), FeedActivity.class);
        		startActivity(feedIntent);
			}
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   
    
}
