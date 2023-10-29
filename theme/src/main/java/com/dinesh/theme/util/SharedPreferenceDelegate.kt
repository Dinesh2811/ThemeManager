package com.dinesh.theme.util

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import com.dinesh.theme.R
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun <T> Context.sharedPreferences(name: String, defaultValue: T) = SharedPreferenceDelegate(this, name, defaultValue)

class SharedPreferenceDelegate<T>(context: Context, private val name: String, private val defaultValue: T) : ReadWriteProperty<Any?, T> {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("MySharedPreferences_${context.packageName}", AppCompatActivity.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return when (defaultValue) {
            is Boolean -> sharedPreferences.getBoolean(name, defaultValue as Boolean) as T
            is Float -> sharedPreferences.getFloat(name, defaultValue as Float) as T
            is Int -> sharedPreferences.getInt(name, defaultValue as Int) as T
            is Long -> sharedPreferences.getLong(name, defaultValue as Long) as T
            is String -> sharedPreferences.getString(name, defaultValue as String) as T
            else -> throw IllegalArgumentException("This type cannot be saved into SharedPreferences")
        }
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        when (value) {
            is Boolean -> editor.putBoolean(name, value)
            is Float -> editor.putFloat(name, value)
            is Int -> editor.putInt(name, value)
            is Long -> editor.putLong(name, value)
            is String -> editor.putString(name, value)
            else -> throw IllegalArgumentException("This type can be saved into SharedPreferences")
        }.apply()
    }
}
