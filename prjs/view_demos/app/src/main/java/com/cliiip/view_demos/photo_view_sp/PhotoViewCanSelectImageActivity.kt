package com.cliiip.view_demos.photo_view_sp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.chrisbanes.photoview.PhotoView
import android.app.Activity
import com.cliiip.view_demos.R
import java.io.IOException


class PhotoViewCanSelectImageActivity : AppCompatActivity() {

    private val PICK_IMAGE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_view_can_select_image)

        val photoView = findViewById<PhotoView>(R.id.photo_view_need_select)
        photoView.setImageResource(R.drawable.emoji)
    }

    fun clickToSelectImageBtn(view: View) {
        val intent = Intent()
        intent.setType("image/*")
        intent.setAction(Intent.ACTION_GET_CONTENT)
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {

            val uri = data.data

            try {
                val photoView = findViewById<PhotoView>(R.id.photo_view_need_select)
                photoView.setImageURI(uri) // 可以直接设置 image uri
//                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)
//                photoView.setImageBitmap(bitmap)

            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
    }
}
