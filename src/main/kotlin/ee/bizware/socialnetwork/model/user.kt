package ee.bizware.socialnetwork.model

//при создании нового пользователя обязательно заполняется
//уникальный id и логин (e-mail)
class User (
    val id: Long,
    var login: String
) {
    var name: String = ""
    var phone: String = ""
    var email: String = ""
    fun timeLine(){
        //выборка из базы всех постов, опубликованных в ленте этого пользователя ( post.place = this )
        //и отображение их в хронологическом порядке
        println("Timeline of ${this.id}")
    }
}