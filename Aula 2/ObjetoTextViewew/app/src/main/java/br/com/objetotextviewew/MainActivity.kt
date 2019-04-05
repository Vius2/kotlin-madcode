package br.com.objetotextviewew

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Método disparado quando a janela é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txvTexto.text = "Trabalhando com textos"

        txvTexto2.text = "Olá, Estação Hack"
    }
}
