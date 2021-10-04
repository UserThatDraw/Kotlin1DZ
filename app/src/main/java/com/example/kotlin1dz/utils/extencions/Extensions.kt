package com.example.kotlin1dz.utils.extencions

import android.widget.EditText

fun EditText.getTextE() = text.toString()
fun EditText.errorText() { error = "Введите текст" }