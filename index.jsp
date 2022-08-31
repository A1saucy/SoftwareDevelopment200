<%-- 
    Document   : index
    Created on : Aug 30, 2022, 6:19:25 PM
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
          String m1 = "Hello";
          String m2 = "World";
          
          String result = m1 + " " + m2;
          
            
          %>
            
          <p>The java code says <%= result %> here.</p>
            
          <form method ="Get" action="other.jsp">
              <p> name: <input type ="text" name ="username"></p>
              <p> age: <input type ="number" name ="userage"></p>
              <p><input type ="submit" value ="Submit"></p>
              <p><input type="reset" value ="Clear"></p>  
          </form>
        
        
        
    </body>
</html>
