package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
      @PrimaryKey(autoGenerate = true)
      val id: Long =0L,
      @ColumnInfo(name = "wish-table")
      val title: String="",
      @ColumnInfo(name = "wish-table")
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
