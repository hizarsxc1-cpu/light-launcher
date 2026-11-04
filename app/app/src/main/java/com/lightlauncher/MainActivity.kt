package com.lightlauncher

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)
        layout.setBackgroundColor(Color.rgb(18, 20, 25))

        val title = TextView(this)
        title.text = "LIGHT LAUNCHER"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Your Minecraft, Your World."
        subtitle.textSize = 15f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER

        val button = Button(this)
        button.text = "START LAUNCHER"

        val version = TextView(this)
        version.text = "LIGHT LAUNCHER 1.0.0"
        version.setTextColor(Color.GRAY)
        version.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(button)
        layout.addView(version)

        setContentView(layout)
    }
}
