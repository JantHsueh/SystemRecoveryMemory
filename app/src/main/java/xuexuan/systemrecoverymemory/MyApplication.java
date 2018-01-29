package xuexuan.systemrecoverymemory;

import android.app.Application;

/**
 * Created by Administrator on 2018/1/19.
 */

public class MyApplication extends Application {

    String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public static  MyApplication sMyApplication;

    public static MyApplication getApplication(){

        if (sMyApplication == null) {
            synchronized (MyApplication.class) {
                if (sMyApplication == null) {
                    return sMyApplication = new MyApplication();
                }
            }
        }
        return sMyApplication;

    }


}
