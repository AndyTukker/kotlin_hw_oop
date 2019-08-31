package ee.bizware.socialnetwork.model

class Like(
    val author: User,
    val post: Post,
    val dateTime: String
)