package com.example.bookseller.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("books-table")
data class BookEntity(
    @PrimaryKey val primary_isbn13: String,
    val age_group: String?,
    val amazon_product_url: String?,
    val article_chapter_link: String?,
    val asterisk: Int?,
    val author: String?,
    val book_image: String?,
    val book_image_height: Int?,
    val book_image_width: Int?,
    val book_review_link: String?,
    val book_uri: String?,
    val contributor: String?,
    val contributor_note: String?,
    val created_date: String?,
    val dagger: Int?,
    val description: String?,
    val first_chapter_link: String?,
    val price: String?,
    val publisher: String?,
    val rank: Int?,
    val rank_last_week: Int?,
    val sunday_review_link: String?,
    val title: String?,
    val updated_date: String?,
    val weeks_on_list: Int?
)