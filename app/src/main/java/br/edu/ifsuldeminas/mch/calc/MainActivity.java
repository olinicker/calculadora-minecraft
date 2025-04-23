package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";

    private Button buttonVirgula;
    private Button buttonZero;
    private Button buttonUm;
    private Button buttonDois;
    private Button buttonTres;
    private Button buttonQuatro;
    private Button buttonCinco;
    private Button buttonSeis;
    private Button buttonSete;
    private Button buttonOito;
    private Button buttonNove;


    private Button buttonPorcentagem;
    private Button buttonDivisao;
    private Button buttonMultiplicacao;
    private Button buttonAdicao;
    private Button buttonSubtracao;


    private String expressaoAnterior = "";
    private String expressao = "";


    private Button buttonIgual;
    private Button buttonReset;
    private Button buttonD;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;

    public boolean verificaSeASinalIgualLadoaLado(String texto) {
        if (texto.isEmpty()) return false;
        char ultimo = texto.charAt(texto.length() - 1);
        return ultimo == '+' || ultimo == '-' || ultimo == '*' || ultimo == '/' || ultimo == '%';
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayerEquals = MediaPlayer.create(MainActivity.this, R.raw.levelup);
        MediaPlayer mediaPlayerReset = MediaPlayer.create(MainActivity.this, R.raw.creeper);
        MediaPlayer mediaPlayerClick = MediaPlayer.create(MainActivity.this, R.raw.click);
        MediaPlayer mediaPlayerSand = MediaPlayer.create(MainActivity.this, R.raw.sand);

        buttonVirgula = findViewById(R.id.buttonVirgulaID);
        buttonZero = findViewById(R.id.buttonZeroID);
        buttonUm = findViewById(R.id.buttonUmID);
        buttonDois = findViewById(R.id.buttonDoisID);
        buttonTres = findViewById(R.id.buttonTresID);
        buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonCinco = findViewById(R.id.buttonCincoID);
        buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSete = findViewById(R.id.buttonSeteID);
        buttonOito = findViewById(R.id.buttonOitoID);
        buttonNove = findViewById(R.id.buttonNoveID);

        buttonDivisao = findViewById(R.id.buttonDivisaoID);
        buttonAdicao = findViewById(R.id.buttonSomaID);
        buttonSubtracao = findViewById(R.id.buttonSubtracaoID);
        buttonPorcentagem = findViewById(R.id.buttonPorcentoID);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacaoID);

        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificaSeASinalIgualLadoaLado(expressao)) {
                    expressao += "/";
                    textViewResultado.setText(expressao);
                    mediaPlayerClick.start();
                }
            }
        });

        buttonAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificaSeASinalIgualLadoaLado(expressao)) {
                    expressao += "+";
                    textViewResultado.setText(expressao);
                    mediaPlayerClick.start();
                }
            }
        });

        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificaSeASinalIgualLadoaLado(expressao)) {
                    expressao += "-";
                    textViewResultado.setText(expressao);
                    mediaPlayerClick.start();
                }
            }
        });

        buttonPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificaSeASinalIgualLadoaLado(expressao)) {
                    expressao += "%";
                    textViewResultado.setText(expressao);
                    mediaPlayerClick.start();
                }
            }
        });

        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!verificaSeASinalIgualLadoaLado(expressao)) {
                    expressao += "*";
                    textViewResultado.setText(expressao);
                    mediaPlayerClick.start();
                }
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "0";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += ".";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "1";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "2";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "3";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "4";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "5";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "6";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "7";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "8";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao += "9";
                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });


        buttonD = findViewById(R.id.buttonDeleteID);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = expressao;
                if(!texto.isEmpty()) {
                    String novaExpressao = texto.substring(1);
                    expressao = novaExpressao;
                }

                if (expressao.isEmpty()) {
                    expressao = "0";
                }

                textViewResultado.setText(expressao);
                mediaPlayerClick.start();
            }
        });

        buttonReset = findViewById(R.id.buttonResetID);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressao = "0";
                textViewResultado.setText(expressao);
                textViewUltimaExpressao.setText("");
                expressaoAnterior = "";
                expressao = "";
                mediaPlayerReset.start();
            }
        });

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayerEquals.start();

                Calculable avaliadorExpressao = null;

                try {

                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    expressaoAnterior = expressao;
                    Double resultado = avaliadorExpressao.calculate();
                    expressao = resultado.toString();

                    textViewUltimaExpressao.setText(expressaoAnterior);
                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Expressão inválida", Toast.LENGTH_SHORT).show();
                    expressao = "0";
                    textViewResultado.setText(expressao);
                    textViewUltimaExpressao.setText("");
                    expressaoAnterior = "";
                    expressao = "";
                    mediaPlayerReset.start();
                    //Log.d(TAG, e.getMessage());
                }
            }
        });
    }
}