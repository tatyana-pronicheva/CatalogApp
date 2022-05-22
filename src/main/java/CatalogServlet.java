import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CatalogServlet extends HttpServlet {

    // GET http://localhost:8080/app/catalog
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Product[] productList = {
                    new Product(1,"Milk", 50),
                    new Product(2,"Bread", 20),
                    new Product(3, "Meat", 300),
                    new Product( 4, "Butter", 200),
                    new Product(5, "Eggs", 100),
                    new Product(6, "Cheese", 200),
                    new Product(7, "Apple", 5),
                    new Product(8, "Chocolate", 90),
                    new Product(9, "Cookies", 30),
                    new Product(10, "Cucumber", 10)
            };

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("<html><body>");
        for (int i = 0; i<10 ; i ++){
            out.println(String.format("id: %d, title: %s, cost: %d",
                    productList[i].getId(),
                    productList[i].getTitle(),
                    productList[i].getCost()));
            out.println("<br>");
        }
        out.println("</body></html>");
        out.close();
    }
}
