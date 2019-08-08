package com.cliiip.view_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBasicImageActivityBtn(view: View) {
        val intent = Intent(this, BasicImageActivity::class.java).apply {
        }
        startActivity(intent)
    }

    fun clickBasicPhotoViewActivityBtn(view: View) {
        val intent = Intent(this, BasicPhotoViewActivity::class.java).apply {
        }
        startActivity(intent)
    }
}
