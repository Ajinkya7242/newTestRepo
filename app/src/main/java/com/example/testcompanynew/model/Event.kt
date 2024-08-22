package com.example.testcompanynew.model

data class Event(
    val Address1: String,
    val Address2: String,
    val AppId: Int,
    val City: String,
    val Currency: String,
    val EPrice: Double,
    val EventDescription: String,
    val EventEndDt: String,
    val EventEndTime: String,
    val EventFreeStatus: Boolean,
    val EventId: Int,
    val EventName: String,
    val EventPrice: String,
    val EventStartDt: String,
    val EventStartTime: String,
    val EventType: String,
    val IsEventAddressSameAsStoreAddress: Boolean,
    val SendNotification: Boolean,
    val SessionCusId: Int,
    val State: String,
    val StatusId: Int,
    val StoreId: Int,
    val StoreLatitude: Double,
    val StoreLongitude: Double,
    val UserId: Int,
    val Zip: String
)