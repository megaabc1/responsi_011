package com.example.responsi011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle: Bundle? = intent.extras
        val nama = bundle?.get("nama")
        val alamat = bundle?.get("alamat")
        val tgl_lhr = bundle?.get("tgl_lhr")
        val tmp_lhr = bundle?.get("tmp_lhr")

        var namaa = nama.toString()
        var alamatt = alamat.toString()
        var tgl_lhrr = tgl_lhr.toString()
        var tmp_lhrr = tmp_lhr.toString()

        btn_login.setOnClickListener(){
            var email = text_email.text.toString()
            var pw = text_password.text.toString()
            if(email=="reza@gmail.com" && pw=="12345"){
                intent = Intent(this, dashboard::class.java)
                intent.putExtra("email",email)
                intent.putExtra("pw",pw)
                intent.putExtra("nama",namaa)
                intent.putExtra("alamat",alamatt)
                intent.putExtra("tgl_lhr",tgl_lhrr)
                intent.putExtra("tmp_lhr",tmp_lhrr)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext,"ID / Password Salah", Toast.LENGTH_SHORT).show()
            }
        }
        btn_daftar.setOnClickListener(){
            intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}