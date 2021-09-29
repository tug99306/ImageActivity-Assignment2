package edu.temple.imageactivity

class ImageObject (var description: String, val imageId: Int){

    fun getTitle() : String {
        return description
    }

    fun getImgId() : Int {
        return imageId
    }

    fun setTitle(title : String) : String{
        this.description = title
        return title
    }

}