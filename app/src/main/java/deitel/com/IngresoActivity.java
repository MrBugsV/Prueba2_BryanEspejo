package deitel.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class IngresoActivity extends AppCompatActivity {

    public ArrayList<Usuario> usuarios;

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
        if(et_usuario.getText().toString().equals("Bryan")){
            Intent intent = new Intent(IngresoActivity.this, MainActivity.class);
            intent.putExtra("usuario","0");
            startActivity(intent);
        }else if(et_usuario.getText().toString().equals("Espejo")){
            Intent intent = new Intent(IngresoActivity.this, MainActivity.class);
            intent.putExtra("usuario","1");
            startActivity(intent);
        }else{
            Toast.makeText(this,"Usuario Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}