package com.mask.newclient.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;

/**
 * ��Ŀ������
 *@author zhuangAH
 *@date 2015-10-20	
 *
 */
public class BaseActivity extends  Activity{

	private static long exitTime = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
	
	public void onKeyBack(int keyCode, KeyEvent event){
		onKeyDown(keyCode, event);
	}
	/**
	 * 程序返回
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode==KeyEvent.KEYCODE_BACK && event.getAction()==KeyEvent.ACTION_DOWN)
		{
			if((System.currentTimeMillis()-exitTime) > 2000){ 
				Toast.makeText(getApplicationContext(), "再点击一次退出", Toast.LENGTH_SHORT).show(); 
				exitTime = System.currentTimeMillis(); 
				} else {
				finish();
				System.exit(0);
				}
			return true; 
		}
		return super.onKeyDown(keyCode, event);
	}
}
