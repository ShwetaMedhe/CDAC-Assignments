using Microsoft.Data.SqlClient;

namespace LoginApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter username");
            string username=Console.ReadLine();

            Console.WriteLine("Enter password");
            string password = Console.ReadLine();

            string constring = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";

            using (SqlConnection con = new SqlConnection(constring))
            {
                con.Open();
                string Query = "select password from users where username = @username";

                using (SqlCommand cmd = new SqlCommand(Query, con))
                {
                    cmd.Parameters.AddWithValue("@username", username);
                    object result = cmd.ExecuteScalar();

                    if (result != null)
                    {
                        string dbPass= result.ToString();

                        if(dbPass == password)
                        {
                            Console.WriteLine("welcome" + username + "!");
                        }
                        else
                        {
                            Console.WriteLine("Invalid User !!");
                        }
                        
                    }
                    else
                    {
                        Console.WriteLine("Invalid Credentials");
                    }
                }

            }
        }
    }
}
