package com.mask.newclient;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;

import com.mask.newclient.base.BaseActivity;
import com.mask.newclient.common.UIHelperUtils;

public class SplachActivity extends BaseActivity{

	private Handler handler =new Handler();
	private SharedPreferences sp; 
	
	private Boolean isFirst=true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splach);
		handler.postDelayed(runnable, 2000);
	}
	Runnable runnable =new Runnable() {
		
		@Override
		public void run() {
			sp=getSharedPreferences("PhoneGuide", Context.MODE_PRIVATE);
			if(sp.getBoolean("isFirst", true)){
				Editor edit = sp.edit();
				edit.putBoolean("isFirst", false);
				edit.commit();
				UIHelperUtils.toGurideActivity(SplachActivity.this); 
				finish();
			}else{
				toMainActivity();
			}
		}
	};
	/**
	 * 前往主界面
	 */
	private void toMainActivity() {
		UIHelperUtils.toMainActivity(SplachActivity.this);
		finish();
	}
}
  
