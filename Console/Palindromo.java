package P1;
import java.util.Scanner;

public class Palindromo {
Scanner teclado;

    public void ObtenerDatos(){
        teclado = new Scanner(System.in);
        String frase;
        int fin;
        int inicio=0;
        boolean palin=true;
        
        
        
        System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
        frase = teclado.nextLine();
        
        frase = frase.replace(" ", "");
        frase = frase.replace(",", "");
        frase = frase.replace(".", "");
        
        System.out.print(frase);
        
        fin = frase.length()-1;
        
        while(inicio < fin){
            if(frase.charAt(inicio)!=frase.charAt(fin)){
                palin=false;
            }
        inicio++;
        fin--;
        }
        if(palin)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
    }
    public static void main(String[] args) {
        Palindromo pal = new Palindromo();
        pal.ObtenerDatos();
    }
    
}
