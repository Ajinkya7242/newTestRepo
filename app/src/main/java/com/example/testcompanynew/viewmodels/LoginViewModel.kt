package com.example.testcompanynew.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testcompanynew.model.LoginResponseModel
import com.example.testcompanynew.repository.LoginRepository
import com.example.testcompanynew.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository:LoginRepository):ViewModel(){

    val _response=MutableLiveData<Result<LoginResponseModel>>()
    val reponse:LiveData<Result<LoginResponseModel>> =  _response



    suspend fun loginUser(
        EmailId: String,
        Password: String,
    ){
        viewModelScope.launch{
            val AppId=Utils.getAppId()
            val AppVersion=Utils.AppVersion()
            val DeviceId=Utils.getDeviceId()
            val DeviceManufacturer=Utils.getDeviceManufacturer()
            val DeviceModel=Utils.getDeviceModel()
            val DeviceOS=Utils.getDeviceOS()
            val DeviceOSVersion=Utils.getDeviceOSVersion()
            val DeviceToken=Utils.getDeviceToken()
            val DeviceType=Utils.getDeviceType()
            val LoginType=Utils.getLoginType()
            val SourceId=Utils.getSourceId()
            val StoreId=Utils.getSourceId()
            val TimeZone=Utils.getTimeZone()
            val UserId=Utils.getUserId()
            val UserIp=Utils.getUserIp()
            _response.value=repository.loginUser(
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
            )
        }
    }
}