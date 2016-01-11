package com.example.maple.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by pc1 on 2016/1/11.
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}
