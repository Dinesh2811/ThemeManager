package com.dinesh.theme.app

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.dinesh.theme.R

open class ToolbarMain : ThemePreference() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentViewLayout(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        val selectThemeItem = menu.findItem(R.id.action_select_theme)
        selectThemeItem?.isVisible = true
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_select_theme -> {
                super.onOptionsItemSelected(item)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}