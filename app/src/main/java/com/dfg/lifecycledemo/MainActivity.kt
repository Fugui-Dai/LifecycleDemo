package com.dfg.lifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var myObserver:MyObserver?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         myObserver = MyObserver(lifecycle)
        lifecycle.addObserver(myObserver!!)
        Log.d("TAG","MainActivity-onCreate()")
        Log.d("TAG","lifecycle.currentState："+myObserver?.lifecycle?.currentState)


    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG","MainActivity-onStart()")
        Log.d("TAG","lifecycle.currentState："+myObserver?.lifecycle?.currentState)
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG","MainActivity-onResume()")
        Log.d("TAG","lifecycle.currentState："+myObserver?.lifecycle?.currentState)
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG","MainActivity-onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG","MainActivity-onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG","MainActivity-onDestroy()")
    }
}
