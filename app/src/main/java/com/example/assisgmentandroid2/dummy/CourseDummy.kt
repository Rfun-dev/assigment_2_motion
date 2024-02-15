package com.example.assisgmentandroid2.dummy

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.assisgmentandroid2.R
import com.example.assisgmentandroid2.data.Course
import java.sql.Date
import java.time.LocalDate
import java.util.ArrayList

object CourseDummy {
    val text = arrayOf(
        "Home",
        "Search",
        "Exams",
        "Wishlist",
        "Account"
    )

    val icon = arrayOf(
        R.drawable.home,
        R.drawable.search,
        R.drawable.question,
        R.drawable.bookmark,
        R.drawable.person,
    )
    val courseList = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        arrayListOf(
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                false
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                false
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                false
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                false
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                true
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                false
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                true
            ),
            Course(
                "React",
                "11/100",
                321,
                "9/10",
                LocalDate.now(),
                R.drawable.react,
                4.9F,
                10,
                120,
                "10 point awarded for a correct answer and no marks for a incorrect answer. \\nTap on options to select the correct answer. \\nTap on the bookmark icon to save interesting questions.\\nClick submit if you are sure you want to complete all the questions\\n",
                true
            )
        )
    } else {
        TODO("VERSION.SDK_INT < O")
    }
}