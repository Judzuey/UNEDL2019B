package P1;
import java.util.*;

public class Operadores {
    Scanner teclado;

    int opc;
    char opc2;
    float num1, num2;

    public void ObtenerDatos() {
        teclado = new Scanner(System.in);

        do {
            System.out.println("\n***MENU INICIAL***");
            System.out.println(""
                    + "1.-Aritmetico\n"
                    + "2.-Relacional\n"
                    + "3.-Equidad\n"
                    + "4.-Logicos\n"
                    + "0.- SALIR");
            opc = teclado.nextInt();
            if (opc == 0) {
                break;
            } else {
                System.out.println("Digite un numero: ");
                num1 = teclado.nextInt();
                System.out.println("Digte otro numero: ");
                num2 = teclado.nextInt();
            }
            switch (opc) {
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
                    System.exit(0);
                   if(opc2 == '+'){
                       System.out.println("Suma: " + (int) (num1+num2));
                            }
                   else if(opc2 == '-') {
                       System.out.println("Resta: " + (int) (num1-num2));
                            }
                   else if(opc2 =='*'){
                       System.out.println("Multiplicacion: " + (int) (num1*num2));
                   }
                   else if(opc2 == '/'){
                       System.out.println("Division: " + (num1 / num2));
                   }
                   
                   else if(opc2 == '%'){
                       System.out.println("Residuo: " + (num1 % num2));
                   }
                   else if (opc2 == 0){
                       break;
                   }else if(opc2 != '+' || opc2 != '-' || opc2 != '*' || opc2 != '/' || opc2 != '%'){
                       
                       System.out.println("*****CARACTER INVALIDO*****");
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
                    if(opc2 == '<'){
                        System.out.println((boolean) (num1 < num2));
                    }
                    else if(opc2 == '>'){
                        System.out.println((boolean) (num1 > num2));
                    }
                    else if(opc2 == '<'){ 
                        System.out.println((boolean) (num1 <= num2));
                    }
                    else if(opc2 == '>'){
                        System.out.println((boolean) (num1 >= num2));
                    }
                    else if(opc2 == 0){
                        break;
                    }
                    else if(opc2 != '<' || opc2 != '>'){
                        break;
                    }
                    break;
                case 3:
                    System.out.println("*****EQUIDAD*****");
                    System.out.println(""
                            + "!=\n"
                            + "==\n"
                            + "0.- SALIR");
                    opc2 = (char)teclado.nextInt();
                    if(opc2 == '!'){
                    System.out.println((boolean) (num1 != num2));
                }else if (opc2 == '='){
                        System.out.println((boolean) (num1 == num2));
                }else if(opc2 != '!' || opc2 != '='){
                    break;
                }else if (opc2 ==0){
                    break;
                }
                    break;

                case 4:
                    System.out.println("*****LOGICOS*****");
                    System.out.println(""
                            + "&&\n"
                            + "||\n"
                            + "0.- SALIR");
                    opc2 = (char)teclado.nextInt();
                    boolean x = true;
                    boolean y = false;
                    boolean num1 = x && y;
                    boolean num2 = x && y;
                    
                    if(opc2 == '&'){
                        System.out.println((boolean) num1 && num2);
                    }
                    else if(opc2 == '|'){
                        System.out.println((boolean) num1 || num2);
                    }
                    else if(opc2 != '&' || opc2 != '|'){
                        break;
                    }
                    else if(opc2 == 0){
                        break;
                    }
                    break;
               default:
                break; 
            }
        } while (opc != 0);
    }

    public static void main(String[] args) {
        Operadores op = new Operadores();
        op.ObtenerDatos();

    }
}
