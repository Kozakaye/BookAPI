package com.example.bookseller.data

import com.example.bookseller.data.remote.api.NytAPI
import com.example.bookseller.data.repository.BookRepositoryImpl
import com.example.bookseller.domain.BookRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(nytAPI: NytAPI): BookRepository {
        return BookRepositoryImpl(nytAPI)
    }
}