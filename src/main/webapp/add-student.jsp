<%@ page import="com.lab.crud_jsp.student.StudentDAO,com.lab.crud_jsp.student.Student" %>
<%
    if (request.getParameter("submit") != null) {
        Student student = new Student();
        student.setRoll_no(Integer.parseInt(request.getParameter("roll_no")));
        student.setName(request.getParameter("name"));
        student.setEmail(request.getParameter("email"));
        student.setProgram(request.getParameter("program"));
        StudentDAO.insertStudent(student);
        response.sendRedirect("view-students.jsp");
    }
%>
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
<div class="container">
    <!-- Top bar -->
    <div class="top-bar">
        <a href="index.jsp">Home</a>
    </div>

    <!-- Centered form -->
    <div class="content">
        <form method="post">
            <fieldset>
                <legend>Student Form</legend>
                <label for="roll_no">Roll No:</label>
                <input type="text" id="roll_no" name="roll_no">

                <label for="name">Name:</label>
                <input type="text" id="name" name="name">

                <label for="email">Email:</label>
                <input type="email" id="email" name="email">

                <label for="program">Program:</label>
                <input type="text" id="program" name="program">

                <input type="submit" name="submit" value="Add">
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>
