package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (val _content: Context, _imageObjects: Array<ImageObject>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    class imageViewHolder(_itemView : View) : RecyclerView.ViewHolder(_itemView){
        val imageView = _itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return imageViewHolder(ImageView(parent.context))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}