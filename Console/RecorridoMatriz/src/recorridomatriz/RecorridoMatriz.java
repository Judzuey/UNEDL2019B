package recorridomatriz;
import java.util.Scanner;

public class RecorridoMatriz {
Scanner teclado;

    public void ObtenerDatos() {
        teclado = new Scanner(System.in);
        int num = 0,res = 0;
        System.out.print("Digite el tamaño de la matriz: ");
        num = teclado.nextInt();
        int num1 = num, num2;
        int[][] matriz = new int[num1][num1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("digite la posicion[" + i + "," + j + "]= ");
                num2 = teclado.nextInt();
                matriz[i][j] = num2;
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Diagonal Principal");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (i == j) {
                        System.out.print(matriz[i][j] + " ");
                    }
                }
            }
            System.out.println("\n");
        System.out.println("Diagonal Secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 2 && j == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
                if (i == 1 && j == 1) {
                    System.out.print(matriz[i][j] + " ");
                }
                if (i == 0 && j == 2) {
                    System.out.print(matriz[i][j] + " ");
                }
            } 
        } System.out.println("Resultado: " + res);
        System.out.println("\n");
    }
    public static void main(String[] args) {
        RecorridoMatriz m = new RecorridoMatriz();
        m.ObtenerDatos();
    }
}
