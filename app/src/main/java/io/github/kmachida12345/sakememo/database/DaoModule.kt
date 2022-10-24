package io.github.kmachida12345.sakememo.database

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.kmachida12345.sakememo.database.dao.SakeDao

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {
    @Provides
    fun providesSakeDao(
        sakeMemoDatabase: SakeMemoDatabase
    ): SakeDao {
        return sakeMemoDatabase.sakeDao()
    }
}