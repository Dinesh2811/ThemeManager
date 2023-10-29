package com.dinesh.android

import android.os.Bundle
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.*
import androidx.compose.material.*
import com.dinesh.theme.app.ToolbarMain
//import com.dinesh.android.app.ToolbarMain

private val TAG = "log_" + SecondActivity::class.java.name.split(SecondActivity::class.java.name.split(".").toTypedArray()[2] + ".").toTypedArray()[1]

class SecondActivity : ToolbarMain() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            MaterialTheme {
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    MyLayoutView()
//                }
//            }
//        }
        setContentViewLayout(R.layout.testing_layout)

    }
}

@Preview(showBackground = true)
@Composable
fun MyLayoutView() {
    Text("Hello there SecondActivity")
}