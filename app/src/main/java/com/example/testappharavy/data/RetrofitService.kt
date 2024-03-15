package com.example.testappharavy.data

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("marvel")
    fun getCharactersList(): Call<MutableList<Character>>
}