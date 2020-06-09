package com.tuanda.demoapplication.data.model

import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("temp") val temp: Int,
    @SerializedName("pressure") val pressure: Int,
    @SerializedName("humidity") val humidity: Int,
    @SerializedName("temp_min") val temp_min: Int,
    @SerializedName("temp_max") val temp_max: Int
)