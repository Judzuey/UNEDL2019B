/***
 *1.-Describa en sus propias palabras el concepto de colecciones (collections) y cuales tipos existen.
 *  R= Son clases para manejar varios objetos como list, stack y queue
 *2.Defina a que se refiere el concepto de código no seguro y que se necesita para implementarlo.
 *  R= Cualquier código que involucre el uso de apuntadores, utilizando modificadores unsafe o un constructor 
 *3.-Mencione al menos tres clases que se utilizan en l/O y proporcione brevemente la idea central de las mismas.
 *  R= FileStream: escribe y cierra archivos
 *    BufferedStream:  lee y escribe bytes desde otros Streams para mejorar el rendimiento de las operaciones de entrada y salida
 *    MemoryStream: lee y escribe bytes desde y hacia memoria.
 *4.- Explique la diferencia entre los siguientes códigos en csharp
a. Console. Writeline ("resultado: (*ptr) ").
b. Console.WriteLine("resultado: ((int)ptr)")
* 
* 5.- Mencione al menos tres caracteristicas de las excepciones (Exceptions).
*   R= El try y el catch se utiliza para atrapar las excepciones que se generen en el try y el throw lanza las excepciones
* 6.- En Java, mencione y describa los tres tipos de excepciones.
*   R= pueden ser las mismas, try, catch y throw
*7.- Explique brevemente a que se refiere con directivas para preprocesador y que se necesita para usarlas.
*   R= le dan instrucciones al compilador para que procese la información antes de iniciar con la compilacion y se inicial con # y no termina con ;
*8.-Explique las diferencias entre ArrayList, Sorted List Hash Table.
*   R= El array list almacena objetos de cualquier tipo como un arreglo, no especifica el tamaño
*   El SortedList acomoda los elementos
*   El HashTable recupera los valores
*9.-Describa las para que sirven StreamReader y StreamWriter
*   R=  son clases de apoyo que permiten la lectura y escritura en caracteres y viceversa. 
*10.- Explique el funcionamiento del algoritmo Quicksort
*   R= inicia partiendo de un pivote particionando la lista de elementos en dos, los mayores a la derecha y los menores a la izquierdq
*11.- En Java, explique cuál es la diferencia entre System.out, System.in y System.err
*   R=System.out: salida estandar
*     System.in: entrada estandar
*     System.err: error estandar
*12.- Explique cuáles son las ventajas de utilizar "generic collections"
*   R= almacenan cualquier tipo de elemento
*13.- Desarrolle en C#, un programa en Windows Forms llamado TPV2doParcial que permita crear un
archivo, lo lea y permita escribir en el. El programa debe permitir la captura de una lista de palabras
y al finalizar la captura, debe reportar la cantidad total de palabras, las palabras repetidas y la
cantidad de ocurrencias. Capture las excepciones necesarias. Al terminar, suba su codigo a su
repositorio y escriba el SHA correspondiente en el examen
*/
using System;
using System.Collections.Generic;

namespace ExamenTPV3
{
    class MainClass
    {

        public static void Main(string[] args)

        {

            List<string> palabras = new List<string>();

            string p;

            for (int x = 0; x < 5; x++)

            {

                p = Console.ReadLine().ToString();

                palabras.Add(p);
            } 
            var contador = new List<Tuple<string, int>>();

            bool encontro;

            foreach (string con in palabras)
            {

                encontro = false;

                for (int i = 0; i < contador.Count; i++)

                    if (contador[i].Item1 == con)

                    {

                        encontro = true;

                        contador[i] = new Tuple<string, int>(contador[i].Item1, contador[i].Item2 + 1);

                    }



                if (!encontro)

                {

                    contador.Add(new Tuple<string, int>(con, 1));

                }
            }

            for (int i = 0; i < contador.Count; i++)

                Console.WriteLine(contador[i].Item1 + " = " + contador[i].Item2);

            Console.ReadKey();

        }

    }

}