package com.lakshya.callingapplication

import android.content.Intent
import android.net.Uri
import android.net.wifi.p2p.WifiP2pManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bttnl: Button =findViewById(R.id.bttn)
        var text:EditText=findViewById(R.id.edit)

        bttnl.setOnClickListener()
        {
            var pno=text.text.toString()
            var intent:Intent= Intent(Intent.ACTION_CALL)
            intent.setData(Uri.parse("tel:$pno"))
            startActivity(intent)


        }







    }
}