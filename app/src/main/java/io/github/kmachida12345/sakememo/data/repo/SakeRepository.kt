package io.github.kmachida12345.sakememo.data.repo

import io.github.kmachida12345.sakememo.core_model.data.Sake
import kotlinx.coroutines.flow.Flow

interface SakeRepository {
    fun getSakesStream(): Flow<List<Sake>>
}