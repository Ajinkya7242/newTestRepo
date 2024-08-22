package com.example.testcompanynew.repository

import com.example.testcompanynew.model.PromotionListResponse
import com.example.testcompanynew.network.ApiInterface
import javax.inject.Inject

class PromotionDetailsRepo @Inject constructor(private val api: ApiInterface){

    suspend fun getAllDetails():PromotionListResponse{

        val response=api.getPromotions()
        return response
    }
}