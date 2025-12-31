using System.Reflection;
using System.Runtime.Serialization;

namespace MyApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string asmPath = @"C:\Users\IET\Desktop\Dot Net\CSharpDemos\Demo_Emp_Lib\bin\Debug\net8.0\Demo_Emp_Lib.dll";

            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();

            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i];
                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();
                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if (attr is Employee_Attribute)
                    {
                        Employee_Attribute empAttr = attr as Employee_Attribute;
                        Console.WriteLine($"Class {type.Name} is developed by {empAttr.EmployeeName}of (c) {empAttr.EmployeeDept}");

                    }

                    if(attr is SerializableAttribute)
                    {
                        Console.WriteLine($"Class {type.Name} is marked as serializable");
                    }
                }

            }
        }
    }
}
