package com.mask.newclient;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;

import com.mask.newclient.base.BaseActivity;

/**
 * 主界面
 *@author zhuangAH
 *@date 2015-10-20	
 *
 */
public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("主页");
        initView();
    }

    /**
     * 初始化View
     *@author zhuangAH
     *@date 2015-10-26
     */
    private void initView() {
    	setViewClickListener(R.id.img_title_left, new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onBackClick(v);
			}
		});
	}

	@Override
    public void onKeyBack(int keyCode, KeyEvent event) {
    	super.onKeyBack(keyCode, event);
    }
}
