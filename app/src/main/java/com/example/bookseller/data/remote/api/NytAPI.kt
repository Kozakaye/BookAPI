package com.example.bookseller.data.remote.api


import com.example.bookseller.data.remote.model.BooksApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NytAPI {
    @GET("lists/overview.json")
    suspend fun getBooks(
        @Query("api-key") apiKey: String
    ): BooksApiResponse
}