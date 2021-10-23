package com.example.recycleview_tifany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anggota = intent.getParcelableExtra<Anggota>(MainActivity.INTENT_PARCELABLE)

        val imgAnggota = findViewById<ImageView>(R.id.img_item_photo)
        val nameAngota = findViewById<TextView>(R.id.tv_item_name)
        val deskAngota = findViewById<TextView>(R.id.tv_item_description)

        imgAnggota.setImageResource(anggota?.imgAnggota!!)
        nameAngota.text = anggota.nameAnggota
        deskAngota.text = anggota.deskAnggota
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}