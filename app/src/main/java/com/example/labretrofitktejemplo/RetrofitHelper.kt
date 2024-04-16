package com.example.labretrofitktejemplo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
//    val baseurl = "https://crudcrud.com/api/d8834a8c7808406fa569f8460bcee436/"
    val baseurl = "https://www.uajms.edu.bo/blogdis413/wp-json/paises/v1/"
    fun getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}