package com.nearpays.nearpays

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nearpays.nearpaysnfcsdk.NfcScannerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Intent(this,NfcScannerActivity::class.java)
            .apply {
                putExtra("camera",false)
            }.also {
            startActivity(it)
        }

    }

}
