package br.com.possodirigir

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Passando nome indicado para a próxima tela quando o botão continuar for tocado
        btnContinuar.setOnClickListener {

            //Verificando se o campo está preenchido
            if(edtNome.text.isNotEmpty()){


                val intentTela2 = Intent (this, Tela2::class.java)

                intentTela2.putExtra("NomeUsuario", edtNome.text.toString())

                startActivity(intentTela2)

            } else {

                Toast.makeText(this,"Preencha o campo corretamente >:(", Toast.LENGTH_LONG).show()

            }

        }

    }
}
