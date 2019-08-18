package com.practice.joshua.kotlinpractice

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


    }

    private fun viewImagePractice(imageId: Int) {
        val intent = Intent(this, DetailActivity::class.java) // change to DetailActivity
        intent.setAction(Intent.ACTION_VIEW)
        startActivity(intent)
    }
}
