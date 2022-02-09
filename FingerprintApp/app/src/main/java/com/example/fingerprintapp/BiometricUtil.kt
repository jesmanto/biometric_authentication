//package com.example.fingerprintapp
//
//import android.Manifest
//import android.content.Context
//import android.content.pm.PackageManager
//import androidx.core.app.ActivityCompat
//import androidx.core.hardware.fingerprint.FingerprintManagerCompat
//
//
//
//
//object BiometricUtil {
//    /**
//     * Check if biometric hardware is supported by the device
//     */
//    fun isHardwareSupported(context: Context): Boolean {
//        val fingerprintManager = FingerprintManagerCompat.from(context)
//        return fingerprintManager.isHardwareDetected
//    }
//
//    /**
//     * Check if there is a matching registered fingerprint with that of the user
//     */
//    fun isFingerPrintAvailable(context: Context): Boolean {
//        val fingerprintManager = FingerprintManagerCompat.from(context)
//        return fingerprintManager.hasEnrolledFingerprints()
//    }
//
//    /**
//     * Check if permission has been granted in the app
//     */
//    fun isPermissionGranted(context: Context): Boolean {
//        return ActivityCompat.checkSelfPermission(context, Manifest.permission.USE_FINGERPRINT) ==
//                PackageManager.PERMISSION_GRANTED;
//    }
//}