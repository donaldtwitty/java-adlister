import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class HelloWorldPartner extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name != null) {
            response.getWriter().println("<h1>" + name + "</h1>");
        } else {
            response.getWriter().println("<h1>Hello World Partner!</h1>");
        }
    }
}
