package com.example.prep1.permissions

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import com.example.prep1.R
import kotlinx.android.synthetic.main.activity_main7.*

class MainActivity7 : AppCompatActivity() {

    var extPermCode=1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        perm1.setOnClickListener {
           if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
               == PackageManager.PERMISSION_GRANTED){
               Toast.makeText(this,"Permission granted",Toast.LENGTH_SHORT).show()
           }else{
               if (ActivityCompat.shouldShowRequestPermissionRationale(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)){
                   Toast.makeText(this,"Should show request permission",Toast.LENGTH_SHORT).show()
                   reqPerm()
               }else{
                   Toast.makeText(this,"Permission not there",Toast.LENGTH_SHORT).show()
                   reqPerm()
               }
           }
        }



        perm2.setOnClickListener {

        }


    }

    fun reqPerm(){
        requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),extPermCode)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (grantResults.size>0 && grantResults.get(0)==PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"Permission granted successfully",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Permission declined",Toast.LENGTH_SHORT).show()
        }

    }


}