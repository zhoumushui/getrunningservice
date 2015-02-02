package com.zms.getrunningservice;

import android.content.Intent;
import android.graphics.drawable.Drawable;

/**
 * Created by AlexZhou on 2015/2/2.
 * 9:15
 */
public class ServiceModel {

    private String appLabel;    //应用程序标签
    private Drawable appIcon ;  //应用程序图像
    private String serviceName  ;  //该Service的类名
    private String pkgName ;    //应用程序所对应的包名

    private Intent intent ;  //该Service组件所对应的Intent

    private int pid ;  //该应用程序所在的进程号
    private String processName ;  // 该应用程序所在的进程名

    public ServiceModel(){}

    public String getAppLabel() {
        return appLabel;
    }
    public void setAppLabel(String appName) {
        this.appLabel = appName;
    }
    public Drawable getAppIcon() {
        return appIcon;
    }
    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public String getServiceName(){
        return serviceName ;
    }
    public void setServiceName(String serviceName){
        this.serviceName = serviceName ;
    }

    public String getPkgName(){
        return pkgName ;
    }
    public void setPkgName(String pkgName){
        this.pkgName=pkgName ;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }


}

