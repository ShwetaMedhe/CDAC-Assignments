using Inheritance.logic;

namespace Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Person person = new Person();
            person.first_name = "hello";
            person.last_name = "world";
            Console.WriteLine(person);
            Console.WriteLine("Name:{0} {1}",person.first_name,person.last_name);

            Employee employee = new Employee();
            employee.employee_id = 100;
            Console.WriteLine("Id:{2},Name={0} {1}",person.first_name,person.last_name, employee.employee_id);
        }
    }
}
