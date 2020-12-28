package com.arifikhsan.koinhello

import androidx.lifecycle.ViewModel
import com.arifikhsan.koinhello.model.Friend
import com.arifikhsan.koinhello.model.SchoolCourse

class MainViewModel(val course: SchoolCourse, val friend: Friend) : ViewModel() {
    fun performAction() {
        println("performing action...")
    }
}