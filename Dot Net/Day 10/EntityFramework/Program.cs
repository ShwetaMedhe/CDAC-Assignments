using EntityFramework.DAL;
using EntityFramework.Models;

namespace EntityFramework
{
    internal class Program
    {
        static void Main(string[] args)
        {
           IETDbContext _DbContext = new IETDbContext();
             while(true)
            {
                Console.WriteLine("Enter your Db Operation Choice:");
                Console.WriteLine("1. Select, 2. Insert, 3. Update, 4. Delete");
                int  opchoice = Convert.ToInt32(Console.ReadLine());
                switch(opchoice)
                {
                    case 1:
                        List<Emp> allEmps = _DbContext.emps.ToList();
                        foreach(var emp in allEmps)
                        {
                            Console.WriteLine($"Id: {emp.Id}, Name: {emp.Name}, Address: {emp.Address}");
                        }
                        break;

                    case 2:
                        Emp newEmp = new Emp();
                        Console.WriteLine("Enter Name: ");
                        newEmp.Name= Console.ReadLine();
                        Console.WriteLine("Enter Address: ");
                        newEmp.Address= Console.ReadLine();

                        _DbContext.emps.Add(newEmp);
                        _DbContext.SaveChanges();
                        break;

                    case 3:
                        Console.WriteLine("Enter Emp Id to be updated");
                        int idToBeUpdated = Convert.ToInt32(Console.ReadLine());

                        Emp empToBeUpdated = _DbContext.emps.Find(idToBeUpdated);

                        Console.WriteLine("Enter updated name: ");
                        empToBeUpdated.Name = Console.ReadLine();
                        Console.WriteLine("Enter updated Address");
                        empToBeUpdated.Address = Console.ReadLine();

                        _DbContext.SaveChanges(); 
                        break;

                    case 4:
                        Console.WriteLine("Enter Emp ID to be deleted: ");
                        int idToBeDeleted = Convert.ToInt32(Console.ReadLine());
                        Emp empToBeDeleted = _DbContext.emps.Find(idToBeDeleted);
                        _DbContext.emps.Remove(empToBeDeleted);
                        _DbContext.SaveChanges();
                       break;



                }
                 
            }

        }
    }
}
