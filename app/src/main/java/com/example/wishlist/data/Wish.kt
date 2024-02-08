package com.example.wishlist.data

data class Wish(
      val id: Long =0L,
      val title: String="",
      val description:String=""
)
object DummyWish{
      val wishlist= listOf(
            Wish(title = "Mobile", description = "Android Smartphone"),
            Wish(title = "Mobile", description = "Android Smartphone"),
            Wish(title = "Mobile", description = "Android Smartphone"),
            Wish(title = "Mobile", description = "Android Smartphone"),
            Wish(title = "Mobile", description = "Android Smartphone"),
            )
}
