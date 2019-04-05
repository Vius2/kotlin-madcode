package br.com.vaivem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        //Clicando no botão e voltando para a tela anterior
        btnVoltar.setOnClickListener {

            //Comando para dispensar uma janela da pilha
            finish()

        }
    }
}
