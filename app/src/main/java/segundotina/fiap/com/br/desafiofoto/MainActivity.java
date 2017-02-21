package segundotina.fiap.com.br.desafiofoto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imagens;
    private int[] fotos = {R.drawable.smile01, R.drawable.smile02, R.drawable.smile03,
            R.drawable.smile04, R.drawable.smile05};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagens = (ImageView)findViewById(R.id.imagens);
    }

    public void selecionar(View v){
        Random r = new Random();

        int selecionarFoto = r.nextInt(5);
        imagens.setImageResource(fotos[selecionarFoto]);
    }
}
