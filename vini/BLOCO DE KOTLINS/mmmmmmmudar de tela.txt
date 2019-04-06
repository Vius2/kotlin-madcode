package br.com.multitelas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProxima.setOnClickListener {

            //Criando o comando para passar de tela

            val intentParaTela2 = Intent(this, Tela2::class.java)

            //executando o comando
            startActivity(intentParaTela2)



        }


    }
}
