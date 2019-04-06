package br.com.objetospinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Propriedades da classe
    val listaFrutas = arrayListOf("Banana", "Maçã", "Pêra", "Melão", "Abacaxi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adaptando array para spiner
       val listaAdaptadaParaSpinner = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listaFrutas)

        //Colocando o array adaptado no spinner
        spnFrutas.adapter = listaAdaptadaParaSpinner


       }

    }