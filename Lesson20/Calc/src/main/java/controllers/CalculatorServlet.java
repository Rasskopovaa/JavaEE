package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalculatorServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer result = 0;
        Double result2 = 0.0;
        Integer number1 = Integer.valueOf(req.getParameter("first"));
        Integer number2 = Integer.valueOf(req.getParameter("second"));
        String sign = req.getParameter("sign");

        if (sign.equals("+")) {
            result = number1 + number2;
        } else if (sign.equals("-")) {
            result = number1 - number2;
        } else if (sign.equals("*")) {
            result = number1 * number2;
        } else if (sign.equals("/")) {
            result2 = (double) number1 / (double) number2;
        }
        resp.getWriter().write(String.valueOf(result));
        req.setAttribute("result", result);
        if (sign.equals("/")) {
            req.setAttribute("result", result2);
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);


    }

}
