package com.example.responsi011

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*
import java.text.SimpleDateFormat
import java.util.*

class register : AppCompatActivity() {
    var edDate : EditText? = null
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edDate = this.text_tanggalLahir

        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet (
                view: DatePicker, year: Int, monthOfYear: Int,
                dayOfMonth: Int
            ){
                cal.set(Calendar.YEAR,year)
                cal.set(Calendar.MONTH,monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH,dayOfMonth)
                updateDateInView()

            }
        }

        edDate!!.setOnClickListener(object : View.OnClickListener{
            override fun onClick (view: View){
                DatePickerDialog (this@register,dateSetListener,
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }
        })

        btn_register.setOnClickListener(){
            var nama2 = text_nama.text.toString()
            var alamat2 = text_alamat.text.toString()
            var tgl_lhr = text_tanggalLahir.text.toString()
            var tmp_lhr = tempatLahir.text.toString()

            intent = Intent(this, preview::class.java)
            intent.putExtra("nama2",nama2)
            intent.putExtra("alamat2",alamat2)
            intent.putExtra("tgl_lhr",tgl_lhr)
            intent.putExtra("tmp_lhr",tmp_lhr)
            startActivity(intent)
        }
    }

    private fun updateDateInView (){
        val myFormat = "MM/dd/yyyy"
        val sdf = SimpleDateFormat (myFormat, Locale.US)

        edDate!!.setText(sdf.format(cal.getTime()))
    }
}

