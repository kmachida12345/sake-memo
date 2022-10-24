package io.github.kmachida12345.sakememo.database.dao

import androidx.room.Dao
import androidx.room.Query
import io.github.kmachida12345.sakememo.database.model.SakeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SakeDao {
    @Query(value = "SELECT * FROM sakes")
    fun getSakeEntitiesStream(): Flow<List<SakeEntity>>
}