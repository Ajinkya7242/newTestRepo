package com.example.testcompanynew.model

data class DetailsRequest(
    val AppId: Int,
    val DeviceId: String,
    val DeviceToken: String,
    val DeviceType: String,
    val SessionId: String,
    val SourceId: Int,
    val StoreId: Int,
    val UserId: Int
)