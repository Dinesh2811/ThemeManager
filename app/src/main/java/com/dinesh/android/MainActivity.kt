package com.dinesh.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dinesh.android.ui.theme.Material3Theme
import com.dinesh.theme.app.ThemePreference
import com.dinesh.theme.app.launchActivity

class MainActivity : ComponentActivity() {
//class MainActivity : ThemePreference() {
    private val TAG = "log_" + MainActivity::class.java.name.split(MainActivity::class.java.name.split(".").toTypedArray()[2] + ".").toTypedArray()[1]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Text(
                        text = "Hello!",
                        modifier = Modifier.clickable {
//                            launchActivity(SecondActivity::class.java)
                            startActivity(Intent(this, SecondActivity::class.java))
                        }
                    )
                }
            }
            startActivity(Intent(this, SecondActivity::class.java))

        }

    }
}
