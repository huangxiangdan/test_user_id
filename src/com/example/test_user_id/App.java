package com.example.test_user_id;

import android.app.Application;
import android.content.SharedPreferences;

public class App extends Application {
	public static final String CONFIG_BASE = "base";
    public static final String PREFERENCE_USERID = "userid";
	
	public int getUserId() {
		SharedPreferences share = this.getSharedPreferences(CONFIG_BASE, MODE_PRIVATE);
		return share.getInt(PREFERENCE_USERID, 0);
	}
}
