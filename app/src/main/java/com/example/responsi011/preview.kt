package com.example.responsi011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.activity_preview.tempatLahir
import kotlinx.android.synthetic.main.activity_register.*

class preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        val bundle: Bundle? = intent.extras
        val nama2 = bundle?.get("nama2")
        val alamat2 = bundle?.get("alamat2")
        val tgl_lhr = bundle?.get("tgl_lhr")
        val tmp_lhr = bundle?.get("tmp_lhr")

        this.namaa.setText(nama2.toString())
        this.alamatt.setText(alamat2.toString())
        this.tempatLahir.setText(tmp_lhr.toString())
        this.tgl_lahir.setText(tgl_lhr.toString())

        btn_login.setOnClickListener(){
            var nama3 = namaa.text.toString()
            var alamat3 = alamatt.text.toString()
            var tgl_lhr2 = tgl_lahir.text.toString()
            var tmp_lhr2 = tempatLahir.text.toString()

            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nama",nama3)
            intent.putExtra("alamat",alamat3)
            intent.putExtra("tgl_lhr",tgl_lhr2)
            intent.putExtra("tmp_lhr",tmp_lhr2)
            startActivity(intent)
        }
    }
}
