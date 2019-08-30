package ee.bizware.profile

import ee.bizware.profile.model.Picture
import ee.bizware.profile.model.Profile

fun main(){
    val userAvatar = Picture("d:/pictures/img_201908291230.jpg")
    val avatarHeight = userAvatar.height
    val avatarWidth = userAvatar.width
    println("Uploaded file $avatarHeight x $avatarWidth pixels")
    val user = Profile(25,"JohnSmith@bizware.ee","John","Smith","Dead",userAvatar)
    println("Full name: "+user.fullName)
}