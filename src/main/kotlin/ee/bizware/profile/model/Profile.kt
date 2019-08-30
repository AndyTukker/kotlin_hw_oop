package ee.bizware.profile.model

class Profile(
    val id: Int,
    val login: String,
    val firstName: String,
    var surName: String,
    var status: String,
    var avatar: Picture
){
    val fullName: String
        get() = "$firstName $surName"
}