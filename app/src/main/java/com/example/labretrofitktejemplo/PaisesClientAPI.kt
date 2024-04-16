package com.example.labretrofitktejemplo

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface PaisesClientAPI {
//    @GET("/d8834a8c7808406fa569f8460bcee436/paises")
//    suspend fun getPaises(): Response<List<Paises>>

    @GET("/blogdis413/wp-json/paises/v1/listar")
    fun getPaises2(): Call<List<Paises>>

    @POST("/blogdis413/wp-json/paises/v1/agregar")
    fun agregar(@Body paises: Paises): Call<Paises>

    @PUT("/blogdis413/wp-json/paises/v1/modificar")
    fun modificar(@Body paises: Paises): Call<Paises>

    @PUT("/blogdis413/wp-json/paises/v1/eliminar")
    fun eliminar(@Body paises: Paises): Call<Paises>



}