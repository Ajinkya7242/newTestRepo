package com.example.testcompanynew.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testcompanynew.model.PromotionListResponse
import com.example.testcompanynew.repository.PromotionDetailsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PromotionViewmodel @Inject constructor(private val repo: PromotionDetailsRepo):ViewModel(){


    private var _response=MutableLiveData<PromotionListResponse>()
    private var response:LiveData<PromotionListResponse> = _response


    fun getPromotions(){

        viewModelScope.launch {
            _response.value=repo.getAllDetails()
        }
    }


}