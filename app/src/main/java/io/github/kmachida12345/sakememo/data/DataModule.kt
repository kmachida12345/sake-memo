package io.github.kmachida12345.sakememo.data

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.kmachida12345.sakememo.data.repo.OfflineSakeRepository
import io.github.kmachida12345.sakememo.data.repo.SakeRepository

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindsSakeRepository(
        sakeRepository: OfflineSakeRepository
    ): SakeRepository
}