using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Collections
{
    class Class2
    {
        
        public void Sorted()
        {
            SortedList sl = new SortedList();
            sl.Add(1, "Valor 1");
            sl.Add(5, "Valor 5");
            sl.Add(3, "Valor 3");
            ICollection llaves = sl.Keys;
            foreach (var k in llaves)
            {
                Console.WriteLine("llave: " + k + "valor: " + sl[k]);
            }
        }
    }
}
