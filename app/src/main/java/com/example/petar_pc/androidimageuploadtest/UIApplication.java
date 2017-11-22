package com.example.petar_pc.androidimageuploadtest;

import android.app.Application;

import net.gotev.uploadservice.UploadService;

/**
 * Created by PETAR-PC on 11/22/2017.
 */

public class UIApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        UploadService.NAMESPACE = BuildConfig.APPLICATION_ID;
        // Or, you can define it manually.
        UploadService.NAMESPACE = getPackageName();
    }
}
