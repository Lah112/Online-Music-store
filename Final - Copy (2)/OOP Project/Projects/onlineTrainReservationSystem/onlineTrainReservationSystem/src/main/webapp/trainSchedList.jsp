<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager- Travel Buddy Online Train Reservation System</title>
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    crossorigin="anonymous">
<style>
    body {
        background-image: url("https://th.bing.com/th/id/OIP.jyNh-zfYfTnpoSIRng2kAwHaEz?w=272&h=180&c=7&r=0&o=5&pid=1.7");
        background-size: cover;
        background-repeat: no-repeat;
    }

    .transparent-form {
        background: rgba(255, 255, 255, 0.7);
        padding: 20px;
        border-radius: 10px;
    }

    /* Style for the "Edit" text */
    .edit-text {
        color: red;
    }

    /* Style for the "Edit" button */
    .edit-button {
        background-color: green;
        color: white;
        border: none;
        padding: 5px 10px;
        border-radius: 5px;
        text-decoration: none;
    }
    .delete-button {
        background-color:red;
        color: white;
        border: none;
        padding: 5px 10px;
        border-radius: 5px;
        text-decoration: none;
    }
         /* Header Styles */
        .header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        /* Navigation Bar Styles */
        .navbar {
            background-color: #444;
            overflow: hidden;
        }

        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #555;
        }

        /* Body Styles */
        .content {
            padding: 20px;
            color:#fff;
            font-size:30px;
       }
      .footer {
        background-color: #444;
        color: white;
        text-align: center;
        padding: 10px 0;
    }

    /* Adjust footer font size and style as needed */
    .footer p {
        font-size: 14px;
        font-style: italic;
    }
</style>
<script>
    function confirmEdit(id) {
        var r = confirm("Do you want to edit this Schedule?");
        if (r == true) {
            window.location.href = "<%=request.getContextPath()%>/edit?id=" + id;
        }
    }

    function confirmDelete(id) {
        var r = confirm("Do you want to delete this Schedule?");
        if (r == true) {
            window.location.href = "<%=request.getContextPath()%>/delete?id=" + id;
        }
    }
</script>
</head>
<body>
 <!-- Header -->
    <div class="header">
        <h>Travel Buddy</h>
        <h1>Train Reservation Manager Dashboard</h1>
    </div>

    <!-- Navigation Bar -->
    <div class="navbar">
        <a href="managerhome.jsp">Home</a>
        <a href="managerAddTrainSchedule.jsp">Schedule</a>
        <a href="#">TrainList</a>
    </div>


    <br>

    <div class="row">
        <div class="container">
            <h3 class="text-center">List of trains</h3>
            <hr>
            <div class="container text-left">
                <a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add New Schedule</a>
            </div>
            <br>
            <div class="card transparent-form">
                <div class="card-body">
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Station1</th>
                                <th>Station2</th>
                                <th>Distance</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="train_schedule" items="${listts}">
                                <tr>
                                    <td><c:out value="${train_schedule.id}" /></td>
                                    <td><c:out value="${train_schedule.station1}" /></td>
                                    <td><c:out value="${train_schedule.station2}" /></td>
                                    <td><c:out value="${train_schedule.km}" /></td>
                                    <td>
                                        
                                      
                                        <!-- Modify your "Edit" and "Delete" buttons to call the JavaScript functions -->
    <a href="javascript:void(0);" onclick="confirmEdit(<c:out value='${train_schedule.id}' />)" class="edit-button">Edit</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="javascript:void(0);" onclick="confirmDelete(<c:out value='${train_schedule.id}' />)" class="delete-button">Delete</a>
                                        
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <footer>
        <p class="footer">&copy; 2023 Travel Buddy - All rights reserved.</p>
    </footer>
</body>
</html>
