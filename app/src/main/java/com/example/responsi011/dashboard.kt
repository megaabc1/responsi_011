package com.example.responsi011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val bundle: Bundle? = intent.extras
        val email = bundle?.get("email")
        val pw = bundle?.get("pw")
        val nama = bundle?.get("nama")
        val alamat = bundle?.get("alamat")
        val tgl_lhr = bundle?.get("tgl_lhr")

        this.teks_email.setText(email.toString())
        this.teks_pw.setText(pw.toString())
        this.namaa.setText(nama.toString())
        this.alamatt.setText(alamat.toString())
        this.tgl_lhrr.setText(tgl_lhr.toString())
    }
}