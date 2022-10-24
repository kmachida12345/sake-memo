package io.github.kmachida12345.sakememo.data.repo

import io.github.kmachida12345.sakememo.core_model.data.Sake
import io.github.kmachida12345.sakememo.database.dao.SakeDao
import io.github.kmachida12345.sakememo.database.model.SakeEntity
import io.github.kmachida12345.sakememo.database.model.asExternalModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class OfflineSakeRepository(
    private val sakeDao: SakeDao
) : SakeRepository {
    override fun getSakesStream(): Flow<List<Sake>> {
        return sakeDao.getSakeEntitiesStream().map {
            it.map(SakeEntity::asExternalModel)
        }
    }
}