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
    double numeroProva = 3;


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



                   int teste =0;
                   int teste2 =0;
                   int resultado =0;
                if (numeroProva == 1) {

                    txtTitulo.setText(var +" "+ var1);
                    //contando os numeros de caracteres em uma String usando a função .length()
                    //forma que eu constrir a contagem dos caracteres
                   teste= (var.length());
                   teste2 =(var1.length());
                   resultado=(teste+teste2);
                   //modo simplificado
                    

                   //como mostrar um int no visor como usando ("" +resultado)
                    txtDescricao.setText(""+resultado);




                }
                if (numeroProva == 2) {

                    txtTitulo.setText(var +" "+ var2);

                    teste= (var.length());
                    teste2 =(var2.length());
                    resultado=(teste+teste2);


                    txtDescricao.setText(""+resultado);
                   // txtDescricao.setText("11");
                } if (numeroProva == 3){

                    txtTitulo.setText(var +" "+ var3);
                    teste= (var.length());
                    teste2 =(var3.length());
                    resultado=(teste+teste2);


                    txtDescricao.setText(""+resultado);
                   // txtDescricao.setText("16");
                }

            }


        });

    }
}
