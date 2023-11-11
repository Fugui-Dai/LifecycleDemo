package com.dfg.lifecycledemo

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner

class MyObserver(val lifecycle: Lifecycle): DefaultLifecycleObserver {
    private var enabled = false

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("TAG","MyObserver-onCreate()")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("TAG","MyObserver-onDestroy()")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("TAG","MyObserver-onPause()")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("TAG","MyObserver-onResume()")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("TAG","MyObserver-onStart()")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("TAG","MyObserver-onStop()")
    }
}