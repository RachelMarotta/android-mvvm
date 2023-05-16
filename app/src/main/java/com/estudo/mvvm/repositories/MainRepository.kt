package com.estudo.mvvm.repositories

import com.estudo.mvvm.rest.RetrofitService

class MainRepository constructor(private val retrofitService : RetrofitService) {

    fun getAllLives() = retrofitService.getAllLives()

}