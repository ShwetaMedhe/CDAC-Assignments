namespace InheritanceDemo2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            AdvancedMath advmath = new AdvancedMath();
            Console.WriteLine(advmath.add(2, 3, 4, 5));
            advmath.Mult(3, 4);
            advmath.sub(5, 4);

            CMath cm = new CMath();
            cm.Mult(1,2);
        }
    }
}
