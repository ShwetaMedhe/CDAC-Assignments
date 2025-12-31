using Microsoft.VisualBasic;
using System.Collections;
using System.ComponentModel.DataAnnotations;

namespace CSharpFeatures1
{
    public delegate bool MyDelegate(int num);
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a number");
            int no = Convert.ToInt32(Console.ReadLine());

            #region MyDelegate
            //MyDelegate del = new MyDelegate(Check);
            //var result = del(no);
            //if (result)
            //{
            //    Console.WriteLine($"No.{no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No.{no} is not greater than 10");
            //} 
            #endregion

            #region Anonymous methods with MyDelegate and delegate keyword

            //MyDelegate del = new MyDelegate(delegate (int num)
            //{
            //    return num > 10;
            //}
            //);

            //MyDelegate del = delegate (int num)
            //{
            //    return num > 10;
            //};


            //if (del(no))
            //{
            //    Console.WriteLine($"No: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No: {no} is not greater than 10");
            //} 
            #endregion

            #region Lambda Expression : => goes to operator
            //MyDelegate del = num => num > 10;
            //if (del(no))
            //{
            //    Console.WriteLine($"No: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"No: {no} is not greater than 10");
            //} 
            #endregion

            #region predicate in-built delegate
            //Predicate<int> del = num => num > 10;
            //if (del(no))
            //{
            //    Console.WriteLine($"num: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"num: {no} is not greater than 10");
            //}

            #endregion
            #region In-built Sum Extension Method and normal MySum Method

            //int[] arr = new int [] {1,2,3,4};
            //var result = arr.Sum();
            //Console.WriteLine(result);

            //var result1 = mysum(arr);
            //Console.WriteLine($"sum2 ={result1}");

            //string[] names = new string[] { "Hugh", "John", "Tom" };
            //var result2 = mysum(names);
            //Console.WriteLine($"Sum3 = {result2}"); 
            #endregion

            #region Extension methods
            //Console.WriteLine("Enter your email id");
            //string? email=Console.ReadLine();
            //if (email != null)
            //{
            //    if (email.checkForValidEmailId())
            //    {
            //        Console.WriteLine("Valid email id");
            //    }
            //    else
            //    {
            //        Console.WriteLine("invalid email id");
            //    }
            //} 
            #endregion

            #region Extention Methods Demo2
            //int[] numbers = { 101, 102, 103, 104 };
            //string[] days = { "Mon", "Tue", "Wed", "Sun" };
            //List<int> output1 = numbers.ConvertToList(1111);
            //foreach(var item in output1)
            //{
            //    Console.WriteLine($"{item}");
            //}
            //List<string> output2 = days.ConvertToList(234);
            //foreach (var item in output1)
            //{
            //    Console.WriteLine($"{item}");
            //}

            #endregion

            MyCustomCollection customCollection=new MyCustomCollection();
            customCollection.AddElement(10);
            customCollection.AddElement(20);
            customCollection.AddElement(30);

            //var result = customCollectionObject.GetElements;
            //for(int i = 0; i < result.Count; i++)
            //{
            //    Console.WriteLine(result[i]);
            //}
            //foreach(var item in result)
            //{
            //    Console.WriteLine(item);
            //}

            //foreach(var item in customCollection)
            //{
            //    Console.WriteLine($"--{item}");
            //}

            //MyCollection collection = new MyCollection();
            //foreach(string day in collection)
            //{
            //    Console.WriteLine(day);
            //}
        }

       

        public static bool Check(int num)
        {
            return num > 10;
        }

        public static T mysum<T>(IEnumerable<T> arr)
        {
            dynamic sum = 0;
            foreach(var ele in arr)
            {
                sum += ele;
            }
            return sum;
        }

       
    }
    public class MyCustomCollection : IEnumerable
    {
        private ArrayList arr = new ArrayList();
        public ArrayList GetElements
        {
            set
            {
                arr.Add(value);
            }
            get
            {
                return arr;
            }
        }
        public void AddElement(int element)
        {
            arr.Add(element);
        }
        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
                // yield keyword forces CLR to remeber last element index, which we have returned from this for loop and next time returns next element by increasing index as per the for loop syntax condition.
            }
        }
    }
    public class MyCollection : IEnumerable
    {
        private string[] days = new string[] { "Monday", "Tuesday", "Wedensday", "Thrusday", "Firday", "Saturday", "Sunday" };

        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < days.Length; i++)
            {
                string day = days[i];
                yield return day; // yield keyword is used to return the value from the iterator method. And it maintains last index value.
            }
        }

        //public string[] Days
        //{
        //    get { return days; }
        //}
    }
    public static class MyClass
    {
        public static bool checkForValidEmailId(this string email)
        {
            return email.Contains("@b.com");
        }

        public static List<T> ConvertToList<T>(this IEnumerable<T> source,int nonsenseParameter)
        {
            List<T> list= new List<T>();
            foreach(var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense parameter value={nonsenseParameter}");
            return list;
        }

    }
}
