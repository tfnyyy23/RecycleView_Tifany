package com.example.recycleview_tifany

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anggotaList = listOf<Anggota>(
            Anggota(
                R.drawable.dhinda_images,
                nameAnggota = "Dhinda Anniza Cahyaningwidhi",
                deskAnggota = "Namanya Dhinda Anniza Cahyaningwidhi, biasa dipanggil Dhinda. Bersekolah di SMK Telkom Purwokerto, kelas XI RPL 7 dan nomor absennya 08."
            ),
            Anggota(
                R.drawable.lia_images,
                nameAnggota = "Evrilia Elsyabila",
                deskAnggota = "Namanya Evrilia Elsyabila, biasa dipanggil Lia. Bersekolah di SMK Telkom Purwokerto, kelas XI RPL 7 dan nomor absennya 10."
            ),
            Anggota(
                R.drawable.shinta_images,
                nameAnggota = "Shinta Nuriyah",
                deskAnggota = "Namanya Shinta Nuriyah, biasa dipanggil Shinta. Bersekolah di SMK Telkom Purwokerto, kelas XI RPL 7 dan nomor absennya 31."
            ),
            Anggota(
                R.drawable.fany_images,
                nameAnggota = "Tifany Fadilah Ahnaf",
                deskAnggota = "Namanya Tifany Fadilah Ahnaf, biasa dipanggil Fany. Bersekolah di SMK Telkom Purwokerto, kelas XI RPL 7 dan nomor absennya 33."
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv_profile)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = AnggotaAdapter(this, anggotaList){
            val intent = Intent (this, DetailProfileActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}