using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Net;

namespace Demo_Emp_Lib
{
    [Table("Employee")]
    public class Emp
    {
        private int _id;
        private string _name;
        private string _address;

        [Column("Eid", TypeName = "int")]
        public int id
        {
            get { return _id; }
            set { _id = value; }
        }

        [Column("Ename", TypeName = "varchar(20)")]
        public string name
        {
            get { return _name; }
            set { _name = value; }
        }

        [Column("EAddress", TypeName = "varchar(20)")]
        public string Address
        {
            get { return _address; }
            set { _address = value; }
        }
    }
}