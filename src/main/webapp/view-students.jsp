<%@ page import="java.util.*,com.lab.crud_jsp.student.StudentDAO,com.lab.crud_jsp.student.Student" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Student</title>
    <style>
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

        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
    <h2>All Students</h2>
    <div class="container">
        <div class="top-bar">
            <a href="index.jsp">Home</a>
        </div>
        <div>
            <table>
                <tr>
                    <th>S.N.</th>
                    <th>Roll No</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Program</th>
                    <th>Action</th>
                </tr>

            <%
                List<Student> list = StudentDAO.getAllStudents();
                int i = 1;
                for (Student student : list) {
            %>
                    <tr>
                        <td><%=i++%> </td>
                        <td><%=student.getRoll_no()%></td>
                        <td><%=student.getName()%></td>
                        <td><%=student.getEmail()%></td>
                        <td><%=student.getProgram()%></td>
                        <td>
                            <a href="edit-student.jsp?id=<%=student.getId()%>">Edit</a>
                            <a href="delete-student.jsp?id=<%=student.getId()%>"
                                onclick="return confirm('Are you sure you want to delete this student?');">
                                Delete
                            </a>
                        </td>
                    </tr>
            <%    } %>
            </table>
        </div>
    </div>
</body>