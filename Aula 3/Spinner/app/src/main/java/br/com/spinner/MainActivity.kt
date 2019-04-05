package br.com.spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = arrayListOf<String>("Morango","Melão","Banana","Uva","Ameixa")
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,frutas)

        spn_frutas.adapter = adapter
    }
}
