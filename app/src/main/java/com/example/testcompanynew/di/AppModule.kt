package com.example.testcompanynew.di

import com.example.testcompanynew.MainActivity
import com.example.testcompanynew.network.ApiInterface
import com.example.testcompanynew.repository.LoginRepository
import com.example.testcompanynew.utils.Constants.BASE_URL
import com.example.testcompanynew.viewmodels.LoginViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.internal.http.RetryAndFollowUpInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    fun providesApiInterface():ApiInterface{
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(ApiInterface::class.java)
    }

    @Provides
    fun provideRepository(apiInterface: ApiInterface)=LoginRepository(apiInterface)

    @Provides
    fun provideViewmodel(repository: LoginRepository)=LoginViewModel(repository)

}