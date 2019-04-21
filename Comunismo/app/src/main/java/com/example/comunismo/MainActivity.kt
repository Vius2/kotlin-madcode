package com.example.comunismo

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Colocando musica de fundo

        var mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.hinourss)
        mediaPlayer?.start()

        //Clicando nos botôes e passando para as próximas telas

        btnComunismo.setOnClickListener {

            //Comando para passar para a próxima tela

            val intentTelaComunismo = Intent(this, TelaComunismo::class.java)

            //Executando o comando

            startActivity(intentTelaComunismo)

        }

        btnRr.setOnClickListener {

            val intentTelaRr = Intent(this, TelaRr::class.java)

            startActivity(intentTelaRr)

        }

        btnBonus.setOnClickListener {

            val intentTelaBonus = Intent(this, TelaBonus::class.java)

            startActivity(intentTelaBonus)

        }

        btnChampion.setOnClickListener {

            val intentTelaEscolha = Intent(this, TelaEscolha::class.java)

            startActivity(intentTelaEscolha)

        }

        //fazendo texto se mover (no activity main precisa adicionar um android:ellipsize="marques" ao text)
        txvCme.setSingleLine()
        txvCme.isSelected = true
        txvCme.text = "★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★"

        //mais um texto que se move
        txvCmo.setSingleLine()
        txvCmo.isSelected = true
        txvCmo.text = "★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★Comunismo★"

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

    }
}
