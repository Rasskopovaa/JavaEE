package controllers;

import pojo.Calculator;
import service.CalculatorService;
import service.CalculatorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CalculatorServlet extends HttpServlet {
    private CalculatorService calculatorService;

    @Override
    public void init() throws ServletException {
        super.init();
        calculatorService = new CalculatorServiceImpl();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sign = req.getParameter("sign");

        List<Calculator> list = new ArrayList<>();

        list = calculatorService.getAllResults();
        req.getSession().setAttribute("list", list);

        req.getRequestDispatcher("/calc.jsp").forward(req, resp);
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

        Calculator calculator = new Calculator(number1, number2, sign, result);
        calculatorService.addResult(calculator);

        req.getRequestDispatcher("calc.jsp").forward(req, resp);





    }

}
