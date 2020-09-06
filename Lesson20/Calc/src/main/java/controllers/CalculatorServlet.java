package controllers;

import pojo.Calculator;
import service.CalculatorService;
import service.CalculatorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CalculatorServlet extends HttpServlet {
    private CalculatorService calculatorService;

    @Override
    public void init() throws ServletException {
        super.init();
        calculatorService = new CalculatorServiceImpl();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double result = 0;
        double number1 = Double.parseDouble(req.getParameter("first"));
        double number2 = Double.parseDouble(req.getParameter("second"));
        String sign = req.getParameter("sign");

        if (sign.equals("+")) {
            result = number1 + number2;
        } else if (sign.equals("-")) {
            result = number1 - number2;
        } else if (sign.equals("*")) {
            result = number1 * number2;
        } else if (sign.equals("/")) {
            result = number1 / number2;
        }
        resp.getWriter().write(String.valueOf(result));
        req.setAttribute("result", result);

        req.getRequestDispatcher("index.jsp").forward(req, resp);

        try {
            Calculator calculator = new Calculator(number1, number2, sign, result);
            calculatorService.addResult(calculator);

        } catch (Exception ex) {
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }


    }

}
