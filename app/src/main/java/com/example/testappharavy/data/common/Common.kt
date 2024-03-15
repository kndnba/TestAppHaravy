package com.example.testappharavy.data.common

import com.example.testappharavy.data.RetrofitClient
import com.example.testappharavy.data.RetrofitService

object Common {
        private const val BASE_URL = "https://www.simplifiedcoding.net/demos/"
        val retrofitService : RetrofitService
            get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}