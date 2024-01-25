package Controller;

import Model.DAO.UserDao;
import Model.bean.User;
import Model.service.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", value="/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String email = req.getParameter("email");

            String pass = req.getParameter("pass");


//           User checkEmail = UserDao.getUserByEmail(email);
           User u = new UserServices().checkLogin(email, pass);




        if(u != null)
            resp.sendRedirect(req.getContextPath() + "/View/Home.jsp" );
else {

            req.setAttribute("result", "Mật khẩu không chính xác!");
            req.getRequestDispatcher("/View/Login.jsp").forward(req, resp);
//            resp.sendRedirect(req.getContextPath() + "/View/login.jsp");


        }






    }
}
