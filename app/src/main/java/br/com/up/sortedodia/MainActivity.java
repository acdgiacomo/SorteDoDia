package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView TextViewTitle;
    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<>();

    @Override // Override esta sobreescrevendo esse metodo...
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Super chama a implementação geral do metodo....
        setContentView(R.layout.activity_main); // Configuração da view de conteudo, significa que esse metodo é
        // utilizado para indicar qual layout sera usado
        // Esse R é a referencia p pasta de res (resource)
        // findViewById - Pega o componente por ID

        messages.add("Seu dia vai ser bom (talvez).");
        messages.add("Tenha um bom dia amigo!");
        messages.add("Hoje você vai ganhar um bitcoin.");
        messages.add("Não crie expectativas, porque se der errado, a decepção é menor :D.");
        messages.add("Sorte? Isso não existe.");
        messages.add("Tomara que sua vida melhore, mas se não melhorar, lembre-se que sempre pode ficar pior.");

        TextViewTitle = findViewById(R.id.txt_FramePrincipal_Title);
        buttonAction = findViewById(R.id.btn_FramePrincipal_Sortear);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = new Random().nextInt(messages.size());
                String message = messages.get(position);
                TextViewTitle.setText(message);
            }
        };

        buttonAction.setOnClickListener(listener);
    }
}