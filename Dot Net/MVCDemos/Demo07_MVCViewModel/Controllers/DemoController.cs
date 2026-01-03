using Demo07_MVCViewModel.Models;
using Microsoft.AspNetCore.Mvc;

namespace Demo07_MVCViewModel.Controllers
{
    public class DemoController : Controller
    {
        public IActionResult Index()
        {
            // Key-value: Dynamic type
            ViewBag.message = "This is the way!";

            Emp emp = new Emp() { Id = 101, Name = "Tom Ellis", Address = "London" };
            ViewBag.empInfo = emp;

            ViewData["number"] = 12345;

            Emp emp1 = new Emp() { Id = 102, Name = "Tom Hanks", Address = "LA" };
            ViewData["emp1"] = emp1;

            TempData["PIN"] = 223344;

            return View();
        }
        public IActionResult About()
        {
            ViewBag.message = "This is the way!";
            return View();
        }
        public IActionResult Contact()
        {
            return View();
        }
        public IActionResult ABCD()
        {
            return View();
        }
    }
}
