package io.github.kmachida12345.sakememo.feature.list

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.kmachida12345.sakememo.common.core.result.*
import io.github.kmachida12345.sakememo.core_model.data.Sake
import io.github.kmachida12345.sakememo.data.repo.SakeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class SakeListViewModel @Inject constructor(
    private val sakeRepository: SakeRepository
) : ViewModel() {
    private val sakeStream: Flow<Result<List<Sake>>> =
        sakeRepository.getSakesStream().asResult()
}