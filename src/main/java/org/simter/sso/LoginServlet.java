package org.simter.sso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dragon on 2015/1/25.
 */
@WebServlet(value = {"/simter/sso/login", "/simter/sso"})
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "dragon");
        req.getRequestDispatcher("/simter/sso/login.jsp").forward(req, resp);
    }
}
