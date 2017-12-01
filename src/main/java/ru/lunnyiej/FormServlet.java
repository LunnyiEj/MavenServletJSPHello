package ru.lunnyiej;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/FormServlet", name = "FormServlet")
public class FormServlet extends HttpServlet {
    private final cupOfTea cup = new cupOfTea();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("cup", this.cup);
        getServletContext().getRequestDispatcher("/Form.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("cup", this.cup);
        if (request.getParameter("sip") != null) { cup.sip();}
        if (request.getParameter("fillTheCup") != null) { cup.fillTheCup();}
        getServletContext().getRequestDispatcher("/Form.jsp").forward(request, response);
    }

}
