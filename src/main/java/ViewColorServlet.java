import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String colorValue = request.getParameter("color");

        // set the background color of the page using a style tag
        String styleString = String.format("background-color:%s;", colorValue);
        request.setAttribute("styleString", styleString);

        // Forward to the viewcolor.jsp page to display the color
        request.getRequestDispatcher("viewcolor.jsp").forward(request, response);
    }
}
