package com.github.kuya32.data.model

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

data class Car(
    val carImage: String,
    val year: String,
    val make: String,
    val model: String,
    val color: String,
    val price: String,
    val vin: String,
    val carLat: String,
    val carLong: String,
    val isAvailable: Boolean,
    val checkedOutLast: String,
    @BsonId
    val id: String = ObjectId().toString()
)
