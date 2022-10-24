package io.github.kmachida12345.sakememo.database.model

import android.net.Uri
import androidx.room.Entity
import io.github.kmachida12345.sakememo.core_model.data.Sake
import java.util.*

@Entity(
    tableName = "sakes",
)
data class SakeEntity(
    val name: String,
    val description: String,
    val drinkAt: Date,
    val photoUri: Uri,
)

fun SakeEntity.asExternalModel() = Sake(
    name = name,
    description = description,
    drinkAt = drinkAt,
    photoUri = photoUri
)
