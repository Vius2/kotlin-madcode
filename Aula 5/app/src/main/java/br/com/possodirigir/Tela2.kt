package br.com.possodirigir

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        //Resgatando o nome de usuário indicado na Main
        val nomeResgatado = intent.getStringExtra("NomeUsuario")

        //Colocando o nome resgatado no txv
        txvNome.text = nomeResgatado

        //Preenchendo o spinner
        val arrayIdades = arrayListOf<Int>()

        for (umaIdade in 0..100){
            arrayIdades.add(umaIdade)

        }

        val arrayAdaptado = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, arrayIdades)
        spnIdade.adapter = arrayAdaptado


        //Verificando a idade e exibindo o resultado
        btnCalcular.setOnClickListener {

            //Capturando a idade selecionada
            val idadeSelecionada = spnIdade.selectedItem.toString().toInt()

            //Comparando a idade capturada

            if(idadeSelecionada >=18 && idadeSelecionada <=90){

                txvResultado.text = "Pode dirigir"

            }else{

                txvResultado.text = "Não pode dirigir..."


            }


        }


        btnVoltar.setOnClickListener{
            finish()
        }




    }
}
