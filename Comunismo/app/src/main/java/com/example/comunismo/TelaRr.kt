package com.example.comunismo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tela_rr.*

class TelaRr : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_rr)

        txvRr.text = "  Revolução Russa\n" +
                "\n" +
                "O principal aspecto da Revolução Russa é ela ter sido orientada pela doutrina comunista, desenvolvida pelo filósofo alemão Karl Marx no século XIX – com a ressalva de que tal doutrina foi complementada e acrescida de um plano estratégico por aquele que se tornou o mais importante líder da revolução: Lenin.\n" +
                "Na virada do século XIX para o século XX, a Rússia, então um império czarista que vinha sendo governado por mais de trezentos anos pela mesma dinastia (Romanov), começava a sofrer pressões de ordem econômica e de ordem política. Um dos grandes problemas que a Rússia enfrentava era o atraso tecnológico. O Império Romanov não havia conseguido ainda promover transformações profundas na área da indústria e permanecia sendo uma sociedade profundamente agrária e com uma população insatisfeita, tanto camponeses e operários quanto a classe burguesa que se formava.\n" +
                "Além disso, o Império czarista gastava boa parte de seu orçamento com guerras, como a Guerra Russo-Japonesa, desencadeada entre 1904 e 1905. Nesse contexto, ganharam força os partidos políticos que buscavam dar representação aos setores da sociedade russa mais insatisfeitos com o regime do czar. Além de partidos de matriz liberal, o Partido Operário Social-Democrata Russo (POSDR) destacou-se como um partido de inspiração marxista, porém com grande divergência de pensamento entre seus membros. As tendências divergentes do POSDR polarizaram-se entre os mencheviques, a minoria, e os bolcheviques, a maioria.\n" +
                "Os mencheviques eram liderados por Yuly Martov e Georgy Plekanov e tinham uma postura mais ajustada com o pensamento do marxismo ortodoxo, isto é, defendiam que a revolução comunista na Rússia deveria seguir as etapas definidas por Marx. Sendo assim, a burguesia deveria desenvolver o país por intermédio de uma reforma industrial capitalista profunda, enterrar o regime czarista e só depois a classe operária protagonizaria uma revolução na esteira do comunismo.\n" +
                "Os bolcheviques, que tinham como líder Vladimir Ilitch Ulianov, conhecido como Lenin, propunham uma alternativa diferente daquela sustentada pelo marxismo ortodoxo. Para Lenin, a revolução poderia ser acelerada em um país sem quadros econômicos com alto desenvolvimento capitalista (como era o caso da Rússia). Essa “aceleração” poderia ser operada e protagonizada pela aliança entre a classe operária e o campesinato – sendo que ambos receberiam a orientação de um comitê revolucionário formado por intelectuais e por dirigentes partidários.\n" +
                "Após as rebeliões e greves iniciadas em 1905, o Império Russo procurou articular-se com os liberais para tentar promover reformas que beneficiassem camponeses, operários e burgueses. A saída para isso foi a criação da Duma, isto é, Assembleia de representação popular. Enquanto isso, havia também o processo de organização política dos trabalhadores em torno dos sovietes, isto é, conselhos deliberativos que foram extintos após a retomada da ordem pelo czar e que só voltariam a ter destaque em 1917.\n" +
                "Com a entrada da Rússia em mais uma guerra, a Primeira Guerra Mundial, o poder do czar Nicolau II começou a ficar ainda mais debilitado. Em fevereiro de 1917, uma junção de manifestações, greves e vários atos de insubordinação por parte de camponeses, operários e militares por toda a Rússia provocou a queda do czar e o fim do Império. Esses acontecimentos ficaram conhecidos como Revolução de Fevereiro. Seguiu-se, a partir desses acontecimentos, o que alguns historiadores denominaram de “etapa democrático-burguesa”, constituída de um Governo Provisório, resultante de uma aliança entre o soviete de Petrogrado, que era controlado por trabalhadores e militares, e um poder central controlado pela burguesia liberal.\n" +
                "Essa aliança, entretanto, logo se mostrou frágil. A dualidade dos interesses burgueses e proletários acirrou-se nos meses seguintes. Um dos principais pontos de divergência entre os dois comandos era a continuação da presença na guerra, defendida pelo Governo Provisório e repudiada pelo soviete de Petrogrado. Em abril de 1917, Lenin encaminhou aos bolcheviques as teses, ou propostas, que retirariam a Rússia da guerra e dissolveria o Governo Provisório.\n" +
                "A proposta de Lenin apregoava sobretudo o lema: Todo poder aos sovietes. Lenin e Leon Trotsky foram os principais responsáveis pelo encaminhamento da revolução a um caráter bolchevique. O cenário provocado pela Primeira Guerra Mundial deu as condições favoráveis para tanto, como acentuou o pesquisador Silvio Pons: A visão revolucionária de Lenin nasceu em estreita interação com a experiência e a psicologia da guerra. Ela se robustecia mais com o próprio esquematismo do que com sua retaguarda intelectual, empregando a legitimidade marxista com vistas a uma ruptura política. Lenin compreendeu que a guerra mundial, iniciada como guerra entre estados, trazia o risco de profundo dilaceramento na ordem civil europeia. E, ao mesmo tempo, via as potencialidades que a mobilização bélica e seu impacto social apresentavam para a explicitação de uma nova política de massas.\n" +
                "Em outubro de 1917, Lenin e Trotsky comandaram a Revolução Bolchevique, que depois passou a ser denominada de Revolução de Outubro. A primeira tática da revolução bolchevique foi o chamado comunismo de guerra, usado sobretudo na luta do Exército Vermelho, liderado por Trotsky, contra o Exército Branco, de matriz conservadora e contrarrevolucionária.\n" +
                "De 1919 em diante, a ofensiva bolchevique passou ao plano político e, sobretudo, político-econômico, com a criação da NEP (Nova Política Econômica), desenvolvida por Lenin em 1921. O governo de Lenin assentou as bases do que seriam as repúblicas soviéticas."

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()


    }
}
