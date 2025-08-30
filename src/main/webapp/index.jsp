<%@ page language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <title>Student Management</title>
    <style>
        .flex-container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #f5f5f5;
        }

        .links {
            margin-top: 10px;
        }

        .links a {
            margin: 0 10px;
            color: blue;
        }

        .links a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body >
    <div class="flex-container">
        <h2>Student Management System</h2>
        <div class="links">
            <a href="add-student.jsp">Add Student</a> |
            <a href="view-students.jsp">View Students</a>
        </div>
    </div>
</body>
</html>
