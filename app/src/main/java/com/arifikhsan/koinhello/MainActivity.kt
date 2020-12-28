package com.arifikhsan.koinhello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arifikhsan.koinhello.model.Student
import org.koin.android.ext.android.get
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // lazy
    private val lazyViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>()
        student.beSmart()

        val student2: Student = get()
        student2.beSmart()

//        full injection
//        val viewModel = getViewModel<MainViewModel>()
//        viewModel.performAction()

        doSomething()
    }

    private fun doSomething() {
        lazyViewModel.performAction()
    }
}