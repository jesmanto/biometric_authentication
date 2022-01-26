package com.example.fingerprintapp

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.DialogInterface

import android.R.attr.negativeButtonText

import android.R.attr.description

import android.R.attr.subtitle

import android.hardware.biometrics.BiometricPrompt




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}