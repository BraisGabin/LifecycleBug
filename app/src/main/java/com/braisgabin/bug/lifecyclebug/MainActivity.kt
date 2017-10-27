package com.braisgabin.bug.lifecyclebug

import android.arch.lifecycle.Lifecycle.Event.ON_RESUME
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MyLifecycleObserver())
    }
}

class MyLifecycleObserver: LifecycleObserver {

    @OnLifecycleEvent(ON_RESUME)
    fun resume() {
        Log.d("LF", "Resume")
    }
}