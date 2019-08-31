package ee.bizware.socialnetwork.model

class Comment(
    val post: Post,
    val author: User,
    var text: String,
    val dateTime: String
) {
}