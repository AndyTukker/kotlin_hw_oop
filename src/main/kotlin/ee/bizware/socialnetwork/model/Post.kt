package ee.bizware.socialnetwork.model

class Post(
    var title: String,      //заголовок поста: обязателен, может редактироваться
    var body: String = "",  //текст поста: не обязателен, может редактироваться
    var link: String = "",  //ссылка: не обязательна, может редактироваться
    //ссылка на оригинальный пост при перепосте или null для оригинальной записи
    val previousPost: Post? = null,
    val author: User,       //автор записи
    val dateTime: String,   //момент создания
    val place: User         //место публикации, Стена/Timeline
)