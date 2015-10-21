package com.mask.newclient.common;

import android.content.Context;
import android.content.Intent;

import com.mask.newclient.GuideActivity;
import com.mask.newclient.MainActivity;

/**
 * Created by Administrator on 2015/9/21.
 */
public class UIHelperUtils {

    /**
     *
     * @param context
     */
    public static void toMainActivity(Context context) {

        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    /**
     * @param context
     */
    public static void toGurideActivity(Context context){
        Intent intent = new Intent(context, GuideActivity.class);
        context.startActivity(intent);
    }
}
