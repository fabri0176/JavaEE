/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabricio
 */
@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        String uri = request.getRequestURI();
        Enumeration cabeceros = request.getHeaderNames();

        out.print("<html>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<p>HTTP Method: " + metodoHttp + "</p>");
        out.print("<p>URI: " + uri + "</p>");
        while (cabeceros.hasMoreElements()) {
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<p>" + nombreCabecero + ": <b>" + request.getHeader(nombreCabecero) + "</b></p>");

        }
        out.print("</body>");
        out.print("</html>");
        out.close();
    }

}
