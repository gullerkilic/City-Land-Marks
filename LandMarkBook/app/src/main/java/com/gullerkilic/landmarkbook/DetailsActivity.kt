package com.gullerkilic.landmarkbook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent
        val landmarkName = intent.getStringExtra("name")
        textView.text = landmarkName

        val landmarkId = intent.getIntExtra("images", 0)

        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,landmarkId)
        imageView.setImageBitmap(selectedBitmap)

    }
}