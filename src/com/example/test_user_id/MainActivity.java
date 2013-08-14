package com.example.test_user_id;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	public static final String CONFIG_BASE = "base";
    public static final String PREFERENCE_USERID = "userid";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 public int getUserId() {
		SharedPreferences share = this.getApplication().getSharedPreferences(CONFIG_BASE, MODE_PRIVATE);
		return share.getInt(PREFERENCE_USERID, 0);
	}
	    
    public void setUserId(int id) {
		SharedPreferences share = this.getApplication().getSharedPreferences(CONFIG_BASE,
				MODE_PRIVATE);
		Editor editor = share.edit();
		editor.putInt(PREFERENCE_USERID, id);
		editor.commit();
	}
    
    public void clearUserId() {
		SharedPreferences share = this.getApplication().getSharedPreferences(CONFIG_BASE,
				MODE_PRIVATE);
		Editor editor = share.edit();
		editor.clear();
		editor.commit();
	}

	public void setUserId(View v){
		setUserId(100);
		Toast.makeText(this, "userid is set to "+getUserId(), Toast.LENGTH_SHORT).show();
	}
	
	public void clearUserId(View v){
		clearUserId();
		Toast.makeText(this, "userid is set to "+getUserId(), Toast.LENGTH_SHORT).show();
	}
}
