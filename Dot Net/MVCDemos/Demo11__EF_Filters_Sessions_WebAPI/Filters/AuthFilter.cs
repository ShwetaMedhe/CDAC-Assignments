using Microsoft.AspNetCore.Mvc.Filters;

namespace Demo11__EF_Filters_Sessions_WebAPI.Filters
{
    public class AuthFilter : ActionFilterAttribute
    {
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            var token = context.HttpContext.Session.GetString("token");
            if (token == null)
            {
                context.HttpContext.Response.Redirect("/Login/SignIn");
            }
        }
    }
}