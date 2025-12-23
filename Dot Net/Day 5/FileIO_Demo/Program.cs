namespace FileIO_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string filePath = @"C:\Users\IET\Desktop\Dot Net\CSharpDemos\FileIO_Demo\Files\demo1.txt";

            //FileStream fs = null;
            //if(File.Exists(filePath))
            //{
            //    fs=new FileStream(filePath,FileMode.Append,FileAccess.Write);
            //}
            //else
            //{
            //    fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            //}

            //StreamWriter writer = new StreamWriter(fs);
            //writer.WriteLine("Hello World");
            //writer.Flush();
            //writer.Close();
            //fs.Close();
            //Console.WriteLine("Done");

            //FileStream fs = null;
            //if (File.Exists(filePath))
            //{
            //    fs = new FileStream(filePath, FileMode.Open,FileAccess.Read);

            //}
            //else
            //{
            //    Console.WriteLine("File does not exist!");
            //}

            //StreamReader reader = new StreamReader(fs);
            //string content = reader.ReadToEnd();
            //reader.Close();
            //Console.WriteLine(content);
            Emp emp = new Emp();
            emp.Id = 101;
            emp.Name = "Shruti";
            emp.Address = "Pune";

            FileStream fs = null;

            if (File.Exists(filePath))
            {
                fs = new FileStream(filePath, FileMode.Append, FileAccess.Write);
            }
            else
            {
                fs = new FileStream(filePath, FileMode.OpenOrCreate, FileAccess.Write);
            }

            StreamWriter writter = new StreamWriter(fs);
            writter.Write(emp);
            writter.Flush();
            writter.Close();
            fs.Close();

            Console.WriteLine("Done.");

           

        }
    }
        public class Emp
        {
            private int _Id;
            private string _Name;
            private string _Address;

            public string Address
            {
                get { return _Address; }
                set { _Address = value; }
            }


            public string Name
            {
                get { return _Name; }
                set { _Name = value; }
            }


            public int Id
            {
                get { return _Id; }
                set { _Id = value; }
            }

        }
    }

