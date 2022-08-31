<%-- 
    Document   : other
    Created on : Aug 30, 2022, 6:34:14 PM
    Author     : soitguest
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
            String username = request.getParameter("username");
            String userage = request.getParameter("userage");
            %>
        
            <p> Hello there <%= username %> I hear you're <%= userage%> years old.</p>
        
        
        
    </body>
</html>
