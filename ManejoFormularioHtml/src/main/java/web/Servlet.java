package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 *
 *
 * @author fabricio
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF8");
        PrintWriter out = response.getWriter();

        //Capturar variables
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print(" <title>Resultado Servlet</title>");
        out.print("</head>");
        
        out.print("<body>");
        out.print("<h1>Parametros procesados por el servlet</h1>");
        out.print("<p>Usuario: " + usuario + "</p>");
        out.print("<p>Password: " + password + "</p>");
        
        out.print("</body>");
        
        out.print("</html>");
    }
}
