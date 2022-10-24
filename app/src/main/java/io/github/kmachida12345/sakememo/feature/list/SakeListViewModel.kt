package io.github.kmachida12345.sakememo.feature.list

import io.github.kmachida12345.sakememo.common.core.result.*
import io.github.kmachida12345.sakememo.core_model.data.Sake
import io.github.kmachida12345.sakememo.data.repo.SakeRepository
import kotlinx.coroutines.flow.Flow

class SakeListViewModel(
    private val sakeRepository: SakeRepository
) {
    private val sakeStream: Flow<Result<List<Sake>>> =
        sakeRepository.getSakesStream().asResult()
}