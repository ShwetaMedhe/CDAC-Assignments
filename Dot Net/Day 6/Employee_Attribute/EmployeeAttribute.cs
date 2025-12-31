namespace Employee_Attribute
{
    [AttributeUsage(AttributeTargets.Class)]
    public class EmployeeAttribute : Attribute
    {
        private string _EmployeeName;
        private string _EmployeeDept;

        public string EmployeeName
        {
            get { return _EmployeeName; }
            set { _EmployeeName = value; }
        }


        public string EmployeeDept
        {
            get { return _EmployeeDept; }
            set { _EmployeeDept = value; }
        }


    }
}
