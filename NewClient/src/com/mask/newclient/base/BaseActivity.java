package com.mask.newclient.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.mask.newclient.R;
import com.mask.newclient.common.AppManager;

/**
 *基类
 *@author zhuangAH
 *@date 2015-10-20	
 *
 */
public class BaseActivity extends  FragmentActivity{

	private static long exitTime = 0;

	private TextView tv_title =null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		AppManager.addActivity(this);
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
	
	/**
	 * 销毁View
	 *@author zhuangAH
	 *@date 2015-10-26	
	 * @param view
	 */
	public void onBackClick(View view){
		this.finish();
	}

	@Override
	public void setContentView(int layoutResID) {
		super.setContentView(layoutResID);
		tv_title=(TextView) findViewById(R.id.tv_title);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppManager.removeActivity(this);
	}

	/**
	 * 设备button点击事件
	 *@author zhuangAH
	 *@date 2015-10-26	
	 * @param resId
	 * @param clickListener
	 */
	public void setViewClickListener(int resId,OnClickListener onClickListener){
		View view =findViewById(resId);
		if(view !=null){
			view.setOnClickListener(onClickListener);
		}
	}
	/**
	 * 设置标题点击事件
	 *@author zhuangAH
	 *@date 2015-10-26	
	 * @param onClickListener
	 */
	public void setTitleViewClickListener(OnClickListener onClickListener){
		setViewClickListener(R.id.img_title_left, onClickListener);
	}
	
	/**
	 *设置标题是否显示 
	 *@author zhuangAH
	 *@date 2015-10-26	
	 * @param resId
	 */
	public void setViewHide(int resId ,int visibility){
		View view =findViewById(resId);
		if(view !=null){
			view.setVisibility(visibility);
		}
	}
	
	/**
	 * 设置标题，String
	 *@author zhuangAH
	 *@date 2015-10-26	
	 * @param title
	 */
	public void setTitle(String title){
		if(tv_title !=null){
			tv_title.setText(title);
		}
	}
	/**
	 * 设置标题 int
	 */
	public void setTitle(int title){
		if(tv_title != null){
			tv_title.setText(title);
		}
	}
	
}
