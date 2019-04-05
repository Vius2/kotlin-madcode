package br.com.objectedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Método disparado quando o btnEntrar for tocado
        btnEntrar.setOnClickListener {

            //Verificando se os campos estão preenchidos
            if (edtUsuario.text.isNotEmpty() && edtSenha.text.isNotEmpty()){

                //Verificando se usuário e senha estão corretos
                val nomeUsuario = edtUsuario.text.toString()
                val senha = edtSenha.text.toString()

                if(nomeUsuario == "Admin" && senha == "1234"){

                    txvResposta.text = "Bem vindo, $nomeUsuario."

                } else {

                    txvResposta.text = "Usuário ou senha incorretos."
                }

            } else {

                txvResposta.text = "Preencha os campos."
            }
        }
    }
}
