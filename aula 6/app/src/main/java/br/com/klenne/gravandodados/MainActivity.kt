package br.com.klenne.gravandodados

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Propriedades de Classe
    var acessoSharedPref : SharedPreferences? = null
    var editorSharedPref : SharedPreferences.Editor? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Atribuindo valores aod objetos do SharedPref
        acessoSharedPref = getSharedPreferences("meusDados", Context.MODE_PRIVATE)
        editorSharedPref = acessoSharedPref!!.edit()


        //Gravando dados
        btnGravar.setOnClickListener {

            //Verificando se o campo está preenchido
            if(edtDado.text.isNotEmpty()){

                //Capturando o texto digitado
                val textodigitado = edtDado.text.toString()

                //Gravando o texto
                editorSharedPref!!.putString("dado", textodigitado)
                editorSharedPref!!.apply()

                edtDado.text.clear()

                Toast.makeText(this, "Dado gravado com sucesso", Toast.LENGTH_LONG).show()

            } else {

                Toast.makeText(this, "Preencha o campo corretamente >:(", Toast.LENGTH_LONG).show()

            }


        }

        //Carregando dados
        btnCarregar.setOnClickListener {

            //Verificando se existe um dado gravado
            if(acessoSharedPref!!.contains("dado")){

                //Resgatando dado
                val dadoResgatado = acessoSharedPref!!.getString("dado", "")

                txvResultado.text = dadoResgatado


            }


        }




    }
}
