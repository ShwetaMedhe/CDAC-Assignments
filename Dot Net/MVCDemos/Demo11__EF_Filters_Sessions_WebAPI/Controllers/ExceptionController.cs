using Microsoft.AspNetCore.Mvc;

namespace Demo11__EF_Filters_Sessions_WebAPI.Controllers
{
    public class ExceptionController : Controller
    {
        public IActionResult Error()
        {
            return View();
        }
    }
}
