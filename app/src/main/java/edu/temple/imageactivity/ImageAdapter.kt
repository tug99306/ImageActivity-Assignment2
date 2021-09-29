package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (val _content: Context, var _imageObjects: Array<ImageObject>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>()
{
    class ImageViewHolder(_itemView : View) : RecyclerView.ViewHolder(_itemView){
        var image: ImageView = _itemView.findViewById(R.id.displayImageView)
        var title: TextView =  _itemView.findViewById(R.id.nameText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ImageAdapter.ImageViewHolder {
        return ImageViewHolder(ImageView(parent.context))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        var data = _imageObjects[position]
        holder.title.text = data.description
        holder.image.setImageResource(data.imageId)
    }

    override fun getItemCount(): Int {
        return _imageObjects.size
    }


}