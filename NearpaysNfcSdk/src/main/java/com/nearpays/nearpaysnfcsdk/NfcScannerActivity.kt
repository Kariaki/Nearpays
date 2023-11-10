package com.nearpays.nearpaysnfcsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.nearpays.nearpaysnfcsdk.databinding.ActivityNfcScannerPluginBinding

class NfcScannerActivity : AppCompatActivity(){

    private val binding: ActivityNfcScannerPluginBinding by lazy {
        ActivityNfcScannerPluginBinding.inflate(layoutInflater)
    }

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val hostFragment = supportFragmentManager.findFragmentById(R.id.navController)

        navController = hostFragment?.findNavController()!!
        val cameraScan = intent.getBooleanExtra("camera",false)
        if(cameraScan){
            navController.navigate(R.id.cameraScanFragment)
            return
        }
        navController.navigate(R.id.swipeCard)

    }

}