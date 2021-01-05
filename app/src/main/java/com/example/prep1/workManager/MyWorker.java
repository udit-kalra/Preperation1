package com.example.prep1.workManager;

import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        return null;
    }

    private void displayNotification(String task, String desc){

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

        }
    }

}
