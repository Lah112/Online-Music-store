<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manager- Travel Buddy Online Train Reservation System</title>
    
    
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
         body {
    background-image: url("https://th.bing.com/th/id/OIP.jyNh-zfYfTnpoSIRng2kAwHaEz?w=272&h=180&c=7&r=0&o=5&pid=1.7"); 
    background-size: cover;
    background-repeat: no-repeat;
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
        <a href="#">Home</a>
        <a href="managerAddTrainSchedule.jsp">Schedule</a>
        <a href="trainSchedList.jsp">TrainList</a>
    </div>

    <!-- Body Content -->
    <div class="content">
        <h4>Welcome to the Train Reservation Manager Dashboard</h4>
        <p>Welcome to the Manager Dashboard of our Online Train Reservation System. As a manager, this is your central hub for overseeing and controlling various aspects of the train reservation process. From here, you can manage train schedules and  ensure the smooth operation of our railway services. Use the navigation links above to access different sections and perform your managerial duties efficiently.</p>
    </div>
    <div>
    <img src="https://th.bing.com/th/id/OIP.SZ_yEZh3YhKmqQhYvdmMDgHaHy?w=194&h=204&c=7&r=0&o=5&pid=1.7" width="200" height="200">
   <right>
    <img src="https://th.bing.com/th/id/R.c6bf57f6894c91ccd3a7ee2676aa359f?rik=MbQsdgxmjoOQqw&pid=ImgRaw&r=0" width="200" height="200"></right></div>

    

    
    
     <footer>
        <p class="footer">&copy; 2023 Travel Buddy - All rights reserved.</p>
    </footer>
    </body>
    </html>
    