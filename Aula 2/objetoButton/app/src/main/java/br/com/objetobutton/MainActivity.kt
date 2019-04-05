package br.com.objetobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Método disparado quando o btnRaphael for tocado
        btnRaphael.setOnClickListener {

            txvResposta.text = "Sanzio"
        }
        //Método disparado quando o btnLeonardo for tocado
        btnLeonardo.setOnClickListener {

            txvResposta.text = "da Vinci"
        }
    }
}
