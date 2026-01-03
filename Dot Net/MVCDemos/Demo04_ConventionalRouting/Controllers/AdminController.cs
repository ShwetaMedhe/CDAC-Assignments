using Microsoft.AspNetCore.Mvc;

namespace Demo04_ConventionalRouting.Controllers
{
    public class AdminController : Controller
    {
        public string Index(string nm)
        {
            return nm;
        }
    }
}