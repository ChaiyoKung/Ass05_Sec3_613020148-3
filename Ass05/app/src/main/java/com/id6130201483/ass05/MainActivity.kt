package com.id6130201483.ass05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getGender(): String {
        var selectID = radio_gender.checkedRadioButtonId
        var radioChecked = findViewById<RadioButton>(selectID)

        return radioChecked.text.toString()
    }

    fun sendData(v: View) {
        var name = edit_name.text.toString()
        var gender = getGender()
        var email = edit_email.text.toString()
        var salary = edit_salary.text.toString().toInt()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData", Employee(name, gender, email, salary))
        startActivity(intent)
    }

    fun reset(v: View) {
        edit_name.text.clear()
        radio_gender.clearCheck()
        edit_email.text.clear()
        edit_salary.text.clear()
        Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show()
    }
}