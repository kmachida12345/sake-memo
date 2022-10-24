package io.github.kmachida12345.sakememo.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providesSakeMemoDatabase(
        @ApplicationContext context: Context
    ): SakeMemoDatabase = Room.databaseBuilder(
        context,
        SakeMemoDatabase::class.java,
        "sakememo-database"
    ).build()
}