using Microsoft.AspNetCore.Mvc;

namespace Demo05_Attribute_Routing.Controllers
{
    [Route("[controller]")]
    public class DashboardController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        [Route("[action]")]
        public int GetNumber()
        {
            return 100;
        }

        [Route("[action]/{id?}/{nm?}")]
        public string GetSomething(int id, string nm)
        {
            return $"Id: {id}, Name:{nm}";
        }
    }
}
