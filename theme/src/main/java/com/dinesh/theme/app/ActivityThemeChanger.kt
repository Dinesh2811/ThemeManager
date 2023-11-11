//package com.dinesh.theme.app
//
//import android.app.Activity
//import android.app.Application
//import android.os.Bundle
//import android.util.Log
//
//private val TAG = "log_" + ActivityThemeChanger::class.java.name.split(ActivityThemeChanger::class.java.name.split(".").toTypedArray()[2] + ".").toTypedArray()[1]
//
//class MyApp : Application() {
//    override fun onCreate() {
//        super.onCreate()
//
//        // Register the ActivityLifecycleCallbacks
//        registerActivityLifecycleCallbacks(ActivityThemeChanger())
//    }
//}
//
//class ActivityThemeChanger : Application.ActivityLifecycleCallbacks {
//    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//        Log.e(TAG, "onActivityCreated: $activity")
//    }
//
//    override fun onActivityStarted(p0: Activity) {
//    }
//
//    override fun onActivityResumed(p0: Activity) {
//    }
//
//    override fun onActivityPaused(p0: Activity) {
//    }
//
//    override fun onActivityStopped(p0: Activity) {
//    }
//
//    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
//    }
//
//    override fun onActivityDestroyed(p0: Activity) {
//    }
//}
