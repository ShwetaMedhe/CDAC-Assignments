using EntityFramework.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;


namespace EntityFramework.DAL
{
    public class IETDbContext : DbContext
    {
        public DbSet<Emp> emps {  get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)

        {
            var builder = new ConfigurationBuilder();
            builder.SetBasePath(Directory.GetCurrentDirectory());

            builder.AddJsonFile("appsettings.json");
            IConfiguration config= builder.Build();
            optionsBuilder.UseSqlServer(config.GetConnectionString("IETDB"));

        }
    }
}
