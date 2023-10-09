package com.example.worldofswords_kotlin
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PicAdapter(_picItems: Array<PicItem>, _callBack: (PicItem) -> Unit ):
    RecyclerView.Adapter<PicAdapter.PicItemViewHolder>()
{
    private val picItems= _picItems
    private val callBack= _callBack
    inner class PicItemViewHolder(layout : View): RecyclerView.ViewHolder(layout)
    {
        val picView= layout.findViewById<ImageView>(R.id.imageView)
        val textView= layout.findViewById<TextView>(R.id.textView)

        init {
            picView.setOnClickListener{callBack(picItems[adapterPosition])}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PicItemViewHolder
    {
        return PicItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: PicItemViewHolder, position: Int) {
        holder.picView.setImageResource(picItems[position].id)
        holder.textView.text= picItems[position].name
    }

    override fun getItemCount()= picItems.size
}