using Microsoft.EntityFrameworkCore;

namespace Demo11__EF_Filters_Sessions_WebAPI.Models
{
    public class IETDBContext:DbContext
    {
        public DbSet<Emp> emps { get; set; }    
        public IETDBContext(DbContextOptions options) : base(options) 
        {
            
        }
    }
}
