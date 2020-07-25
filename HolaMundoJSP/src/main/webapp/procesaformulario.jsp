<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Process Form</title>
    </head>
    <body>
        <h1>Result</h1>
        <table style="border: 1px">
            <tr>
                <td><b>Usuario:</b></td>
                <td><%= request.getParameter("usuario")%></td>
            </tr>
            <tr>
                <td><b>Password:</b></td>
                <td><%= request.getParameter("password")%></td>
            </tr>
        </table>
        <br>
        <br>
        <p>
            <a href="index.jsp">Regresar a Inicio</a>
        </p>
    </body>
</html>
