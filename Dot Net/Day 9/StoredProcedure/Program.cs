using Microsoft.Data.SqlClient;
namespace StoredProcedure
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string _conStr = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True";
            //InsertDepartment(_conStr, "Sales");
            //InsertEmployee(_conStr, "Ron", 3);
            GetEmployeeById(_conStr, 3);

            Console.WriteLine("Done");
        }
        public static void InsertDepartment(string conStr, string deptName)
        {
            using (SqlConnection con = new SqlConnection(conStr))
            {
                con.Open();
                using(SqlCommand cmd=new SqlCommand())
                {
                    cmd.CommandType=System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertDepartment";
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@DepartmentName", deptName);
                    cmd.ExecuteNonQuery();
                }
            }

        }
        public static void InsertEmployee(string conStr, string empName, int deptId)
        {
            using (SqlConnection con = new SqlConnection(conStr))
            {
                con.Open();
                using (SqlCommand cmd = new SqlCommand())
                {
                    cmd.CommandType = System.Data.CommandType.StoredProcedure;
                    cmd.CommandText = "InsertEmployee";
                    cmd.Connection = con;
                    cmd.Parameters.AddWithValue("@EmployeeName", empName);
                    cmd.Parameters.AddWithValue("@DepartmentId", deptId);
                    cmd.ExecuteNonQuery();

                }
            }
        }
        public static void GetEmployeeById(string constr,int id)
        {
            using(var Connection = new SqlConnection(constr))
            {
                Connection.Open();
                using(var command = new SqlCommand("GetEmployeeByDepartment",Connection))
                {
                    command.CommandType = System.Data.CommandType.StoredProcedure;
                    command.Parameters.AddWithValue("@DepartmentId", id);
                    using(var reader = command.ExecuteReader())
                    {
                        while (reader.Read())
                        {
                            Console.WriteLine($"Id: {reader["EmployeeID"]}, Name:{reader["EmployeeName"]}");
                        }
                    }
                }
            }
        }
    }
}
