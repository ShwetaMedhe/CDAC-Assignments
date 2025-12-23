using System.Net;

namespace Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee emp = new Employee();
            emp.EId = 10;
            int id = emp.EId;
            Console.WriteLine($"ID = {id} ");
            emp.EName = "Alex Carey";
            Console.WriteLine($"Output : {emp.EName}");
            emp.EAddress = "New York";
        }

        public class Employee
        {
            private int _Eid;
            private string _EName;
            private string _EAddress;

            public int EId
            {
                set
                {
                    _Eid = value;
                }
                get
                {
                    return _Eid;
                }

            }

            public string EName
            {
                set
                {
                    _EName = value;
                }
                get
                {
                    return _EName;
                }
            }


            public string EAddress
            {
                set
                {
                    _EAddress = value;
                    Console.WriteLine($"Address : {_EAddress}");
                }
            }
        }
    }
}
