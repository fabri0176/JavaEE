package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionesServlet")
public class SessionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        session.getId();
        String titulo = null;

        //Pedir atributo contador visitas
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }

        //add new value session
        session.setAttribute("contadorVisitas", contadorVisitas);
        session.setAttribute("titulo", titulo);
        PrintWriter out = response.getWriter();

        out.print("<table>");
        out.print("<tr>");
        out.print(" <td>");
        out.print("     Título: " + titulo);
        out.print(" </td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print(" <td>");
        out.print("N# visitas: " + contadorVisitas);
        out.print(" </td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print(" <td>");
        out.print("ID de la session: " + session.getId());
        out.print(" </td>");
        out.print("</tr>");
        out.print("</table>");
        out.close();
    }
}
