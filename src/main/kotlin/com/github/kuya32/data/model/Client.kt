package com.github.kuya32.data.model

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class Client(
    val fullName: String,
    val email: String,
    val phoneNumber: String,
    val dateOfBirth: String,
    val address: String,
    val license: String,
    val licenseImageUrl: String,
    val notes: String,
    @BsonId
    val id: String = ObjectId().toString()
)
