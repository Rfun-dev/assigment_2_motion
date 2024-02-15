package com.example.assisgmentandroid2

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import com.example.assisgmentandroid2.data.Course
import com.example.assisgmentandroid2.databinding.ActivityDetailBinding
import java.text.DecimalFormat

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val course = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("course", Course::class.java)
        } else {
            intent.getParcelableExtra("course")
        }

        binding.imbBackDetail.setOnClickListener {
            finish()
        }
        setView(applicationContext, course as Course)

    }

    private fun setView(context: Context, course : Course) {
        with(binding) {
            tvTitleDetail1.text = course.title
            tvTitleDetail2.text = course.title
            tvQuestiontextDetail.text = context.getString(R.string.questions_text_detail,course.question)
            tvTimeDetail.text = context.getString(R.string.time_text_detail,(course.time / 60), (course.time % 60))
            tvRatingDetail.text = context.getString(R.string.rating_detail,course.rating)
            tvDescriptionDetail.text = course.description
            imvImageDetail.setImageResource(R.drawable.react)
        }
    }


}