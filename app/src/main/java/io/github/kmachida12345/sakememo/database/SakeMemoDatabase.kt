package io.github.kmachida12345.sakememo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import io.github.kmachida12345.sakememo.core_model.data.Sake
import io.github.kmachida12345.sakememo.database.dao.SakeDao

@Database(
    entities = [Sake::class],
    version = 1
)
abstract class SakeMemoDatabase : RoomDatabase() {
    abstract fun sakeDao(): SakeDao
}