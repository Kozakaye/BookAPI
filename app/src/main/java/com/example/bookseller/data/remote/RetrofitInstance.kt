package com.example.bookseller.data.remote

import com.example.bookseller.data.remote.api.NytAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitInstance {
    @Provides
    @Singleton
    fun provideBaseUrl(): String = "https://api.nytimes.com/svc/books/v3/"

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl: String): Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideNytAPI(retrofit: Retrofit): NytAPI{
        return retrofit.create(NytAPI::class.java)
    }
}