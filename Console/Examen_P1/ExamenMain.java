package Examen_P1;
import java.util.*;
import Examen_P1.Tapiz;
import Examen_P1.Habitacion;
public class ExamenMain {

    public static void main(String[] args) {
        ExamenMain main = new ExamenMain();
        Habitacion cuarto = new Habitacion(12, 10);
        Tapiz tapiz = new Tapiz();
        Calculadora calcu = new Calculadora();
        cuarto.ObtenerDatos();
        cuarto.getArea();
        tapiz.ObtenerDatos();
        tapiz.getCosto();
        calcu.getTotalCost();
        
        
    }
    
}
