package br.com.janelasparaweb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Habilitando JavaScript para as páginas web
        wvPrincipal.settings.javaScriptEnabled = true

        //Logando um endereço web
        wvPrincipal.loadUrl("https://google.com")
    }
}
