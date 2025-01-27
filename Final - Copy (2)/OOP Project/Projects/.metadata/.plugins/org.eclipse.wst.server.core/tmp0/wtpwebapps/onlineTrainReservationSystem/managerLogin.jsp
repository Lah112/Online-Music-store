<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manager Login</title> 
    <style>
        /* Internal CSS */
        body {
            background-image: url('loginBackground.jpg'); /* URL to your background image */
            background-size: cover; /* Make sure the image covers the entire background */
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.9); /* Semi-transparent white background for the form */
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        /* Style for the welcome message container */
        .welcome-container {
            background-color: #007bff; /* Blue background color */
            color: #fff; /* White text color */
            text-align: center;
            padding: 10px; /* Padding around the welcome message */
            border-radius: 5px; /* Rounded corners */
            margin-bottom: 20px; /* Space between welcome message and form */
        }

        /* Style for the welcome message text */
        .welcome-message {
            font-size: 18px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .btn {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 15px;
            cursor: pointer;
            border-radius: 3px;
            width: 100%;
        }

        a {
            text-decoration: none;
            display: block;
            text-align: center;
            color: #007bff;
        }
         body {
    background-image: url("https://th.bing.com/th/id/OIP.jyNh-zfYfTnpoSIRng2kAwHaEz?w=272&h=180&c=7&r=0&o=5&pid=1.7"); 
    background-size: cover;
    background-repeat: no-repeat;
  }
        
    </style>
</head>
<body>
    <div class="container">
        <div class="welcome-container">
            <p class="welcome-message">Welcome to Manager Login for Travel Buddy Online Train Reservation System.</p>
        </div>
        <h2>Manager Login</h2> 
        <form action="managerLog" method="post"> <!-- Update the form action to "adminLoginServlet" -->
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="manageruid" required> <!-- Update the input name to "adminUid" -->
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="managerpass" required> <!-- Update the input name to "adminPass" -->
            </div>
            <div class="form-group">
                <input type="submit" name="submit" value="Login" class="btn"> <!-- Update the input name to "adminSubmit" -->
            </div>
        </form>
        
        <!-- Link to User Login Page -->
        <p>Switch to user login? <a href="login.jsp">User Login</a></p>
    </div>
</body>
</html>
