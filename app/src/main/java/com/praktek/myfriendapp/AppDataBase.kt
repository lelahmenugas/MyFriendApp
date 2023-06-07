package com.praktek.myfriendapp

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class AppDataBase: RoomDatabase() {
    abstract fun myFriendDao():MyFriendDao

    companion object{
        var INSTANCE: AppDataBase? = null

        fun getAppDataBase(context: Context): AppDataBase?{
            if (INSTANCE == null){
                synchronized(AppDataBase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDataBase::class.java, "MyFriendAppDB").build()
                }
            }
            return INSTANCE
        }
        fun destroyDataBase(){
            INSTANCE=null
        }
    }
}