package deitel.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class IngresoActivity extends AppCompatActivity {

    ArrayList<Usuario> usuarios;

    EditText et_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Bryan"));
        usuarios.add(new Usuario("Espejo"));

        et_usuario = findViewById(R.id.et_usuario);
    }

    public void OnClicIngresar(View view){
        if(et_usuario.equals("Bryan")){

        }
    }
}