package br.com.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class Launch : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Deixando a tela fullscreen, sem barra de status
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN

        )

        setContentView(R.layout.activity_launch)

        //Passando para a próxima janela depois de um espaço de tempo
        Handler() .postDelayed({

            val intentMain = Intent(this, MainActivity::class.java)

            startActivity(intentMain)

            finish()

        },3000)



    }
}
