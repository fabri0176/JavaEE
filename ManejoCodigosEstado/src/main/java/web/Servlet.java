/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Siumalando valores correctos
        String usuarioOk = "Juan";
        String passwordOk = "Juan";

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        
        if (!usuario.equals(usuarioOk) || !password.equals(passwordOk)) {
            response.sendError(response.SC_UNAUTHORIZED,"Las credenciales son incorrectas");
            return;
        }
        PrintWriter out = response.getWriter();
        out.print("Datos correctos Usuario: "+usuario+"</br>");
        out.print("Datos correctos<br> Password: "+password+"</br>");

    }
}
