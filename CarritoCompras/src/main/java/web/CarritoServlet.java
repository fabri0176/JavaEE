package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nuevoArticulo = request.getParameter("articulo");

        HttpSession session = request.getSession();

        List<String> articulos = (List<String>) session.getAttribute("articulos");

        //Verificar si la lista existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            session.setAttribute("articulos", articulos);
        }

        //Revisamos y agregamos el articulo
        if (nuevoArticulo != null && !nuevoArticulo.trim().equals("")) {
            articulos.add(nuevoArticulo);
        }

        try ( //Imprimimos la lista de articulo
                PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br>");

            //Iteramos todos los articulos
            for(String articulo: articulos){
                out.print("<li>"+articulo+"</li>");
            }

            out.print("<br>");
            out.print("<a href='/CarritoCompras'>Regresar a Inicio</a>");
        }
    }
}
