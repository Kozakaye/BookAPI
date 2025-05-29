package com.example.bookseller.data.repository

import android.util.Log
import com.example.bookseller.data.remote.api.NytAPI
import com.example.bookseller.data.remote.model.BookList
import com.example.bookseller.data.remote.model.BooksApiResponse
import com.example.bookseller.data.remote.model.Results
import com.example.bookseller.domain.BookRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BookRepositoryImpl @Inject constructor(
    val nytAPI: NytAPI
) : BookRepository {
    override suspend fun getBooks(apiKey: String): Results {
        return try {
            val books = nytAPI.getBooks(apiKey)
            Log.d("REPOSITORY", "Response is $books")
            books.results
        } catch (e: Exception) {
            Log.e("REPOSITORY", "Error: ${e.message}")
            throw e
        }
    }
}
