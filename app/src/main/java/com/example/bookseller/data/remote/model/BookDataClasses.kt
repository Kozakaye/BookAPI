package com.example.bookseller.data.remote.model

data class BooksApiResponse(
    val status: String,
    val copyright: String,
    val num_results: Int,
    val results: Results
)

data class Results(
    val bestsellers_date: String,
    val next_published_date: String,
    val previous_published_date: String,
    val published_date: String,
    val published_date_description: String,
    val lists: List<BookList>
)

data class BookList(
    val books: List<Book>
)

data class Book(
    val age_group: String,
    val amazon_product_url: String,
    val article_chapter_link: String,
    val asterisk: Int,
    val author: String,
    val book_image: String,
    val book_image_height: Int,
    val book_image_width: Int,
    val book_review_link: String,
    val book_uri: String,
    val buy_links: List<BuyLink>,
    val contributor: String,
    val contributor_note: String,
    val created_date: String,
    val dagger: Int,
    val description: String,
    val first_chapter_link: String,
    val isbns: List<Isbn>,
    val price: String,
    val primary_isbn10: String,
    val primary_isbn13: String,
    val publisher: String,
    val rank: Int,
    val rank_last_week: Int,
    val sunday_review_link: String,
    val title: String,
    val updated_date: String,
    val weeks_on_list: Int
)

data class BuyLink(
    val name: String,
    val url: String
)

data class Isbn(
    val isbn10: String,
    val isbn13: String
)
