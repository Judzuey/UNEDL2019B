package Examen_P1;
import java.util.*;
import Examen_P1.Tapiz;
import Examen_P1.Habitacion;

public class Calculadora {
Scanner teclado;
float TotalCost;


    public void CosTotal(float area, float costo){
        TotalCost = area * costo;
        
    }

public float getTotalCost() {
        return TotalCost;
    }
    public void setTotalCost(float TotalCost) {
        this.TotalCost = TotalCost;
    }   
        
}
