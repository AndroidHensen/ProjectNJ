package com.handsome.projectnz;

import android.app.Application;
import android.support.multidex.MultiDex;

import com.handsome.projectnz.Manager.PrefManager;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2018/2/23.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PrefManager.init(getApplicationContext());
        MultiDex.install(this);
    }
}
