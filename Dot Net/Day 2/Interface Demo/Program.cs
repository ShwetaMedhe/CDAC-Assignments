using System.Security.Cryptography.X509Certificates;

namespace Interface_Demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region implicit implementation
            //Drink drink = new Drink();
            //drink.getDrink();

            //Console.WriteLine("enter your choice: ");
            //int ch = Convert.ToInt32(Console.ReadLine());
            //switch (ch)
            //{
            //    case 1:
            //        IDrink ColdDrink=new ColdDrink();
            //        ColdDrink.getDrink();
            //        break;

            //        case 2:
            //        IDrink hotDrink=new HotDrink();
            //        hotDrink.getDrink();
            //        break;

            //    default:
            //        Console.WriteLine("invalid choice");
            //        break;
            //} 
            #endregion

            Console.WriteLine("Enter your choice: 1.IX , 2.IY");
            int ch=Convert.ToInt32(Console.ReadLine());
            switch (ch)
            {
                case 1:
                    IX xObj = new CMath();
                    Console.WriteLine(xObj.Add(10, 20));
                    Console.WriteLine(xObj.Sub(20, 10));
                    break;
                case 2:
                    IY yObj = new CMath();
                    Console.WriteLine(yObj.Add(10, 20));
                    Console.WriteLine(yObj.Mult(10, 20));
                    break;
                case 3:
                    CMath cObj=new CMath();
                    cObj.Add(10, 20);
                    break;
                default:
                    Console.WriteLine("Invalid choice");
                    break;
            }
        }

        #region implicit implementation
        //public interface IDrink
        //{
        //    void getDrink();
        //}

        //public class ColdDrink : IDrink
        //{
        //    public void getDrink()
        //    {
        //        Console.WriteLine("enjoy your cold drink");

        //    }
        //}

        //public class HotDrink : IDrink
        //{
        //    public void getDrink()
        //    {
        //        Console.WriteLine("enjoy your hot drink");
        //    }
        //}

        #endregion

        public interface IX
        {
            int Add(int x, int y);
            int Sub(int x, int y);

        }
        public interface IY
        {
            int Add(int x, int y);
            int Mult(int x, int y);
        }
        public interface IDemo
        {
            int Div(int x, int y);
            void Log(string  message);
        }
        public class MyMath: IY, IDemo
        {
            public int Add(int x,int y)
            {
                return x + y;
            }
            public int Div(int x,int y)
            {
                return x / y;
            }
            void IDemo.Log(string message)
            {
                Console.WriteLine("Log msg:{0}", message);
            }
            public int Mult(int x,int y)
            {
                return x* y;
            }
        }

        public class CMath : IX, IY
        {
            #region Implicit way
            public int Add(int x, int y)
            {
                return x + y;
            }

            public int Sub(int x, int y)
            {
                return x - y;
            }

            public int Mult(int x, int y)
            {
                return x * y;
            }
            #endregion

            #region Explicit way of implementation
            int IX.Add(int x, int y)
            {
                return x + y;
            }

            int IY.Add(int x, int y)
            {
                return x + y + 1000;
            }

            int IY.Mult(int x, int y)
            {
                return x * y;
            }

            int IX.Sub(int x, int y)
            {
                return x - y;
            }
            #endregion
        }

    }
}


