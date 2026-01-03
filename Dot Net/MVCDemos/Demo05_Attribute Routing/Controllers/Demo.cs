using Microsoft.AspNetCore.Mvc;

namespace Demo05_Attribute_Routing.Controllers
{
    [Route("Demo")]
    public class Demo : Controller
    {
        [Route("Demo")]
        public IActionResult Index()
        {
            return View("~/Views/Demo/Data.cshtml");
        }

        public string SayHii()
        {
            return "Hello!";
        }
    }
}
