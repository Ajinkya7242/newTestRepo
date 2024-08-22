package com.example.testcompanynew.model

data class PromotionListResponse(
    val AppId: Int,
    val EnableWineClubSubscription: Boolean,
    val IsCartTransferAvailable: Boolean,
    val IsDisableTopSellers: Boolean,
    val IsEnableCurbsideSlots: Boolean,
    val IsEnableDeliverySlots: Boolean,
    val IsEnablePickupSlots: Boolean,
    val IsExcludeProgramming: Boolean,
    val OnlinePaymentTypeId: Int,
    val PromotionList: List<Promotion>,
    val StoreId: Int,
    val UserId: Int
)