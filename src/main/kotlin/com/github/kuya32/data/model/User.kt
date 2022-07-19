package com.github.kuya32.data.model

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class User(
    val firstName: String,
    val lastName: String,
    val username: String,
    val accountImageUrl: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
    @BsonId
    val id: String = ObjectId().toString()
)
