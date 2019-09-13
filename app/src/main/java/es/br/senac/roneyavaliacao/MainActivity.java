package es.br.senac.roneyavaliacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declarando as variaveis do tipo String
    String var = "Pipoca";
    String var1 = "Amanteigada";
    String var2 = "Nomal";
    String var3 = "com Nutella";


    //declarando variavel do tipo double
    double numeroProva = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // instancia de um elemento de texto do android


        final TextView txtTitulo = (TextView) findViewById(R.id.txtTitulo);

        final TextView txtDescricao = (TextView) findViewById(R.id.txtDescricao);


        // botão que executa a tranformar


        final Button btnTransformar = (Button) findViewById(R.id.btnTranformar);
        btnTransformar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (numeroProva == 1) {

                    txtTitulo.setText(var +" "+ var1);



                    txtDescricao.setText("17");




                }
                if (numeroProva == 2) {

                    txtTitulo.setText(var +" "+ var2);
                    txtDescricao.setText("11");
                } if (numeroProva == 3){

                    txtTitulo.setText(var +" "+ var3);
                    txtDescricao.setText("16");
                }

            }


        });

    }
}
