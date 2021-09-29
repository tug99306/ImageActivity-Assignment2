package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imageAdapter: ImageAdapter

        val recycler = findViewById<RecyclerView>(R.id.recycler)


        var imageArray = arrayOf(
            ImageObject("Eagle", R.drawable.eagle)
            , ImageObject("Hawk", R.drawable.hawk)
            , ImageObject("Lovebird", R.drawable.lovebird)
            , ImageObject("Stella the Owl", R.drawable.owlstellatu)
            , ImageObject("Parakeet", R.drawable.parakeet)
            , ImageObject("Parrot", R.drawable.parrot)
            , ImageObject("Penguin", R.drawable.penguin)
            , ImageObject("Puffin", R.drawable.puffin)
            , ImageObject("Strawberry Finch", R.drawable.strawberryfinch)
            , ImageObject("Turtle Dove", R.drawable.turtledove)
        )

        recycler.layoutManager = GridLayoutManager(this,2)
        imageAdapter = ImageAdapter(this, imageArray)
        recycler.adapter = imageAdapter







}

}