<%-- 
    Document   : pag10_principal
    Created on : 31-ago-2022, 21:10:00
    Author     : Eddye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo: Acciones "include con parámetros"</h1>
        <jsp:include page="pag10_secundaria.jsp">
            <jsp:param name="parNom" value="Eddye" />
            <jsp:param name="parApe" value="Lino" />
        </jsp:include>
    </body>
</html>
