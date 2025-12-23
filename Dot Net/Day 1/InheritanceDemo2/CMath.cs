using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InheritanceDemo2
{
    public class CMath
    {
        public int add(int a, int b)
        {
            return a + b;
        }

        public void add(int a, int b, int c)
        {
            Console.WriteLine(a + b + c);
        }

        public void sub(int a, int b)
        {
            Console.WriteLine("CMath sub: {0}", (a - b));
        }

        public virtual void Mult(int a, int b)
        {
            Console.WriteLine("CMath Mult: {0}", (a * b));
        }
    }

    public class AdvancedMath : CMath
    {
        public override void Mult(int a, int b)
        {
            Console.WriteLine("Adv Math Mult: {0}", (a * b) * 100);
        }
    
     public new void sub(int a, int b)
        {
            Console.WriteLine("Adv Math Sub: {0}", (a - b) * 2);
        }

        public void add(int a, int b)
        {
            Console.WriteLine("Adv Math Add: {0}", (a + b) * 100);
        }
        public int add(int a, int b, int p, int q)
        {
            return a + b + p + q;
        }


    }

}
