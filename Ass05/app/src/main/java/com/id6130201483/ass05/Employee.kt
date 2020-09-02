package com.id6130201483.ass05

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(var name: String, var gender: String, var email: String, var salary: Int) :
    Parcelable {

}