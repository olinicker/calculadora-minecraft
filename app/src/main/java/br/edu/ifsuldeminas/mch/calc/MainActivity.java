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
    private Button buttonIgual;

    private Button buttonReset;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MediaPlayer mediaPlayerEquals = MediaPlayer.create(MainActivity.this, R.raw.levelup);
        MediaPlayer mediaPlayerReset = MediaPlayer.create(MainActivity.this, R.raw.creeper);

        buttonReset = findViewById(R.id.buttonResetID);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResultado.setText("");
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
                    String expressao = "5+1+4*2";
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    Double resultado = avaliadorExpressao.calculate();

                    textViewUltimaExpressao.setText(expressao);
                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });
    }
}