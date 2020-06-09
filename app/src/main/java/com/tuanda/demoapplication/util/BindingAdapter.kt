package com.tuanda.demoapplication.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("setDate")
fun TextView.setDate(long: Long) {
    this.text =
        SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.ENGLISH).format(Date(long * 1000))
}

@BindingAdapter("setTime")
fun TextView.setTime(long: Long) {
    this.text =
        SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(Date(long * 1000))
}
