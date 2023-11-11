package com.dinesh.theme.app

import android.content.Context
import android.content.Intent
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.FrameLayout
import androidx.activity.OnBackPressedCallback
import com.dinesh.theme.R
import com.dinesh.theme.util.Constants.getLaunchActivity
import com.dinesh.theme.util.sharedPreferences
import com.google.android.material.appbar.MaterialToolbar

class ThemeManager(private val context: Context) {
    lateinit var parentLayout: FrameLayout
    lateinit var v: View
    lateinit var toolbar: MaterialToolbar
    private val LAUNCHER_ACTIVITY by lazy { getLaunchActivity(context) }

    fun applyTheme(theme: Int = R.style.Theme_Material3, layout: Int? = null) {
        var currentTheme by context.sharedPreferences("Theme", R.style.Theme_Material3)
        currentTheme = theme
        context.setTheme(currentTheme)

        layout?.let { setContentViewLayout(it) }
        (context as AppCompatActivity).onBackPressedDispatcher.addCallback(context, onBackPressedCallback)
    }

    private fun setContentViewLayout(layout: Int) {
        (context as AppCompatActivity).setContentView(R.layout.toolbar_layout_v1)
        parentLayout = context.findViewById(R.id.frameLayoutMain)
        toolbar = context.findViewById(R.id.toolbar)
        context.setSupportActionBar(toolbar)

        v = LayoutInflater.from(context).inflate(layout, parentLayout, false)
        parentLayout.addView(v)
        val classNameAsString = LAUNCHER_ACTIVITY?.name

        if (saveLastClassNameList.size > 0) {
            if (this::class.java == saveLastClassNameList.first || LAUNCHER_ACTIVITY == saveLastClassNameList.first) {
                toolbar.navigationIcon = null
                if (classNameAsString != LAUNCHER_ACTIVITY?.name && this::class.java.name != LAUNCHER_ACTIVITY?.name){
                    toolbar.setNavigationIcon(R.drawable.baseline_home_24)
                }
            } else{
                toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_24)
            }
        }

        toolbar.setNavigationOnClickListener {
            if (classNameAsString != LAUNCHER_ACTIVITY?.name){
                parentLayout.removeAllViews()
                context.startActivity(Intent(context, LAUNCHER_ACTIVITY))
                context.finish()
            } else{
                parentLayout.removeAllViews()
                LAUNCHER_ACTIVITY?.let { context.onBackNavigationAction(it) }
            }
        }
    }

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            LAUNCHER_ACTIVITY?.let { (context as AppCompatActivity).onBackNavigationAction(it) }
        }
    }

}


