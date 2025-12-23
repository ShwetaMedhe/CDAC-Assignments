using System.Security.AccessControl;
using System.Xml.Linq;

namespace Collection_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Display emp,book
            //Emp emp1 = new Emp();
            //emp1.EId = 101;
            //emp1.EName = "Alex Carey";
            //emp1.EAddress = "Australia";

            //Emp emp2 = new Emp();
            //emp2.EId = 102;
            //emp2.EName = "Tony Stark";
            //emp2.EAddress = "Shivaji Nagar";

            //Emp emp3 = new Emp();
            //emp3.EId = 103;
            //emp3.EName = "Tom Ellis";
            //emp3.EAddress = "L.A";

            //Emp[] emps = new Emp[3];
            //emps[0] = emp1;
            //emps[1] = emp2;
            //emps[2] = emp3;

            //for (int i = 0; i < emps.Length; i++)
            //{
            //    Console.WriteLine($"Id: {emps[i].EId}, Name: {emps[i].EName}, Address: {emps[i].EAddress}");
            //}

            //Book book = new Book();
            //book.BookName = "The Hobbit";
            //book.Author = "J.R.R. Tolkien";

            //Console.WriteLine($"Book: {book.BookName}, Author: {book.Author}"); 
            #endregion
        }

        #region Emp class
        //public class Emp
        //{
        //    private int _EId;
        //    private string _EName;
        //    private string _EAddress;

        //    public string EAddress
        //    {
        //        get { return _EAddress; }
        //        set { _EAddress = value; }
        //    }

        //    public string EName
        //    {
        //        get { return _EName; }
        //        set { _EName = value; }
        //    }
        //    public int EId
        //    {
        //        get { return _EId; }
        //        set { _EId = value; }
        //    }
        //} 
        #endregion

        #region Book
        //public class Book
        //{
        //    private string _Author;
        //    private string _BookName;

        //    public string BookName
        //    {
        //        get { return _BookName; }
        //        set { _BookName = value; }
        //    }
        //    public string Author
        //    {
        //        get { return _Author; }
        //        set { _Author = value; }
        //    }

        //} 
        #endregion

        #region Object [] 
        Object[] objs = new Object[5];
        objs[0] = 100; 
        objs[1] = "Something";
        objs[2] = emp1;
        objs[3] = book;
        objs[4] = 12.34; 

        for (int i = 0; i<objs.Length; i++)
        {
            object element = objs[i];
            if (element is int)
            { 
                int j = Convert.ToInt32(element);
                Console.WriteLine($"Value = {j}, Type ={element.GetType().ToString()}");
            }
            if (element is string)
            {
                string str = element.ToString();
            Console.WriteLine($"Value = {str}, Type ={element.GetType().ToString()}");
            }
        if (element is double)
        {
            double d = Convert.ToDouble(element);
            Console.WriteLine($"Value = {d}, Type ={element.GetType().ToString()}");
        }
        if (element is Emp)
        {
            Emp emp = element as Emp;
            Console.WriteLine($"Value = {emp.EId} {emp.EName} {emp.EAddress}, Type ={element.GetType().ToString()}");
        }
        if (element is Book)
        {
            Book book2 = element as Book;
            Console.WriteLine($"Value = {book2.BookName} {book2.Author}, Type ={element.GetType().ToString()}");
        }
        } 
        #endregion

        

    }
}
