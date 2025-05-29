package com.example.bookseller.domain

import com.example.bookseller.data.remote.model.Results

interface BookRepository {
    suspend fun getBooks(apiKey: String): Results
}