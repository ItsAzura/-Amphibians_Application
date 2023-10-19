package com.example.amphibians.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmphibiansItem (
    @SerialName(value = "name")
    val name: String,

    @SerialName(value = "type")
    val type: String,

    @SerialName(value = "description")
    val description: String,

    @SerialName(value = "img_src")
    val imgSrc: String,
)