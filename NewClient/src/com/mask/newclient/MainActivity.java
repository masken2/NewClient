package com.mask.newclient;

import android.os.Bundle;
import android.view.KeyEvent;

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
    }

    @Override
    public void onKeyBack(int keyCode, KeyEvent event) {
    	super.onKeyBack(keyCode, event);
    }
}
