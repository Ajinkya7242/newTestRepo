package com.example.testcompanynew.model

data class LoginResponseModel(
    val ABCCustomerId: String,
    val ABCLoyaltyCardBarcodeImage: String,
    val ABCLoyaltyCardNumber: String,
    val AppId: Int,
    val CartId: Int,
    val CartItemCount: Int,
    val CartTransferCartId: Int,
    val CartTransferProductslist: List<Any>,
    val ContactListId: Int,
    val CustomerEmail: String,
    val CustomerFirstName: String,
    val CustomerImage: String,
    val CustomerLastName: String,
    val CustomerLoyaltyCardNumber: String,
    val CustomerPhoneNumber: String,
    val DeviceId: String,
    val DeviceType: String,
    val ErrorDetail: String,
    val ErrorMessage: String,
    val IsABCStore: Boolean,
    val IsAccess: Boolean,
    val IsAllowCartTransfer: Boolean,
    val IsCaptcha: Boolean,
    val IsCartTransferAvailable: Boolean,
    val IsDummyEmail: Boolean,
    val IsFrequentShopper: Boolean,
    val IsFromSipn: Boolean,
    val IsFromSire: Boolean,
    val IsGooglebot: Boolean,
    val IsNewToStore: Boolean,
    val IsNewUser: Boolean,
    val IsSignUpMailBannedStore: Boolean,
    val IsStoreSignUpCaptcha: Boolean,
    val IsSwitchStore: Boolean,
    val LoyaltyCardId: Int,
    val MessageTitle: String,
    val MessageType: String,
    val NewErrorCode: Int,
    val NewErrorMessage: String,
    val NotificationCount: Int,
    val SessionCustomerId: Int,
    val SessionId: String,
    val SourceId: String,
    val StoreId: Int,
    val SuccessMessage: String,
    val TimeZone: String,
    val UserId: Int
)