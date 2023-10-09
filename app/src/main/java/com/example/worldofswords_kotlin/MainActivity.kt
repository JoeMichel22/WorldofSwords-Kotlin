package com.example.worldofswords_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subject= findViewById<ImageView>(R.id.ivSubject)
        val name= findViewById<TextView>(R.id.tvName)
        val list= findViewById<RecyclerView>(R.id.rvList)
        val pics= arrayOf(
            PicItem(R.drawable.shotel, "Shotel(East Africa)"),
            PicItem(R.drawable.kpinga, "Kpinga(Central Africa)"),
            PicItem(R.drawable.dao, "Dao(China)"),
            PicItem(R.drawable.katana, "Katana(Japan)"),
            PicItem(R.drawable.saingeom, "Saingeom(Korea)"),
            PicItem(R.drawable.langgai, "Langgai Tinggang(Indonesia)"),
            PicItem(R.drawable.akinaka, "Akinaka(West Asia)"),
            PicItem(R.drawable.kilij, "Kilij(Turkish)"),
            PicItem(R.drawable.scimitar, "Scimitar(Arabian)"),
            PicItem(R.drawable.harpe, "Harpe(Bronze Age Europe)"),
            PicItem(R.drawable.gladius, "Gladius(Iron Age Europe)"),
            PicItem(R.drawable.longsword, "Longsword(Medieval Europe)"),
            PicItem(R.drawable.claymore, "Claymore(Late Medieval Europe)"),
            PicItem(R.drawable.cutlass, "Cutlass(Modern Europe)"),
            PicItem(R.drawable.rapier, "Rapier(Modern Europe)")
        )

        val callBack= {item: PicItem ->
            subject.setImageResource(item.id)
            name.text= item.name
        }

        list.adapter= PicAdapter(pics, callBack)
        list.layoutManager= GridLayoutManager(this, 2)
    }
}