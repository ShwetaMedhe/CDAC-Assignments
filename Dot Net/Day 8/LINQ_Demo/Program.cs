namespace LINQ_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Predicate Delegate
            //Predicate<int> _Even = x => x % 2==0;
            //Predicate<int> _Odd= x => x % 2!= 0;

            //Console.WriteLine("Enter a number");
            //int no = Convert.ToInt32(Console.ReadLine());

            //var evenResult = _Even(no);
            //var oddResult = _Odd(no);
            //Console.WriteLine($"For Number={no}--> Even:{evenResult},Odd:{oddResult}"); 
            #endregion

            #region Action Delegate
            //Action actionDel = new Action(delegate ()
            //{
            //    Console.WriteLine("Hello Tom Holland");
            //}
            //);
            //actionDel(); 

            //Action del2 = delegate ()
            //{
            //    Console.WriteLine("Hello");
            //};
            //del2();

            //Action del4 = () =>
            //{
            //    Console.WriteLine("Hello Emma Watson");
            //};
            //del4();

            //Action del3 = () => Console.WriteLine("Hello");
            //del3();
            #endregion

            #region Func<out Result>
            //Func<int> func1 = delegate ()
            //{
            //    return 1; 
            //};
            //var result= func1();
            //Console.WriteLine(result);

            //Func<double> func3 = () =>
            //{
            //    return 23.33;
            //};
            //var result2=func3();
            //Console.WriteLine(result2);

            //Func<string> func4 = delegate ()
            //{
            //    return "Harry";
            //};
            //var result4=func4();
            //Console.WriteLine(result4); 
            #endregion

            #region  TResult Func<in T, out TResult>(T arg)
            //Func<int, bool> del = new Func<int, bool>(
            //    delegate (int x)
            //    {
            //        return x % 2 == 0;
            //    });
            //bool result = del(12);
            //Console.WriteLine(result);

            //Func<int,bool> del=new Func<int,bool>(x=>x%2==0);
            //bool result = del(11);
            //Console.WriteLine(result);

            //Predicate<int> _predicate1 = x => x % 2 == 0;
            //Predicate<int> _predicate2 = x => x % 2 != 0;
            //Predicate<int> _predicate3 = x => x == 12;
            //bool output = _predicate1(11);
            //Console.WriteLine(output);

            //Func<int, bool> del = new Func<int, bool>(_predicate2);
            //bool result=del(11);
            //Console.WriteLine(result);
            #endregion

            #region In-built() Extension method
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            //Console.WriteLine($"Sum: {arr.Sum()}");
            //Console.WriteLine($"Max: {arr.Max()}");

            //Predicate<int> _predicate1 = x => x == 5;
            //Func<int, bool> func1 = new Func<int, bool>(_predicate1);
            //var result1 = arr.Where(func1);
            //foreach (var no in result1)
            //{
            //    Console.WriteLine(no);
            //} 
            #endregion

            Func<int,int> func3=new Func<int,int>(no=>no*2);
            var doubleArr =arr.Select (no => no * 2);

            foreach(int ele in arr)
            {
                Console.WriteLine (ele);

            }
            //List<int> lstArr = arr.MySelect();

            ////Func<int, bool> predicate = x => x % 2 == 0;
            ////lstArr.MyWhere<int>(predicate);
            //var evenNumbers =lstArr.MyWhere<int>(x => x % 2 == 0);
            //foreach (var no in evenNumbers)
            //{
            //    Console.WriteLine(no);
            //}
            //-------------------
            //var result = arr.MySelect().MyWhere<int>(x => x % 2 == 0);
            //foreach (var item in result)
            //{
            //    Console.WriteLine(item);
            //}
        }

        //public static bool Check (int x)
        //{
        //    return x % 2 == 0;
        //}
    }
    public static class MyClass
    {
        public static List<T> MySelect<T>(this IEnumerable<T> source)
        {
            var list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            return list;
        }

        public static IEnumerable<int> MyWhere<T>(this IEnumerable<int> source, Func<int, bool> predicate)
        {
            List<int> result = new List<int>();
            foreach (int no in source)
            {
                //if (no % 2 == 0)
                if (predicate(no))
                {
                    result.Add(no);
                }
            }
            return result;
        }
    }
}


