package com.id6130201483.ass05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showData()
    }

    private fun showData() {
        var data = intent.extras
        var employee = data?.getParcelable<Employee>("empData")

        text_name.text = employee?.name
        text_gender.text = employee?.gender
        text_email.text = employee?.email
        text_salary.text = employee?.salary.toString()
    }

    fun close(v: View) {
        finish()
    }
}