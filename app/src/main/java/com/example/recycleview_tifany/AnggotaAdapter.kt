package com.example.recycleview_tifany

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnggotaAdapter (private val context: Context, private val anggota: List<Anggota>, val listener: (Anggota) -> Unit)
    : RecyclerView.Adapter<AnggotaAdapter.AnggotaViewholder>() {

    class AnggotaViewholder(view: View): RecyclerView.ViewHolder(view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        val deskAnggota = view.findViewById<TextView>(R.id.tv_item_description)

            fun bindView(anggota: Anggota, listener: (Anggota) -> Unit){
                imgAnggota.setImageResource(anggota.imgAnggota)
                nameAnggota.text = anggota.nameAnggota
                deskAnggota.text = anggota.deskAnggota
                itemView.setOnClickListener{
                    listener(anggota)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewholder {
        return AnggotaViewholder(
            LayoutInflater.from(context).inflate(R.layout.profile_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnggotaViewholder, position: Int) {
        holder.bindView(anggota[position], listener)
    }

    override fun getItemCount(): Int = anggota.size


}