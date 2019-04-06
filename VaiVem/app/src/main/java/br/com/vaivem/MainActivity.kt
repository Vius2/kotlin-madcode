package br.com.vaivem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Clicando no botão e passando para a próxima tela

        btnProxima.setOnClickListener {

            //Comando para passar para a próxima tela

            val intentTela2 = Intent(this, Tela2::class.java)

            //Executando o comando

            startActivity(intentTela2)

        }

        btnRED.setOnClickListener {

            val intenttelaRed = Intent(this, telaRed::class.java)


            startActivity(intenttelaRed)


        }



    }
}