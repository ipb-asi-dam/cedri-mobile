package com.example.cedri_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        setSupportActionBar(android.support.v7.widget.Toolbar(this))
    }
}