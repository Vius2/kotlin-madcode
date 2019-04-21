package com.example.comunismo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tela_escolha.*

class TelaEscolha : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_escolha)


        txvEscolha.text = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Escolha seu campeão"

        btnLenin.setOnClickListener {

            txvEscolha.text = "Vladimir Ilyich Ulyanov, mais conhecido pelo pseudônimo Lenin (Simbirsk, 22 de abril de 1870 – Gorki, 21 de janeiro de 1924), foi um revolucionário comunista, político e teórico político russo que serviu como chefe de governo da República Russa de 1917 a 1918, da República Socialista Federativa Soviética da Rússia de 1918 a 1922 e da União Soviética de 1922 a 1924. Sob sua administração, a Rússia e em seguida, a União Soviética tornaram-se um Estado socialista unipartidário governado pelo Partido Comunista. Ideologicamente marxistas, suas teorias políticas são conhecidas como leninismo."

            txvNome.text = "Lenin"
        }

        btnStalin.setOnClickListener {

            txvNome.text = "Stalin"

            txvEscolha.text = "Josef Stalin (Gori, 18 de dezembro de 1878 — Moscou, 5 de março de 1953) foi um revolucionário comunista e político soviético de origem georgiana. Governou a União Soviética de meados da década de 1920 até sua morte em 1953, servindo como Secretário Geral do Partido Comunista da URSS de 1922 a 1952, e como primeiro-ministro de seu país de 1941 a 1953. Inicialmente presidindo um estado unipartidário oligárquico que governava pelo sistema de pluralidade, tornando-se de facto o ditador da União Soviética na década de 1930. Ideologicamente ligado à interpretação leninista do marxismo, Stalin ajudou a formalizar essas ideias como marxismo-leninismo, enquanto suas próprias políticas ficaram conhecidas como stalinismo.\n" +
                    "Nascido em uma família pobre em Gori, Império Russo, iniciou sua carreira revolucionária após juntar-se ao Partido Operário Social-Democrata Russo quando jovem. Lá, editou o jornal do partido, o Pravda, e levantou fundos para a facção bolchevique de Vladimir Lenin por meio de roubos, sequestros e redes de proteção. Repetidamente preso, sofreu vários exílios internos. Depois que os bolcheviques tomaram o poder na Rússia durante a Revolução de Outubro de 1917, juntou-se ao comitê Politburo do partido. Serviu na Guerra Civil Russa antes de supervisionar o estabelecimento da União Soviética em 1922. Quando Lenin adoeceu e morreu em 1924, Stalin gradualmente assumiu a liderança do país. Durante seu governo, o \"Socialismo em um Único País\" tornou-se uma doutrina central entre os dogma do partido, e a Nova Política Econômica de seu antecessor foi substituída por uma economia centralizada. Sob o sistema do plano quinquenal, o país passou por uma coletivização e rápida industrialização, mas sofreu interrupções significativas na produção de alimentos que contribuíram para a fome de 1932-1933. Para erradicar aqueles considerados \"inimigos da classe trabalhadora\", instituiu o \"Grande Expurgo\", no qual mais de um milhão de pessoas foram presas e pelo menos 700 000 executados entre 1934 e 1939.\n" +
                    "Seu governo promoveu o marxismo-leninismo no exterior através da Internacional Comunista e apoiou movimentos antifascistas por toda a Europa durante a década de 1930, particularmente na Guerra Civil Espanhola. Em 1939, assinou um pacto de não agressão com a Alemanha Nazista, resultando em uma invasão conjunta da Polônia. Apesar dos contratempos iniciais, o Exército Vermelho repeliu a incursão alemã e capturou Berlim em 1945, pondo fim à Segunda Guerra Mundial na Europa. Os soviéticos anexaram os estados bálticos e ajudaram a estabelecer governos alinhados em toda a Europa Central e Oriental, China e Coréia do Norte. A União Soviética e os Estados Unidos emergiram da guerra como as duas superpotências mundiais. Tensões surgiram entre o Bloco Oriental apoiado pelos soviéticos e o Bloco Ocidental apoiado pelos americanos, dando origem à Guerra Fria. Stalin conduziu seu país através da reconstrução no período pós-guerra, durante a qual desenvolveu uma arma nuclear em 1949. Nestes anos, o país experimentou outra grande fome e uma campanha antissemita que atingiu o auge no complô dos médicos. Stalin morreu em 1953 e acabou sendo sucedido por Nikita Khrushchov, que denunciou seu antecessor e iniciou um processo de desestalinização em toda a sociedade soviética.\n" +
                    "Amplamente considerado uma das figuras mais significativas do século XX, sua imagem foi tema de um culto à personalidade generalizado dentro do movimento marxista-leninista internacional, onde foi considerado um defensor do socialismo e da classe trabalhadora. Desde a dissolução da União Soviética em 1991, manteve popularidade na Rússia e na Geórgia como um líder vitorioso em tempos de guerra que estabeleceu a União Soviética como uma grande potência mundial. Por outro lado, seu governo totalitário tem sido amplamente condenado por supervisionar repressões em massa, limpeza étnica, deportações, centenas de milhares de execuções e fomes que causaram a morte de milhões de pessoas."


        }

        btnMarx.setOnClickListener {

            txvNome.text = "Karl Marx"

            txvEscolha.text = "Karl Marx (Tréveris, 5 de maio de 1818 — Londres, 14 de março de 1883) foi um filósofo, sociólogo, historiador, economista, jornalista e revolucionário socialista. Nascido na Prússia, mais tarde se tornou apátrida e passou grande parte de sua vida em Londres, no Reino Unido. A obra de Marx em economia estabeleceu a base para muito do entendimento atual sobre o trabalho e sua relação com o capital, além do pensamento econômico posterior. Publicou vários livros durante sua vida, sendo O Manifesto Comunista (1848) e O Capital (1867-1894) os mais proeminentes.\n" +
                    "Marx nasceu numa família de classe média em Tréveris, na Renânia prussiana, e estudou nas universidades de Bonn e Berlim, onde se interessou pelas ideias filosóficas dos jovens hegelianos. Depois dos estudos, escreveu para o Rheinische Zeitung, um jornal radical publicado em Colônia, e começou a trabalhar na teoria da concepção materialista da história. Em 1843, mudou-se para Paris, onde começou a escrever para outros jornais radicais e conheceu Friedrich Engels, que se tornaria seu amigo de longa data e colaborador. Em 1849, foi exilado e se mudou para Londres juntamente a sua esposa e filhos, onde continuou a escrever e formular suas teorias sobre a atividade econômica e social. Também fez campanha para o socialismo e tornou-se uma figura significativa na Associação Internacional dos Trabalhadores.\n" +
                    "As teorias de Marx sobre a sociedade, a economia e a política — a compreensão coletiva do que é conhecido como o marxismo — sustentam que as sociedades humanas progridem através da luta de classes (um conflito entre uma classe social que controla os meios de produção e a classe trabalhadora, que fornece a mão de obra para a produção) e que o Estado foi criado para proteger os interesses da classe dominante, embora seja apresentado como um instrumento que representa o interesse comum de todos. Além disso, ele previu que, assim como os sistemas socioeconômicos anteriores, o capitalismo produziria tensões internas que conduziriam à sua autodestruição e substituição por um novo sistema: o socialismo. Ele argumentava que os antagonismos no sistema capitalista, entre a burguesia e o proletariado, seriam consequência de uma guerra perpétua entre a primeira e as demais classes ao longo da história. Isto, associado à sociedade industrial e ao acúmulo de capital, geraria a sua classe antagônica, que resultaria na \"conquista do poder político pela classe operária e, eventualmente, no estabelecimento de uma sociedade sem classes e apátrida — o comunismo — regida por uma livre associação de produtores. Marx ativamente argumentava que a classe trabalhadora deveria realizar uma ação revolucionária organizada para derrubar o capitalismo e provocar mudanças socioeconômicas.\n" +
                    "Elogiado e criticado, Marx tem sido descrito como uma das figuras mais influentes na história da humanidade. Muitos intelectuais, sindicatos e partidos políticos em nível mundial foram influenciados por suas ideias, com muitas variações sobre o seu trabalho base. Marx é normalmente citado, ao lado de Émile Durkheim e Max Weber, como um dos três principais arquitetos da ciência social moderna."

        }

        btnTrotsk.setOnClickListener {

            txvNome.text = "Trótski"

            txvEscolha.text = "Leon Trótski (nascido Liev Davidovich Bronstein; Ianovka, 7 de novembro de 1879 — Coyoacán, 21 de agosto de 1940) foi um intelectual marxista e revolucionário bolchevique, organizador do Exército Vermelho e, após a morte de Lenin, rival de Stalin na disputa pela hegemonia do Partido Comunista da União Soviética (PCUS). Tornou-se figura central da vitória bolchevique na Guerra Civil Russa (1918–1922).\n" +
                    "Nos primeiros tempos da União Soviética, Trótski desempenhou um importante papel político, primeiro como Comissário do Povo (Ministro) para os Negócios Estrangeiros; posteriormente, como organizador e comandante do Exército Vermelho e fundador e membro do Politburo do PCUS, fundado em 1917 para gerenciar a Revolução Bolchevique.\n" +
                    "Afastado do controle do partido por Stalin, Trótski foi expulso deste e exilado da União Soviética, refugiando-se no México, onde veio a ser assassinado por Ramón Mercader, agente da polícia de Stalin. As suas ideias políticas, expostas numa obra escrita de grande extensão, deram origem ao trotskismo, corrente ainda hoje importante no marxismo."
        }


        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()




    }
}
