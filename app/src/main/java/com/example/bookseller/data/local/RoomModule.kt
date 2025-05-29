package com.example.bookseller.data.local

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): BookDatabase {
        return Room.databaseBuilder(context, BookDatabase::class.java, "books_db")
            .build()
    }

    @Provides
    @Singleton
    fun provideBooksDao(database: BookDatabase): BooksDAO{
        return database.bookDao()
    }
}