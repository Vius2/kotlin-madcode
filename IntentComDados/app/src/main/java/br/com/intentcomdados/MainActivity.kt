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

        //Clicando no botão voltar
        btnEntrar.setOnClickListener {

            //Verificando se o campo está preenchido
            if(edtNome.text.isNotEmpty()){

                //Capturando no nome digitado
                val nomeCapturado = edtNome.text.toString()

                //Criando o intent para a Tela2
                val intentTelaBemVindo = Intent(this, TelaBemVindo::class.java)

                //Embutindo o dado dentro do intent
                intentTelaBemVindo.putExtra("DadoNome", nomeCapturado)

                //Executando o intent
                startActivity(intentTelaBemVindo)

            } else {

                //Mostrando um alerta simples (Toast)
                val alertaToast = Toast.makeText(this, "preencha o campo corretamente >:(", Toast.LENGTH_LONG)

                //Exibindo o alerta
                alertaToast.show()
            }



        }



    }
}
