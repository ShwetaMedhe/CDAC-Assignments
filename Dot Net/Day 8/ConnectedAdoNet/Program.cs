using Microsoft.Data.SqlClient;

namespace ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionString = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";
            #region SELECT Query
            //    SqlConnection con = new SqlConnection(connectionString);

            //    string selectQuery = "select * from Emp";

            //    SqlCommand cmd = new SqlCommand();
            //    cmd.CommandType = System.Data.CommandType.Text; 
            //    cmd.CommandText = selectQuery;
            //    cmd.Connection = con;
            //    con.Open();

            //    SqlDataReader reader = cmd.ExecuteReader();
            //    while (reader.Read())
            //    {
            //        int id = Convert.ToInt32(reader["ID"]);
            //        string? nm = reader["Name"].ToString();
            //        string? address = reader["Address"].ToString();
            //        Console.WriteLine($"Id: {id}, Name: {nm}, Address: {address}");
            //    }

            //    con.Close();
            //} 
            #endregion
             
            SqlConnection con = new SqlConnection(connectionString);
            Console.WriteLine("Enter Name: ");
            string nm = Console.ReadLine();
            Console.WriteLine("Enter Address: ");
            string add = Console.ReadLine();

            string insertQuery = $"insert into Emp(name,address)values('{nm}','{add}')";

            SqlCommand cmd = new SqlCommand(insertQuery, con);
            cmd.CommandType = System.Data.CommandType.Text;
            cmd.CommandText = insertQuery;
            cmd.Connection = con;

            con.Open();

            int noOfRowsAffected = cmd.ExecuteNonQuery();
            if(noOfRowsAffected > 0 )
            {
                Console.WriteLine("Record inserted sucessfully!!"); 

            }
            else
            {
                Console.WriteLine("error");
            }
            con.Close();
        }
    }
}