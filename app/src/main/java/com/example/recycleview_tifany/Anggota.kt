package com.example.recycleview_tifany

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Anggota (
    val imgAnggota: Int,
    val nameAnggota: String,
    val deskAnggota: String
        ) : Parcelable
