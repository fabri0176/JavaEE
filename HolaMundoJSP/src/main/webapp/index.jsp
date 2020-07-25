<%--
    Document   : index
    Created on : 18 jul. 2020, 16:32:54
    Author     : fabricio
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo expresion JSP</title>
    </head>
    <body>
        <h1>Ejemplo expresion JSP</h1>
        <ul>
            <li><% out.print("Hola mundo con escriplets");%> </li>
            <li>${"Hola mundo con Expression Language {EL}"}</li>
            <li><%= "Hola mundo con expresiones"%></li>
            <li><c:out value="Hola munda con JSTL"></c:out></li>
        </ul>

        <p>
            <a href="expresiones.jsp">Link al JSP Expresiones</a>
            <br>
        <h4>Formulario HTML</h4>
        <form name="form1" action="procesaformulario.jsp">
            Usuario: <input type="text" name="usuario">
            <br>
            Password: <input type="password" name="password" >
            <br>
            <input type="submit" value="Enviar">
        </form>
    </p>
</body>
</html>
