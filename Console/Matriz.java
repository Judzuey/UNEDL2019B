package P1;
import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int num = 0;
        int resultado=0;
        int resultado2=0;
        num = teclado.nextInt();
        //System.out.println(num);
        int num1=0; 
        int[][] matriz = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
   for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
               // System.out.print(matriz[i][j] + " ");
            }
            //System.out.println();
        }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == j) {
                        resultado = resultado + matriz[i][j];
                      
                    }
                }
            }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i+j == num-1){
                    resultado2 += matriz[i][j];
                }
            }
        }
        int resultado3=0;
        resultado3 = resultado2 - resultado;
       resultado3 = Math.abs(resultado3);
        System.out.println(resultado3);
  
    }
}