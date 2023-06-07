package com.praktek.myfriendapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyFriend (
    @PrimaryKey(autoGenerate = true)
    val nama : String,
    val kelamin : String,
    val email : String,
    val telp: String,
    val alamat: String
)

