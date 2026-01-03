using System.ComponentModel.DataAnnotations;

using System.ComponentModel.DataAnnotations.Schema;

namespace Demo11__EF_Filters_Sessions_WebAPI.Models
{
    [Table("Emp")]
    public class Emp
    {
        [Key]
        [Column("id",TypeName ="int")]
        public int id { get; set; }

        [Column("name", TypeName = "varchar(50)")]
        public string name { get; set; }

        [Column("address", TypeName = "varchar(50)")]
        public string address  { get; set; }

    }
}
