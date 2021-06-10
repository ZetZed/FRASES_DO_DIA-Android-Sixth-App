package com.zetzed.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
                "Para hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
                "Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz.",
                "Cada manhã é a maneira do destino de dizer-lhe que o seu propósito na vida ainda está para ser cumprido.",
                "Acorde e enfrente os desafios da vida de frente. Caso contrário, a vida se tornará um grande desafio.",
                "Não permita que desvalorizem os seus esforços e os seus sentimentos. Pelo contrário, acredite sempre nas suas capacidades.",
                "Nunca desista de um sonho só por causa do tempo que você vai levar para realizá-lo. O tempo vai passar de qualquer forma."
        };

        int numero = new Random().nextInt(7); // 0 1 2 3 4 5 6 .... nextInt = Para ser numero Inteiro, (7) total de numeros...

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]); //setText = Coloca o Texto...que está no array frases

    }
}