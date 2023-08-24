package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] frases = {
            "Não crie falsas esperanças, desista de uma vez!",
            "Nada é tão horrível quanto você!",
            "Se alguém te ofender sem você merecer, volte lá e mereça!",
            "O não você já tem, agora falta buscar a humilhação!",
            "Seu maior problema é você!",
            "Lute como nunca, perca como sempre!",
            "É só uma fase ruim, logo tudo vai piorar!",
            "O caminho é longo, mas a derrota é certa!",
            "Nunca foi azar, sempre foi incompetência",
            "Quando você ouvir alguém dizendo para você desistir, escute-o e desista!",

            "Deus é fiel, você não!",
            "Você é mais fraco do que pensa, DESISTA!",
            "A maior derrota é acreditar que você é capaz.",
            "Só dará errado se você tentar!",
            "Nunca é tarde para desistir!",
            "No começo é difícil, mas no final tudo dá errado.",
            "Errar ontem, aprender hoje, desistir amanhã!",
            "Se vir a luz no fim do túnel, corra pois é um trem!",
            "A melhor parte do sonho é quando percebemos que é impossível realizá-lo.",

            "Não deixe que uma frase motivacional melhore seu dia de merda!",
            "Espalhe amor na força do ódio.",
            "Calma, vai dar tudo certo... Mas não para você!",
            "Quem está sempre na merda, não tem dia ruim.",
            "O lado bom de ser feio é que sua namorada te ama de verdade, o lado ruim é que você não tem namorada!",
            "Mais um dia, mais uma derrota!",
            "Essa semana, quem quiser me derrubar, vai ter que me levantar primeiro",
            "Melhor uma pedra no caminho, do que duas nos rins, beba álcool e tenha cirrose também!",
            "Só para lembrar, nem sua mãe te ama!",
            "Você nasceu para perder!",

            "Nunca subestime sua incapacidade.",
            "Nada é impossível para Deus! Mas você não é Deus, então é impossível para você!",
            "ACORDA!!! O fracasso te espera!",
            "A morte é inevitável!",
            "Seja feliz a base de remédios!",
            "Plágio economiza tempo!",
            "A inteligência artificial não é párea para a sua estupidez natural!",
            "Não pense que tudo está acabado só porque uma coisa ruim aconteceu. Você ainda viverá MUITAS coisas ruins e nem se lembrará mais disso.",
            "Você é capaz de TUDO! Até de acreditar nisso.",
            "Está sentindo que o mundo não está do seu lado? Você está certo não está.",

            "Um dia você vai parar, olhar para trás, se lembrar de tudo isso que passou e só um pensamento estará em sua mente: Realmente, pior do que está, fica!",
            "Você nasceu para sonhar. Conquistar, já é outra história.",
            "O sucesso te espera, e você pode procurar, por muito tempo, por toda sua vida, com toda sua garra, e mesmo assim você nunca o irá encontrar!",
            "Você não nasceu para ganhar.",
            "Não deixe uma vitória te abalar.",
            "Tente uma, duas, 10 vezes! Tente até onde você conseguir... Conseguir provar que não vai dar certo!",
            "Quer um conselho? Nem tente.",
            "Na dúvida, desista!",
            "Tá feliz? Espera que passa.",
            "Todos têm direito a opinião, desde que não seja uma opinião patética.",

            "Você pode se enxugar com uma toalha molhada, mas não pode se molhar com uma toalha seca.",
            "Quem não odeia ninguém, não tem coração!",
            "Ele/Ela ainda sente algo por você...Nojo!",
            "Se você quiser. Se você se esforçar. Se você treinar. Se você entrar de cabeça. Se você se concentrar. Nada garante que você vai conseguir.",
            "Trabalhe duro, dê o melhor de si, seja o melhor de todos! E veja o filho do dono ser promovido em seu lugar!",
            "Um dia você vai perceber que toda aquela atenção, a dedicação, o amor e o tempo que foi investido naquele relacionamento, não serviram de nada.",
            "Bom dia! Que este dia seja repleto de derrotas.",
            "Uma mulher/homem te cantou? Era um sonho.",
            "Ela/Ele não está offline, você que está bloqueado!",
            "Está tudo dando certo na sua vida... Aí você acorda desse pesadelo!",

            "Acaricie sua mão. Finja que é outra pessoa!",
            "Bloqueie suas fotos no Facebook e Instagram!. Evite que mais pessoas sintam nojo de você!!",
            "Ele/Ela ainda tem lembranças de você... Lembranças de raiva e ódio!",
            "Ele/Ela ainda sente algo por você... Ânsia de vômito!",
            "Saboreie os momentos sob os holofotes. Eles não irão durar muito!!",
            "Sua cara metade. Virou gay!!",
            "Não desanime com essa derrota. Amanhã tem mais!!!",
            "Se você vai se atrasar, então se atrase de verdade. Não dois minutinhos. Atrase-se uma hora e saboreie seu café da manhã!",
            "Finalmente ela/ele olhou pra você, e te achou feio.",
            "Dia dos Namorados, Dia do Amigo. Um dia inventam uma data de algo que você tenha!!!",

            "Seu amigo lembrou de você, caloteiro!",
            "Você tem uma vida social feliz, no The Sims.",
            "Talvez as coisas mudem... Para a pior!!!",
            "Sonhos são como arco-íris. Somente os bobos correm atrás deles!!!",
            "Que a força do ódio esteja com você para vencer mais esse dia de merda, bom dia!",
            "Nunca pare de ser uma má pessoa por causa de pessoas boas!",
            "Não importa quantas vezes a vida te derrubar, o importante é ficar sempre no chão.",
            "O mal de Judas, foi se meter na vida de Cristo!",
            "Se até a atualização do PC pode falhar, por que você não?",
            "A mentira é sempre o melhor caminho para tudo.",

            "Se você ganhasse 1 real de cada pessoa do mundo por vitórias conquistadas... Você deveria ao mundo inteiro!",
            "Sextou com S de Sofrimento!",
            "Quintou com Q de Quero morrer!",
            "Está tudo tão difícil parece que o universo está conspirando contra você, mas acredite, o universo está cagando pra sua existência!",
            "Não se deixe abater pelos fracassos do passado, amanhã tem muito mais!",
            "Sextou com S de Solidão!",
            "Jesus te ama, por que não conviver com você diariamente.",
            "Se filha da puta voasse, tu não ia enxergar o céu!",
            "Não importa a cor do céu, quem faz o dia ser uma merda é você!"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrases(View view){

        TextView texto = findViewById(R.id.textFrase);
        int numeroAleatorio = new Random().nextInt(90);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);
    }

    public void share (View view){



    }
}