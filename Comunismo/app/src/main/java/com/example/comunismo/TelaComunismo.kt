package com.example.comunismo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tela_comunismo.*

class TelaComunismo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_comunismo)

        txvComi.text = "\n" +
                "Comunismo\n" +
                "\n" +
                "Comunismo (do latim communis - comum, universal) é uma ideologia política e socioeconômica, que pretende promover o estabelecimento de uma sociedade igualitária, sem classes sociais e apátrida, baseada na propriedade comum dos meios de produção.\n" +
                "Um dos seus principais mentores filosóficos, Karl Marx, postulou que o comunismo seria a fase final do desenvolvimento da sociedade humana e que isso seria alcançado através de uma revolução proletária, isto é, uma revolução encabeçada pelos trabalhadores das cidades e do campo. O comunismo puro, no sentido marxista, refere-se a uma sociedade sem classes (sociedade regulada), sem Estado (ácrata ou apátrida) e livre de quaisquer tipos de opressão, onde as decisões sobre o que produzir e quais as políticas devem prosseguir são tomadas democraticamente e permitindo dessa maneira que cada membro da sociedade organizada possa participar do processo, tanto na esfera política e econômica da vida pública e/ou privada. Marx nunca forneceu uma descrição detalhada de como o comunismo poderia funcionar como um sistema econômico (tal foi feito, por Lenin), mas subentende-se que uma economia comunista consistiria de propriedade comum dos meios de produção, culminando com a negação do conceito de propriedade privada do capital, que se refere aos meios de produção na terminologia marxista. No uso moderno, o comunismo é, muitas vezes, usado para se referir ao bolchevismo, na Rússia. Como um movimento político, o sistema comunista teve governos, em regra, com uma preocupação de fundo para com o bem-estar do proletariado, segundo o princípio de cada um segundo as suas capacidades, a cada um segundo as suas necessidades.\n" +
                "Como uma ideologia política, o comunismo é geralmente considerado como a etapa final do socialismo. Este consiste num grupo amplo de filosofias econômicas e políticas ligadas a vários movimentos políticos e intelectuais e a trabalhos de teóricos da Revolução Industrial e da Revolução Francesa. O socialismo seria uma fase prévia necessária de acumulação de capital, antes do advento do comunismo. O comunismo pode-se dizer que é o contrário do capitalismo, oferecendo uma alternativa para os problemas da economia de mercado capitalista e do legado do imperialismo e do nacionalismo. Marx afirma que a única maneira de resolver esses problemas seria pela classe trabalhadora (proletariado), que, segundo Marx, são os principais produtores de riqueza na sociedade e são explorados pelos capitalistas de classe (burguesia). A classe trabalhadora substituiria a burguesia, a fim de estabelecer uma sociedade livre, sem classes ou divisões raciais. As formas dominantes de comunismo, como o leninismo e o maoismo, são baseadas no marxismo, embora cada uma dessas formas tenha modificado as ideias originais. Também existem versões não marxistas do comunismo, como o comunismo cristão e o anarcocomunismo.\n" +
                "As doutrinas comunistas mais antigas, anteriores à Revolução Industrial, punham toda ênfase nos aspectos distributivistas, colocando a igualdade social, isto é, a abolição das classes e estamentos, como o objetivo supremo. Com Karl Marx (1818-1883) e Friedrich Engels (1820-1895), fundadores do chamado \"socialismo científico, a ênfase deslocou-se para a plena satisfação das necessidades humanas, possibilitada pelo desenvolvimento tecnológico: mediante a elevação da produtividade do trabalho humano, a tecnologia proporcionaria ampla abundância de bens, cuja distribuição poderia deixar de ser antagônica, realizando-se a igualdade numa situação de bem-estar geral. A partir dessa formulação, que teve uma profunda influência sobre o comunismo contemporâneo, a sociedade comunista seria o coroamento de uma longa evolução histórica. Os regimes anteriores, principalmente o capitalismo e o socialismo, cumpririam o seu papel histórico ao promover o aumento da produtividade e, portanto, as pré-condições da abundância, que caberia ao comunismo transformar em plena realidade. Enquanto o capitalismo desempenha esse papel mediante a emulação da concorrência, o socialismo deveria manter, em certa medida, essa emulação ao repartir os bens ainda escassos a cada um segundo o seu trabalho. Só o comunismo, que corresponderia ao pleno reino da liberdade e da abundância, poderia instaurar a repartição segundo o princípio de \"a cada um segundo sua necessidade."


        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()



    }
}
