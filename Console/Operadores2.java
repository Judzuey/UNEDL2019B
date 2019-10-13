package P1;
import java.util.*;
public class Operadores2 {
Scanner teclado;

int opc;
char opc2; 
float num1,num2,res;

    public void ObtenerDatos(){
        teclado = new Scanner(System.in);

do{
    System.out.println("\n***MENU INICIAL***");
        System.out.println(""
                + "1.-Aritmetico\n"
                + "2.-Relacional\n"
                + "3.-Equidad\n"
                + "4.-Logicos\n"
                + "5.-Condicional\n"
                + "6.-Iteracion\n"
                + "0.- SALIR");
        opc = teclado.nextInt();
        if(opc == 0){
            break;
        }else{
            System.out.println("Digite un numero: ");
            num1 = teclado.nextInt();
            System.out.println("Digte otro numero: ");
            num2 = teclado.nextInt();
        }       
   switch(opc){
       case 1:
           System.out.println("*****ARITMETICOS*****");
           System.out.println("\n"
                   + "+\n"
                   + "-\n"
                   + "*\n"
                   + "/\n"
                   + "%\n"
                   + "0.- SALIR");
           opc2 = teclado.next().charAt(0);
           if(opc2 != 43){
           break;
       }
    switch(opc2){
        case 1:
            if(opc2 == 43){
                res = num1+num2;
                System.out.println("Suma: " + (int) res);
            }
            break;
            
        case 2:
            res = num1 - num2;
            System.out.println("Resta: " + (int) res);
            break;
            
        case 3:
            res = num1 * num2;
            System.out.println("Multiplicacion: " + (int) res);
            break;
            
        case 4:
            res = num1 / num2;
            System.out.println("División: " +  res);
            break;
            
        case 5:
            res = num1 % num2;
            System.out.println("Residuo: " + res);
            break;
    }
    break;
       case 2:
           System.out.println("*****RELACIONALES*****");
           System.out.println(""
                   + "<\n"
                   + ">\n"
                   + "<=\n"
                   + ">=\n"
                   + "0.-SALIR");
           opc2 = teclado.next().charAt(0);
    switch(opc2){
        case 1:
            System.out.println((boolean)(num1 < num2));
            break;
        case 2:
            System.out.println((boolean)(num1 > num2));
            break;
        case 3:
            System.out.println((boolean)(num1 <= num2));
            break;
        case 4:
            System.out.println((boolean)(num1 >= num2));
            break;
    }
    break;
       case 3: System.out.println("*****EQUIDAD*****");
           System.out.println(""
                   + "!=\n"
                   + "==\n");
           opc2 = teclado.next().charAt(0);
           
           switch (opc2){
               case 1:
                   System.out.println((boolean) (num1 != num2));
                   break;
               case 2: 
                   System.out.println((boolean) (num1 == num2));
                   break;
           }
           break;
       case 4:
       case 5:
       
   }
}while(opc!=0);              
    }
    public static void main(String[] args) {
        Operadores2 op2 = new Operadores2();
        op2.ObtenerDatos();
        
    }    
}
