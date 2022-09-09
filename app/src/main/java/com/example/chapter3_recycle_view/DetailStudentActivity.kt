package com.example.chapter3_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_student.*

class DetailStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student)

        var getData = intent.getSerializableExtra("detailStudent") as ListStudent
        imgDetail.setImageResource(getData.image)
        txtNamaDetail.text = getData.nama
        txtNimDetail.text = getData.nim

    }
}