/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCPattern;

import Beans.UserBean;
import UserDao.SignUpdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class ControllerSignUp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
        } catch (Exception e) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String pass = request.getParameter("password");
        UserBean ub = new UserBean();
        ub.setName(name);
        ub.setEmail(email);
        ub.setPhone(phone);
        ub.setPass(pass);
        System.out.println("yes comes..");
        SignUpdao sda = new SignUpdao();
        String execute = sda.insertuerdata(ub);
        if (execute.equals("success")) {
request.getRequestDispatcher("/Home.jsp").forward(request, response);
        } else {
            request.setAttribute("errmsg", execute);
request.getRequestDispatcher("/SignUp.jsp").forward(request, response);

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
