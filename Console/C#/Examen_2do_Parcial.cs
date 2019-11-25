using System;
using System.Collections;

namespace PV2doParcial
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("ingresa la ecuacion ");//pide ingresa de datos 
            String s = Console.ReadLine();//pedimos ingresardatos
            Stack paretnesis = new Stack();//arraylist que comparara
            for (int i = 0; i < s.Length; ++i)
            {//lee el arreglos
                if ((s[i] == '(') || (s[i] == '{') || (s[i] == '['))
                {//comparamos las llaves
                    paretnesis.Push(s[i]);//coloca el iterador al final de la pila
                }
                else if (paretnesis.Count > 0)
                {//entonces si el parentesis esta vacio es falso
                    switch (s[i])
                    {//switch case con el iterador del array
                        case ']'://caso ]

                            paretnesis.Pop();
                            break;
                        case '}'://caso}

                            paretnesis.Pop();
                            break;
                        case ')'://caso )
                            paretnesis.Pop();
                            break;
                    }//cierra switch case
                }//cierra if else
            }//cierra for
            if (paretnesis.Count == 0)
            {//si esta vacio entonces
                Console.WriteLine("ecuacion correcta");//imprime es correcta
            }
            else
            {//si no
                Console.WriteLine("no esta equilibrada");//imprime no esta equilibrada
            }//cierra else
        }
    }
}