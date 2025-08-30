<%@ page import="com.lab.crud_jsp.student.StudentDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
<%
    String idParam = request.getParameter("id");
    if (idParam != null) {
        int id = Integer.parseInt(idParam);
        StudentDAO.deleteStudent(id);
    }
    response.sendRedirect("view-students.jsp");
%>
</body>
</html>
