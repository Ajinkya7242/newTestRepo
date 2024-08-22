package com.example.testcompanynew.network

import com.example.testcompanynew.model.LoginRequestModel
import com.example.testcompanynew.model.LoginResponseModel
import com.example.testcompanynew.model.PromotionListResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import javax.inject.Singleton


interface ApiInterface {

    @POST("Login/LoginCustomer")
    suspend fun loginUser(
        @Body request: LoginRequestModel
    ):Response<LoginResponseModel>

    @POST("Store/PromotionGetList")
    suspend fun getPromotions(): PromotionListResponse

}