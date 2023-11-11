package com.dinesh.android

import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.dinesh.theme.app.ThemePreference
import com.dinesh.theme.app.launchActivity

//import com.dinesh.android.app.ToolbarMain

private val TAG = "log_" + SecondActivity::class.java.name.split(SecondActivity::class.java.name.split(".").toTypedArray()[2] + ".").toTypedArray()[1]

class SecondActivity : ThemePreference() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentViewLayout(R.layout.testing_layout)
        Log.d(TAG, "onCreate: ")
        findViewById<Button>(R.id.button).setOnClickListener {
            launchActivity(ThirdActivity::class.java)
        }

    }
}
