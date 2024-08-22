package com.example.testcompanynew.model

data class LoginRequestModel(
    val AppId: Int,
    val AppVersion: String,
    val DeviceId: String,
    val DeviceManufacturer: String,
    val DeviceModel: String,
    val DeviceOS: String,
    val DeviceOSVersion: String,
    val DeviceToken: String,
    val DeviceType: String,
    val EmailId: String,
    val LoginType: String,
    val Password: String,
    val SourceId: Int,
    val StoreId: Int,
    val TimeZone: String,
    val UserId: Int,
    val UserIp: String
)