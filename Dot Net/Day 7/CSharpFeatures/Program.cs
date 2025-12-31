using CSharpFeatures;

namespace CSharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial class
            //CMath cmath = new CMath();
            //Console.WriteLine($"Add result = {cmath.Add(15, 5)}"); 
            //Console.WriteLine($"Mult result = {cmath.Multiply(5, 10)}"); 
            #endregion

            #region nullable types
            // string name = null;
            // //int deptID = null;
            //// int? deptID = null;
            // int? deptID = 123;
            // if (deptID.HasValue)
            // {
            //     Console.WriteLine(deptID.Value);
            // }
            // else
            // {
            //     Console.WriteLine("deptID=null");
            // }

            // Nullable<int> dept = null;
            // //Nullable<int> dept = 10; 
            // if(deptID.HasValue)
            // {
            //     Console.WriteLine($"dept is not null and is = {dept.Value}");

            // }
            // else
            // {
            //     Console.WriteLine("Dept = null");
            // } 
            #endregion

            #region Object Initializer
            //Demo demo = new Demo() {_id=101};
            //Console.WriteLine(demo._id);

            //Demo demo1 = new Demo() { _name = "Hugh Jackman", _id = 102 };
            //Console.WriteLine(demo1._name + " "+ demo1._id);

            //Console.WriteLine("Enter the Name: ");
            //string nm = Console.ReadLine();
            //Console.WriteLine("Enter the Description: ");
            //string des = Console.ReadLine();

            //Demo demo2 = new Demo() { _name = nm, _description=des};
            //Console.WriteLine($"Name= {demo2._name}, Description={demo2._description}"); 
            #endregion

            //int[] arr = new int[3];
            //arr[0] = 1;
            //arr[1] = 2;
            //arr[2] = 3;

            #region Colletion Intilizer
            //int[] arr = new int[] { 1, 2, 3 };
            //foreach(int ele in arr)
            //{
            //    Console.WriteLine(ele);
            //}
            //string[] names = new string[] { "Jack", "John", "Jill", "Peter" };
            //foreach(string ele in names)
            //{
            //    Console.WriteLine(ele);
            //}

            //List<Demo> listDemoObjects = new List<Demo>()
            //{
            //    new Demo(){_id=1,_name="Hugh Jackman",_description="Australian Actor" },
            //    new Demo(){ _id = 2, _name= "Tom Ellis", _description="Wellish Actor"},
            //};

            //foreach(Demo dm in listDemoObjects)
            //{
            //    Console.WriteLine($"Id= {dm._id}, Name = {dm._name}, Description = {dm._description}");
            //} 
            #endregion

            #region Auto-Properties
            //Emp emp = new Emp()
            //{
            //    EId = 101,
            //    EName = "Hugh Jackman",
            //    isActive = true,
            //    Salary = 50000,
            //    DOJ = DateTime.Now,
            //    Projects = new List<string>() { "ORM", "Database Integration APIs", "Asp.Net MVC Core based application" }
            //};
            //Console.WriteLine($"DOJ = {emp.DOJ.ToString()}");
            //foreach (string str in emp.Projects)
            //{
            //    Console.WriteLine(str);
            //} 
            #endregion

            #region Implicit Type
            //Test obj = new Test();
            //Emp emp = obj.GetSomthing(2) as Emp;
            //int value = Convert.ToInt32(obj.GetSomthing(1));
            //object num = obj.GetSomthing(null);
            //if (num != null)
            //{

            //}

            //var i = 100;
            //var str = "Hello";

            ////var emp = new Emp();
            ////object obj;
            ////int j;

            //Test obj1 = new Test();
            //Console.WriteLine("Enter choice");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //var result = obj1.GetSomthing(ch);

            //Console.WriteLine(result);
            #endregion

            #region Anonymous Types
            //List<Holder> dbRecordsHolder = new List<Holder>()
            //{
            //    new Holder(){Id=1, Name="Test", Address="Pune"}
            //};

            //Emp emp = new Emp() { EId = 1, EName = "Hugh Jackman" };
            //var emp2 = new Emp() { EId = 2, EName = "Tom Ellis" };
            //Console.WriteLine(emp2.GetType().ToString());
            //var emp3 = new Holder() { Id = 101, Name = "Timothy", Address = "LA" };
            //Console.WriteLine(emp3.GetType().ToString());

            //var emp4 = new Holder() { Id = 101, Address = "LA", Name = "Timothy" };
            //Console.WriteLine(emp4.GetType().ToString());

            //emp4.Address = "Pune";
            //Console.WriteLine(emp4.Address);

            //Console.WriteLine("Enter value for Id");
            //int id = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter value for name");
            //string nm = Console.ReadLine();

            //var v5 = new { CId = id, CName = nm };
            //Console.WriteLine($"You Entered : CId= {v5.CId}, Name= {v5.CName}");
            #endregion


        }
        public class Demo
        {
            public int _id;
            public string _name;
            public string _description;
        }

        public class Emp
        {
            public int EId { get; set; }
            public string EName { get; set; }
            public bool isActive { get; set; }
            public double Salary { get; set; }
            public DateTime DOJ { get; set; }
            public List<string> Projects { get; set; }
            public Demo demo { get; set; }
        }

        public class Test
        {
            public object GetSomthing(Nullable<int> choice)
            {
                if (choice == 1)
                {
                    return 100;
                }
                else if (choice == 2)
                {
                    return new Emp() { EId = 1, EName = "Timothy", isActive = false };
                }
                else
                {
                    return null;
                }
            }
        }

        public class Holder
        {
            public int? Id { get; set; }
            public string? Name { get; set; }
            public string? Address { get; set; }
        }
    }
}
