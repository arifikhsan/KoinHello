package com.arifikhsan.koinhello.di

import com.arifikhsan.koinhello.model.Friend
import com.arifikhsan.koinhello.model.SchoolCourse
import com.arifikhsan.koinhello.model.Student
import org.koin.dsl.module

val appModules = module {
    // singleton
    single { SchoolCourse() }

    // define new instance every time
    factory { Friend() }

    // new instance every time
    factory { Student(get(), get()) }
}