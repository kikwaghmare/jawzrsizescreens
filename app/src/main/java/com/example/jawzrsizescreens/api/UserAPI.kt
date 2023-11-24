package com.example.jawzrsizescreens.api

import com.example.jawzrsizescreens.models.UserRequest
import com.example.jawzrsizescreens.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("/users/signup")
    suspend fun signUp(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/users/signIn")
    suspend fun signIn(@Body userRequest: UserRequest) : Response<UserResponse>



}