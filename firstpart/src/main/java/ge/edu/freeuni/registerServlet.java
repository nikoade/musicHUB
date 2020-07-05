package ge.edu.freeuni;

import dao.AccountManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountManager accountManager = (AccountManager) getServletContext().getAttribute("accountManager");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        if(accountManager.addUser(userName, password)){
            String welcomeString = "Welcome " + userName;
            req.setAttribute("welcomeString", welcomeString);
            req.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(req,resp);
        }else{
            req.setAttribute("userName", userName);
            req.getRequestDispatcher("/WEB-INF/registerFailed.jsp").forward(req,resp);
        }
    }
}
