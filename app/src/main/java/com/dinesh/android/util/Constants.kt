//package com.dinesh.android.util
//
//import android.content.Context
//import android.content.Intent
//import android.content.pm.ResolveInfo
//
//object Constants {
////    val LAUNCHER_ACTIVITY = com.dinesh.android.MainActivity::class.java
//
//    fun getLaunchActivity(context: Context): Class<*>? {
//        val packageManager = context.packageManager
//        val intent = packageManager.getLaunchIntentForPackage(context.packageName)
//        val className = intent?.component?.className
//        return if (className != null) {
//            Class.forName(className)
//        } else {
//            null
//        }
//    }
//}