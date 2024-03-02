package com.example.assisgmentandroid2.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.assisgmentandroid2.R
import com.example.assisgmentandroid2.adapter.CourseAdapter
import com.example.assisgmentandroid2.adapter.ViewPagerAdapter
import com.example.assisgmentandroid2.data.Course
import com.example.assisgmentandroid2.databinding.FragmentHomeBinding
import com.example.assisgmentandroid2.dummy.CourseDummy
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class HomeFragment : Fragment() {
    private lateinit var courseList : ArrayList<Course>
    private lateinit var binding : FragmentHomeBinding
    private lateinit var courseAdapter : CourseAdapter
    private lateinit var dbRef : DatabaseReference
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dbRef = FirebaseDatabase.getInstance().getReference("Course")
        setRecycleView()
        setFilter()
    }

    private fun setRecycleView(){
        courseList = CourseDummy.courseList
        courseAdapter = CourseAdapter(context as Context, courseList)
        binding.rvHome.adapter = courseAdapter
        binding.rvHome.layoutManager = LinearLayoutManager(context)
        val empId = dbRef.push().key
        dbRef.child(empId as String).setValue(courseList)
    }

    private fun setFilter() {
        binding.rgHome.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rb_home1 -> {
                    courseList = CourseDummy.courseList
                    courseAdapter = CourseAdapter(context as Context, courseList)
                    binding.rvHome.adapter = courseAdapter
                    binding.rvHome.layoutManager = LinearLayoutManager(context)
                }

                R.id.rb_home2 -> {
                    courseList = arrayListOf()
                    CourseDummy.courseList.forEach {
                        if (!it.isDone) {
                            courseList.add(it)
                        }
                        courseAdapter = CourseAdapter(context as Context, courseList)
                        binding.rvHome.adapter = courseAdapter
                        binding.rvHome.layoutManager = LinearLayoutManager(context)
                    }
                }

                R.id.rb_home3 -> {
                    courseList = arrayListOf()
                    CourseDummy.courseList.forEach {
                        if (it.isDone) {
                            courseList.add(it)

                        }
                        courseAdapter = CourseAdapter(context as Context, courseList)
                        binding.rvHome.adapter = courseAdapter
                        binding.rvHome.layoutManager = LinearLayoutManager(context)
                    }
                }
            }
        }
    }
}