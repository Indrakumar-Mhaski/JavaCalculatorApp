package com.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operation = request.getParameter("operation");

        double result = 0;
        boolean validInput = true;
        try {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);
            
            switch (operation) {
                case "add":
                    result = number1 + number2;
                    break;
                case "subtract":
                    result = number1 - number2;
                    break;
                case "multiply":
                    result = number1 * number2;
                    break;
                case "divide":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        request.setAttribute("error", "Cannot divide by zero");
                        validInput = false;
                    }
                    break;
                default:
                    request.setAttribute("error", "Invalid operation");
                    validInput = false;
            }
            
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid number format");
            validInput = false;
        }

        if (validInput) {
            request.setAttribute("result", result);
        }
        
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}
