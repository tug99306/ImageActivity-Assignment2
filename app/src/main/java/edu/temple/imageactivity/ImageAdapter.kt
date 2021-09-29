package edu.temple.imageactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (var _context: Context, var _imageObjects: Array<ImageObject>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>()
{
    val inflater = LayoutInflater.from(_context)
    class ImageViewHolder(_itemView : View) : RecyclerView.ViewHolder(_itemView){
        var image: ImageView = _itemView.findViewById(R.id.image)
        var title: TextView =  _itemView.findViewById(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ImageViewHolder {
        var view = inflater.inflate(R.layout.recycler_layout,parent, false)
        return ImageViewHolder(view)
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