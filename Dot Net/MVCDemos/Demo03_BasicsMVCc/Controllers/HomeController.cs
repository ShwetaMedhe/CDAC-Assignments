using Microsoft.AspNetCore.Mvc;

namespace Demo03_BasicsMVCc.Controllers
{
    public class HomeController : Controller
    {
        //Action method
        public IActionResult Index()
        {
            return View();
        }
    }
}
