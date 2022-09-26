import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.RegHexUtils;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String numericString = req.getParameter("numericString");
        System.out.println("Parameter " + numericString);
        RegHexUtils regHexUtils = new RegHexUtils();
        try {
            printWriter.println("<h2>sorted numeric string :" + regHexUtils.sortNumericString(numericString) + "</h2>");
        } finally {
            printWriter.close();
        }
    }

}
