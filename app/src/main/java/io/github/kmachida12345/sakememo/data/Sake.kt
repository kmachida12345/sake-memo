package io.github.kmachida12345.sakememo.data

import android.net.Uri
import java.util.Date

data class Sake(
    val name: String,
    val description: String,
    val drinkAt: Date,
    val photoUri: Uri,
)
