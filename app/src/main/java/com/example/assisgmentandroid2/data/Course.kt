package com.example.assisgmentandroid2.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate

@Parcelize
data class Course(
    val title : String,
    val vote : String,
    val minutes : Int,
    val score : String,
    val date : LocalDate,
    val drawable : Int,
    val rating : Float,
    val question : Int,
    val time : Int,
    val description : String,
    var isDone : Boolean
) : Parcelable
