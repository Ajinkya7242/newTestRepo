package com.example.testcompanynew.repository

import com.example.testcompanynew.model.LoginRequestModel
import com.example.testcompanynew.model.LoginResponseModel
import com.example.testcompanynew.network.ApiInterface
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api:ApiInterface){


    suspend fun loginUser(
        AppId: Int,
        AppVersion: String,
        DeviceId: String,
        DeviceManufacturer: String,
        DeviceModel: String,
        DeviceOS: String,
        DeviceOSVersion: String,
        DeviceToken: String,
        DeviceType: String,
        EmailId: String,
        LoginType: String,
        Password: String,
        SourceId: Int,
        StoreId: Int,
        TimeZone: String,
        UserId: Int,
        UserIp: String
    ):Result<LoginResponseModel>{

        val response=api.loginUser(LoginRequestModel(
            AppId,
            AppVersion,
            DeviceId,
            DeviceManufacturer,
            DeviceModel,
            DeviceOS,
            DeviceOSVersion,
            DeviceToken,
            DeviceType,
            EmailId,
            LoginType,
            Password,
            SourceId,
            StoreId,
            TimeZone,
            UserId,
            UserIp
        ))

        return if(response.isSuccessful){
            Result.success(response.body()!!)
        }else{
            Result.failure(Exception(response.errorBody()?.string()))
        }

    }
}