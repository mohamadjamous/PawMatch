package com.example.pawmatch.navigation

import androidx.annotation.StringRes
import com.example.pawmatch.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.text_home)
    object Details : Screen("info", R.string.text_details)
}
