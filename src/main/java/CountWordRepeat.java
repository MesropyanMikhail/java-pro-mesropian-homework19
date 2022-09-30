import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.RegHexUtils;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count-word-repeat")
public class CountWordRepeat extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();
        String word = req.getParameter("word");
        System.out.println("Parameter " + word);
        RegHexUtils regHexUtils = new RegHexUtils();

        try {
            printWriter.println("<h2>count word repeat :" + regHexUtils.countWordRepeat(word) + "</h2>");
        } finally {
            printWriter.close();
        }

    }
}
