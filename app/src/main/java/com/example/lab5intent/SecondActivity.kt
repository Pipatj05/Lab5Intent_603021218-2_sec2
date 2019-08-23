package com.example.lab5intent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data  = intent.extras
        var newStudent = data?.getParcelable<Student>(  "stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "Student Name : " + newStudent?.name
        ageText.text = "Student Age : " + newStudent?.age
    }

    fun onClickClose(view: View) {
        finish()
    }
}

