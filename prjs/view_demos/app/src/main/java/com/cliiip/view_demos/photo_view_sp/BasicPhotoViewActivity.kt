package com.cliiip.view_demos.photo_view_sp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cliiip.view_demos.R
import com.github.chrisbanes.photoview.PhotoView



class BasicPhotoViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_photo_view)

        val photoView = findViewById<PhotoView>(R.id.basic_photo_view)
        photoView.setImageResource(R.drawable.emoji)
    }
}
