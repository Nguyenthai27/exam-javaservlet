<%--
  Created by IntelliJ IDEA.
  User: nguyenthai
  Date: 28/10/2023
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<%
    String Id = request.getParameter("id");
    String FullName = request.getParameter("name");
    String Birthday = request.getParameter("birth");
    String Address = request.getParameter("add");
    String Position = request.getParameter("posit");
    String Department = request.getParameter("depart");
%>
<h1>List</h1>
<h3>id : <%= Id %></h3>
<h3>name : <%= FullName %></h3>
<h3>birthday : <%= Birthday %></h3>
<h3>address : <%= Address %></h3>
<h3>position : <%= Position %></h3>
<h3>department : <%= Department %></h3>
</body>
</html>
