import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.RegHexUtils;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sort-numeric-string")
public class SortNumericString extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter printWriter = resp.getWriter();
        String numericString = req.getParameter("numericString");
        RegHexUtils regHexUtils = new RegHexUtils();
        try {
            printWriter.println("<h2>sorted numeric string : " + regHexUtils.sortNumericString(numericString) + "</h2>");
        } finally {
            printWriter.close();
        }
    }

}
