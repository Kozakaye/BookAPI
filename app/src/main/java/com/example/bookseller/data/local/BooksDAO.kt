package com.example.bookseller.data.local

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BooksDAO {
    @Query("Select * FROM `books-table`")
    fun getListOfBooks(): Flow<List<BookEntity>>

    @Query("Select * FROM 'books-table' where primary_isbn13=:primaryKey")
    fun getBook(primaryKey: String): Flow<BookEntity>
}