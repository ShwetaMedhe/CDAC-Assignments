namespace Demo02_EmptyTemplate
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            var app = builder.Build();

            //Middlewares

            #region app.Map- GET , POST, PUT, DELETE
            //app.MapGet("/", () => "GET: <h1>Hello World!</h1>");
            //app.MapPost("/", () => "Post: Hello World!");
            //app.MapPut("/", () => "Put: Hello World!");
            //app.MapDelete("/", () => "Delete: Hello World!"); 
            #endregion

            #region app.Run()
            //app.Run(async (context) =>
            //{
            //    await context.Response.WriteAsync("Hello");
            //    await context.Response.WriteAsync("Bye");
            //});

            ////app.Run(async (context) =>
            ////{
            ////    await context.Response.WriteAsync("Bye");
            ////}); 
            #endregion

            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Hi");
                await context.Response.WriteAsync("Hello");
                next(context);
            });
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Bye");
                next(context);
                await context.Response.WriteAsync("how are you?");
            });
            app.Run(async (context) => {
                await context.Response.WriteAsync("\nBye Hugh Jackman!!");
            });
            app.Run();
        }
    }
}
