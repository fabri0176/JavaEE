<%--
    Document   : expresiones
    Created on : 25 jul. 2020, 11:48:52
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            <strong>Concatenación:</strong>
            <%= "Saludos" + " " + "JSP"%>
        </p>
        <p>
            <strong>Operación Matematica</strong>
            <%= 2 + 3%>
        </p>
        <p>
            <strong>Session ID</strong>
            <%= session.getId()%>
        </p>
        <p>
            <a href="index.jsp">Regresar a Inicio</a>
        </p>

    </body>
</html>
