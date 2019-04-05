package br.com.intentcomdados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Clicando no botão entrar
        btnEntrar.setOnClickListener {

            //Verificando se o campo está preenchido
            if(edtNome.text.isNotEmpty()){

                //Capturando o nome digitado
                val nomeCapturado = edtNome.text.toString()

                //Criando o intent para a próxima tela
                val intentTelaBemVindo = Intent(this, TelaBemVindo::class.java)

                //Embutindo o dado  no intent
                intentTelaBemVindo.putExtra("DadoNome", nomeCapturado)

                //Executando o intent
                startActivity(intentTelaBemVindo)

            } else {

                //Mostrando um alerta simples (Toast)
                Toast.makeText(this, "Preencha o campo corretamente.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
