package com.example.aop;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/***
 * @date 2019/9/2 19:44
 * @author BoXun.Zhao
 * @description
 */
@Aspect
public class OtherAsp {
    public static final String ADD_ADV_METHOD_NAME = "addAdvertising()";

    /**
     * 处理所有关于BusinessManager包下的所有方法
     */
    @Pointcut(Const.OTHER_ANNOTATION_NAME)
    public void addAdvertising() {
    }

    @Around(ADD_ADV_METHOD_NAME)
    public Object relAddAdvertising(ProceedingJoinPoint joinPoint) throws Throwable {
        Object proceed = joinPoint.proceed();
        int type = (int) proceed;
        Log.e(Const.TAG, "type add-->"+type);
        if (type == 1) {
            Log.e(Const.TAG, "增加A广告逻辑Other");
        } else if (type == 2) {
            Log.e(Const.TAG, "增加B广告逻辑Other");
        } else {
            Log.e(Const.TAG, "增加其余Other");
        }
        /*MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        AddAdv annotation = signature.getMethod().getAnnotation(AddAdv.class);
        if (annotation != null) {
            int type = annotation.type();
            if (type == 1) {
                Log.e(Const.TAG, "增加A广告逻辑");
            } else if (type == 2) {
                Log.e(Const.TAG, "增加B广告逻辑");
            } else {
                Log.e(Const.TAG, "增加其余");
                return joinPoint.proceed();
            }
        }*/

        return null;
    }
}
