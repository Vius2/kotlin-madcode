package br.com.teladelacamento

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class TelaLaunch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Retirando a barra de status
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_tela_launch)

        //Passando para a próxima janela depois de um espaço de tempo
        Handler().postDelayed({

            //Criando Intent para Main
            val intentParaMain = Intent(this, MainActivity::class.java)

            //Executando o intent
            startActivity(intentParaMain)

            //Finalizando tela atual
            finish()

        }, 2000)

    }
}
