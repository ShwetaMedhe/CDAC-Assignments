namespace Garbage_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyClass obj = new MyClass();
            //obj.SayHi();
            //obj.Dispose();

            using (MyClass obj2 = new MyClass())
            {
                obj2.SayHi();
            }
            GC.Collect();
            Console.WriteLine(GC.MaxGeneration);

            MyClass obj3 = new MyClass();
            Console.WriteLine(GC.GetGeneration(obj3));

            GC.WaitForPendingFinalizers();
        }
    }
    public class MyClass : IDisposable
    {
        public void Dispose()
        {
            Console.WriteLine("Dispose method is called...");
            GC.SuppressFinalize(this);
        }
        public void SayHi()
        {
            Console.WriteLine("Hi");
        }
    }
}
