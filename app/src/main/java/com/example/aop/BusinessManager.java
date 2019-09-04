package com.example.aop;

import android.util.Log;


/***
 * @date 2019/9/2 10:28
 * @author BoXun.Zhao
 * @description
 */


public class BusinessManager {
    @AddAdv(type = 1)
    @OtherAdv(type = 1)
    public int dealBusiness(ABean aBean) {
        Log.e(Const.TAG, "处理业务A");
        return 1;
    }

    @AddAdv(type = 2)
    @OtherAdv(type = 2)
    public int dealBusiness(BBean bBean) {
        Log.e(Const.TAG, "处理业务B");
        return 2;
    }

    @AddAdv(type = 3)
    @OtherAdv(type = 3)
    public int dealBusiness(CBean cBean) {
        Log.e(Const.TAG, "处理业务C");
        return 3;
    }
}
