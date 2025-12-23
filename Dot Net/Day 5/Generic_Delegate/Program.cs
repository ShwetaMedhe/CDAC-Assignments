namespace Generic_Delegate
{
    public delegate void MyDelegate();
    public delegate void MyDelegate2<T>(T para);
    public delegate void MyDelegate3<T1, T2>(T1 para, T2 para2);
    public delegate bool PredicateDelegate<T>(T para);
    public delegate Random FuncDelegate<T, R>(T para);

    internal class Program
    {
        static void Main(string[] args)
        {
            Demo demo = new Demo();
            MyMath math = new MyMath();

            MyDelegate3<string, string> delGreet = demo.Greet;

            math.Test<string, string, string, string>(delGreet, "Tom Ellis", "Good Morning!");

        }

        public class Demo
        {
            public void SayHi()
            {
                Console.WriteLine("Hi there");
            }

            public void sayHello(string name)
            {
                Console.WriteLine($"Hello, {name}");
            }
            public void Greet(string name,string msg)
            {
                Console.WriteLine($"Hi!{name},{msg}"); ;
            }
            public void Display(int number)
            {
                Console.WriteLine($"Number is: {number}");
            }
            public bool CheckEven(int number)
            {
                return number % 2 == 0;
            }
            public bool CheckOdd(int number)
            {
                return number % 2 != 0;
            }

            public int Add(int[] numbers)
            {
                int sum = 0;
                foreach (var num in numbers)
                {
                    sum += num;
                }
                return sum;
            }
            public void Add(int n1, int n2, int n3, out int sum)
            {
                sum = n1 + n2 + n3;
            }
        }
        public class MyMath
        {
            public void Test<T1, T2, T3, T4>(MyDelegate3<T1, T2> del, T3 para1, T4 para2)
            {
                dynamic p1 = para1;
                dynamic p2 = para2;
                del.Invoke(p1, p2);
            }
        }
    }
}