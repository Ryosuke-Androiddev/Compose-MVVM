package com.example.compose_mvvm.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.compose_mvvm.db.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun todoDao(): ToDoDao
}