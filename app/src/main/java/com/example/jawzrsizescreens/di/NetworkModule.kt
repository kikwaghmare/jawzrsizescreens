package com.example.jawzrsizescreens.di

import com.example.jawzrsizescreens.api.UserAPI
import com.example.jawzrsizescreens.utils.Constants.BASE_URL
import com.google.android.datatransport.runtime.dagger.Module
import com.google.android.datatransport.runtime.dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//@InstallIn(SingletonComponent ::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun  provideRetrofit() : Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
    }

    @Singleton
    @Provides
    fun providesUserApi(retrofit: Retrofit) : UserAPI{
        return retrofit.create(UserAPI::class.java)
    }
}