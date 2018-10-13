package alcoolougasolina.studio.com.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //localizar componentes na tela
        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //recupera valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                // Converter valores strings para numeros
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //alcool / gasolina
                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    //Gasolina
                    textoResultado.setText("É melhor utilizar gasolina");
                } else {
                    //Alcool
                    textoResultado.setText("É melhor utilizar alcool");
                }

            }
        });

    }
}
