package Examen_P1;
import java.util.*;
public class Habitacion {
    
    Scanner teclado;
    float ancho, largo, area;
    
    public Habitacion(float x, float y) {
    
        largo = x;
        ancho = y;
}
    
    public void ObtenerDatos(){
      teclado = new Scanner(System.in);
     
      System.out.println("Digite el largo de la habitacion: ");
        largo = teclado.nextFloat();
        System.out.println("Digte el ancho de la habitacion: ");
        ancho = teclado.nextFloat();
         
        area  = (largo*ancho);
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }    
    
}
