package com.dinesh.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dinesh.theme.app.ThemeManager

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ThemeManager(this).applyTheme(R.style.Theme_Dynamic_Light, R.layout.testing_layout)

    }
}
