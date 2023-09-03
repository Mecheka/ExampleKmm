package model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BirdImageResponse(
    @SerialName("author")
    val author: String,
    @SerialName("category")
    val category: String,
    @SerialName("path")
    val path: String
)