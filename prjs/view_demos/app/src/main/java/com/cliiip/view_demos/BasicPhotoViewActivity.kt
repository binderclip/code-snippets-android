package com.cliiip.view_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.chrisbanes.photoview.PhotoView



class BasicPhotoViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_photo_view)

        val photoView = findViewById<PhotoView>(R.id.photo_view)
        photoView.setImageResource(R.drawable.emoji)
    }
}
