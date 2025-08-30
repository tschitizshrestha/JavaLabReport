<%@ page import="com.lab.crud_jsp.student.StudentDAO" %>
<%@ page import="com.lab.crud_jsp.student.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student</title>
    <style>
        body {
            margin: 0;
            background-color: #f0f0f0;
            font-family: Arial, sans-serif;
        }

        .container {
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        .top-bar {
            padding: 15px;
            text-align: left;
        }

        .top-bar a {
            text-decoration: none;
            padding: 6px 12px;
            background-color: #007BFF;
            color: white;
            border-radius: 5px;
        }

        .top-bar a:hover {
            background-color: #0056b3;
        }

        .content {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        form {
            width: 400px;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        fieldset {
            border: 1px solid black;
            padding: 10px;
            margin: 0;
        }

        legend {
            font-weight: bold;
            margin-bottom: 10px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="submit"] {
            display: block;
            margin: 10px 0;
            cursor: pointer;
        }
    </style>
</head>
<body>
<%
    String idParam = request.getParameter("id");
    Student student = null;
    if (idParam != null) {
        student = StudentDAO.getStudentById(Integer.parseInt(idParam));
    }

    if (request.getParameter("submit") != null) {
        Student s = new Student();
        s.setId(Integer.parseInt(idParam));
        s.setRoll_no(Integer.parseInt(request.getParameter("roll_no")));
        s.setName(request.getParameter("name"));
        s.setEmail(request.getParameter("email"));
        s.setProgram(request.getParameter("program"));
        StudentDAO.updateStudent(s);
        response.sendRedirect("view-students.jsp");
        return;
    }
%>
    <div class="container">
        <!-- Top bar -->
        <div class="top-bar">
            <a href="index.jsp">Home</a>
        </div>
        <div class="content">
            <form method="post">
                <fieldset>
                    <label for="roll_no">Roll No:</label>
                    <input type="text" id="roll_no" name="roll_no" value="<%= student.getRoll_no() %>">
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" value="<%= student.getName() %>">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" value="<%= student.getEmail() %>">
                    <label for="program">Program:</label>
                    <input type="text" id="program" name="program"value="<%= student.getProgram() %>">
                    <input type="submit" name="submit" value="Update">
                </fieldset>
            </form>
        </div>
    </div>
</body>
</html>
