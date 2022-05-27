package deitel.com;

import android.graphics.Color;

public class Usuario {
    public int color;
    public String nombre;

    public Usuario() {
        color= Color.BLACK;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
        color= Color.BLACK;
    }
}
