package com.arifikhsan.koinhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arifikhsan.koinhello.model.Student
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()
        student.beSmart()

        val student2: Student = get()
        student2.beSmart()
    }
}