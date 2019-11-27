package Herencia;
import java.util.*;
public class Padres {
    Scanner teclado;
    
    private float estatura;
    private String colorOjos;
    private String Cabello;

    public Padres() {//Estado inicial de los atributos
        estatura = 1.70f;
        colorOjos = "cafe";
        Cabello = "Oscuro";
    }
    
    public float getEstatura() {
        return estatura;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public String getCabello() {
        return Cabello;
    }
    
    public String Caracter() {
        return "El Caracter/Genio";
    }
    
    public String Nada() {
        return "Nada";
    }
}