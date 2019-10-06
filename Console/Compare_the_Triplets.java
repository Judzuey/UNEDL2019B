package P1;
import java.util.Scanner;
public class Compare_the_Triplets {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x1, y1, z1, x2, y2, z2;

        x1 = teclado.nextInt();
        y1 = teclado.nextInt();
        z1 = teclado.nextInt();
        x2 = teclado.nextInt();
        y2 = teclado.nextInt();
        z2 = teclado.nextInt();
        int A, B;
        A = B = 0;

        if (x1 < x2) {
            B++;
        } else if (x1 > x2) {
            A++;
        }

        if (y1 < y2) {
            B++;
        } else if (y1 > y2) {
            A++;
        }
        if (z1 < z2) {
            B++;
        } else if (z1 > z2) {
            A++;
        }
        System.out.println(A + " " + B);
    }
}
