package com.example.fingerprintapp

import android.hardware.biometrics.BiometricPrompt
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CancellationSignal
import android.widget.Toast
import androidx.annotation.RequiresApi

class AuthenticatedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authenticated)
    }
}