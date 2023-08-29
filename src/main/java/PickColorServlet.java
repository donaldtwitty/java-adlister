import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pickcolor")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String colorValue = request.getParameter("colorValue");

        // Redirect to the ViewColorServlet passing the color value in a query string
        response.sendRedirect("viewcolor?color=" + colorValue);
    }
}
