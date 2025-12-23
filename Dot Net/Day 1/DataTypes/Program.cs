namespace DataTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region DataTypes:
            //int x = 10;
            //int y = 20;
            //double d = 31.1;
            //Console.WriteLine("X={0} ,Y={1}, D={2}", x, y, d); 
            #endregion

            #region TypeCasting:
            //double d = 9.18;
            //int num1 = Convert.ToInt32(d);
            //double d2 = num1;
            //Console.WriteLine("d={0}, num1={1},d2={2}",d,num1,d2);

            //object obj2=new object();
            //string str4 = "Programming";
            //obj2 = str4;
            //string str=obj2.ToString();
            //Console.WriteLine("obj2={0}, str4={1}",obj2, str4); 
            #endregion

            int x = 100;     //value type
            string str = "Hello World";   //reference type
            Object obj1 = new object();

            //boxing
            obj1 = x;
            Console.WriteLine(obj1);
            str = Convert.ToString(x);    //boxing
            Console.WriteLine(str);
            string str2 = x.ToString();   //boxing
            Console.WriteLine(str2);

            //unboxing
            int y = Convert.ToInt32(obj1);     
            int p = Convert.ToInt32(str);
            Console.WriteLine("Y={0},P={1}", y, p);
       
        }
    }
}
