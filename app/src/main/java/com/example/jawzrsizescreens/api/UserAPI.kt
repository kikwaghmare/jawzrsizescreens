package com.example.jawzrsizescreens.api

import com.example.jawzrsizescreens.models.User
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

    fun signUp(user: User): Boolean {
        // Logic to perform sign-up using user data
        // Return success or failure status (true or false)
        return true
    }

    // Simulating network call
    fun signIn(mobileNumber: String): Boolean {
        // Logic to perform sign-in using mobile number
        // Return success or failure status (true or false)
        return true
    }

}
