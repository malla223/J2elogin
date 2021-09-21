/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.userbean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohamedlamine.kone
 */
@WebServlet (name="Myservlet", urlPatterns=("/Myservlet"))
public class Myservlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//creation des variables a recuperer
        String nom = request.getParameter("nom");
        String email = request.getParameter("mail");
        String password = request.getParameter("mtd");
        
        try (PrintWriter out = response.getWriter()){
        
        userbean user = new userbean();
        user.setNom(nom);
        user.setEmail(email);
        user.setPassword(password);
        
        ArrayList listuser = new ArrayList();
        listuser.add(user);
        
        userbean user2 = new userbean();
        user2.setNom("test");
        user2.setEmail("testemai");
        user2.setPassword("12456");
        listuser.add(user2);
            System.out.println("My list=================)"+listuser);
        //renvoyer la valeur de l'attribut au fichier jsp
        request.setAttribute("nom", nom);
        request.setAttribute("email", email);
        
        request.getRequestDispatcher("vue.jsp").forward(request, response);
    }
    }
}
