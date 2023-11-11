package com.dinesh.theme.util

import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.util.Log

object Constants {
    fun getLaunchActivity(context: Context): Class<*>? {
        val packageManager = context.packageManager
        val intent = packageManager.getLaunchIntentForPackage(context.packageName)
        val className = intent?.component?.className
        Log.d("log_getLaunchActivity", "${className?.let { Class.forName(it) }}")
        return if (className != null) {
            Class.forName(className)
        } else {
            null
        }
    }
}