<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <% String n = (String) request.getAttribute("nom");%>
            
                <%String m = (String) request.getParameter("mail");%>
            
        <h4 align="center">
            Bonjour <% out.print(n);%><br>
        </h4>
        
        <h6 align="center">
            vous etes connecté avec le login <% out.print(m);%>
        </h6>
    </body>
</html>