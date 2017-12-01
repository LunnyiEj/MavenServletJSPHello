package ru.lunnyiej;
/**
 * Created by LunnyiEj on 28.11.2017.
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/JSPServlet", name = "JSPServlet")
public class JSPServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp.jsp").forward(req, resp);
    }
}