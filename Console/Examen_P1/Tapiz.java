package Examen_P1;
import java.util.*;
import Examen_P1.Habitacion;
public class Tapiz {
Scanner teclado;
float costo, res;

public void ObtenerDatos(){
    teclado = new Scanner(System.in);
    
    System.out.println("Digite el costo por metro^2: ");
    costo = teclado.nextFloat();
}

 public float getCosto() {
        return costo;
    }
    public void setArea(float costo) {
        this.costo = costo;
    }    
    
}
