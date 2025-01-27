<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Manage Train Schedule</title>
    <style>
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
            color: #fff;
            font-size: 70px;
        }

        body {
            background-image: url("https://th.bing.com/th/id/OIP.jyNh-zfYfTnpoSIRng2kAwHaEz?w=272&h=180&c=7&r=0&o=5&pid=1.7");
            background-size: cover;
            background-repeat: no-repeat;
        }

        .transparent-form {
            background: rgba(255, 255, 255, 0.7);
            padding: 20px;
            border-radius: 10px;
            width: 500px;
            height:300px; /* Adjust the width as needed */
            margin: 0 auto; /* Center the form horizontally */
            text-align: center;
        }

        .center {
            color: white;
            text-align: center;
        }

        /* Additional Form Styles */
        .form-group {
            margin: 10px 0;
        }

        .bold-label {
            font-weight: bold;
        }

        .btn-success {
            background-color: #28a745;
            color: #fff;
            border: none;
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
        <a href="#">Schedule</a>
         <a href="trainSchedList.jsp">TrainList</a>
    </div>

    <h1 class="center">Train Management System</h1>

    <div class="transparent-form">
        <div>
            <c:if test="${listts != null}">
                <form action="update" method="post">
            </c:if>
            <c:if test="${listts == null}">
                <form action="insert" method="post">
            </c:if>

            <caption>
                <h2>
                    <c:if test="${train_schedule != null}">
                        Edit Train Schedule
                    </c:if>
                    <c:if test="${train_schedule == null}">
                        Add Train Schedule
                    </c:if>
                </h2>
            </caption>

            <c:if test="${listts != null}">
                <input type="hidden" name="id" value="<c:out value='${listts.id}' />" />
            </c:if>

            <div class="form-group">
                <label class="bold-label">Station1</label>
                <input type="text" value="<c:out value='${listts.station1}' />" name="station1" required="required">
            </div>

            <div class="form-group">
                <label class="bold-label">Station2</label>
                <input type="text" value="<c:out value='${listts.station2}' />" name="station2">
            </div>

            <div class="form-group">
                <label class="bold-label">Distance</label>
                <input type="text" value="<c:out value='${listts.km}' />" name="km">
            </div>
			
            <button type="submit" class="btn-success">Save</button>
        </form>
    </div>
    
</div>

     <footer>
        <p class="footer">&copy; 2023 Travel Buddy - All rights reserved.</p>
    </footer>
</body>
</html>
