package com.example.assisgmentandroid2.adapter

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.assisgmentandroid2.DetailActivity
import com.example.assisgmentandroid2.R
import com.example.assisgmentandroid2.data.Course
import com.example.assisgmentandroid2.databinding.ItemLayoutBinding
import com.example.assisgmentandroid2.dummy.CourseDummy
import kotlin.time.Duration.Companion.minutes

class CourseAdapter(val context : Context, private val courseList : ArrayList<Course>) : RecyclerView.Adapter<CourseAdapter.ViewHolder>() {
    class ViewHolder(val binding : ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = courseList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder.binding){
            with(courseList[position]){
                tvTitle.text = title
                tvMin.text = context.getString(R.string.minutes_course,minutes)
                tvQuestionVote.text = vote
                tvScore.text = score
                tvDate.text = date.toString()
                imvItemLayout.setImageDrawable(ContextCompat.getDrawable(context,drawable))
                btnAllHome.setOnClickListener {
                    isDone = !isDone
                    if(isDone){
                        btnAllHome.setBackgroundDrawable(context.getDrawable(R.drawable.radius_box_white))
                        btnAllHome.text = context.getString(R.string.revisit)
                        btnAllHome.setTextColor(context.getColor(R.color.white))
                        tvQuestionVote.visibility = View.GONE
                        tvQuestionText.visibility = View.GONE
                        tvMin.visibility = View.GONE
                        tvTimeDetail.visibility = View.GONE
                        tvScore.visibility = View.VISIBLE
                        tvScoreText.visibility = View.VISIBLE
                        tvDate.visibility = View.VISIBLE
                    }else{
                        btnAllHome.text = context.getString(R.string.continue_test)
                        btnAllHome.setTextColor(context.getColor(R.color.white))
                        tvQuestionVote.visibility = View.VISIBLE
                        tvQuestionText.visibility = View.VISIBLE
                        tvMin.visibility = View.VISIBLE
                        tvTimeDetail.visibility = View.VISIBLE
                        tvScore.visibility = View.GONE
                        tvScoreText.visibility = View.GONE
                        tvDate.visibility = View.GONE
                    }
                }
                imbDeleteDetail.setOnClickListener {
                    courseList.remove(courseList[position])
                    notifyItemRemoved(position)
                    notifyItemRangeChanged(position,courseList.size)
                }
                cvItemCourse.setOnClickListener {
                    val intent = Intent(context,DetailActivity::class.java)
                    intent.putExtra("course",courseList[position])
                    context.startActivity(intent)
                }
            }
        }
    }
}