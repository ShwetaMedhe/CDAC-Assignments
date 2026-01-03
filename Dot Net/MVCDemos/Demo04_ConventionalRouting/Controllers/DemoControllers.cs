using Microsoft.AspNetCore.Mvc;

namespace Demo04_ConventionalRouting.Controllers
{
    public class DemoControllers : Controller
    {

        public IActionResult Index()
        {
            return View();
        }

    }
}