package Herencia;

public class Hija extends Padres implements Habilidades{
    
    public Hija() {
        
    }
    
    public static void main(String[] args) {
        Hija hereda = new Hija();
        System.out.println("*****ATRIBUTOS*****");
        System.out.println("De mi madre herede el color de cabello: " + hereda.getCabello());
        System.out.println("De ambos herede la estatura alta: " + hereda.getEstatura() + " cm");
        System.out.println("De mi padre herede el color de los ojos: " + hereda.getColorOjos());
        System.out.println("\n*****COMPORTAMIENTO*****");
        System.out.println("De mi padre herede: " + hereda.Caracter());
        System.out.println("De mi madre herede: " + hereda.Nada());
        System.out.println("\n*****Habilidad*****");
        System.out.println(hereda.Bailar());
        System.out.println(hereda.Cocinar());   
    }

    public String Bailar() {
        return "Aprendí a bailar por mis primos";
    }

    public String Cocinar() {
        return "Aprendí a cocinar por una tia";
    }

}
