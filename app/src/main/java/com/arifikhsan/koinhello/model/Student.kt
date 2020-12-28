package com.arifikhsan.koinhello.model

class Student(private val course: SchoolCourse, private val friend: Friend) {
    fun beSmart() {
        course.study()
        friend.hangout()
    }
}