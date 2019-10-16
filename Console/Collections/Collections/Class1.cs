using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Collections
{
    class Class1
    {

        public void Arreglo1()
        {
            ArrayList al = new ArrayList();
            al.Add(null);
            al.Add("string");
            al.Add(1);
            foreach (var i in al)
            {
                Console.WriteLine(i);
            }
        }
    }
}
