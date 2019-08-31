package ee.bizware.socialnetwork

import ee.bizware.socialnetwork.model.Comment
import ee.bizware.socialnetwork.model.Like
import ee.bizware.socialnetwork.model.Post
import ee.bizware.socialnetwork.model.User

fun main(){
    //создание первых двух пользователей
    val firstUser = User(1, "first@mail.ru")
    val secondUser = User(2, "second@yandex.ru")
    //первый пользователь создал у себя новый пост
    val firstPost = Post("Title of first empty post", author = firstUser, place = firstUser, dateTime = "31.08.2019 14:51")
    //второй пользователь сделал к себе перепост
    val secondPost = Post("Re-post", previousPost = firstPost, author = secondUser, place = secondUser, dateTime = "31.08.2019 14:53")
    //первый пользователь поставил лайк перепосту
    val like = Like(author = firstUser, post = secondPost, dateTime = "31.08.2019 14:55")
    //а второй дописал комментарий к оригинальному посту
    val comment = Comment(firstPost, secondUser, "Cool!!!", "31.08.2019 14:47")
    //автор исходного поста добавил в него текст
    firstPost.body = "New text in old post"
    //вывод ленты событий, свыводится текущее состояние всех постов
    firstUser.timeLine()
    //при выводе ленты второго пользователя, внутри перепостов видно текущее состояние оригинальных записей
    secondUser.timeLine()
}