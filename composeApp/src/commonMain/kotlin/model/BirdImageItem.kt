package model

import kotlinx.serialization.Serializable

@Serializable
data class BirdImageItem(
    val author: String,
    val category: String,
    val path: String
)