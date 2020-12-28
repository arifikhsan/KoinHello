package com.arifikhsan.koinhello

import androidx.lifecycle.ViewModel
import com.arifikhsan.koinhello.model.Friend
import com.arifikhsan.koinhello.model.SchoolCourse

class MainViewModel(private val course: SchoolCourse, private val friend: Friend) : ViewModel() {
    fun performAction() {
        println("performing action...")

        course.study()
        friend.hangout()
    }
}