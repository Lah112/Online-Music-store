<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Music Store Feedback</title>
    <style>
        /* Reset CSS */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Body styles */
        body {
            font-family: Arial, sans-serif;
            background-image: url('background.jpg'); /* Replace with your background image */
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            color: #333;
            line-height: 1.6;
            min-height: 100vh; /* Set minimum height to 100% of viewport height */
            position: relative; /* Required for footer positioning */
        }

        /* Navigation header styles */
        .navbar {
            background-color: rgba(0, 51, 102, 0.8); /* Transparent blue color */
            color: #FFF; /* Navbar text color */
            padding: 10px 0; /* Navbar padding */
            text-align: center;
            border-radius: 0 0 10px 10px; /* Rounded corners */
            position: relative; /* Position relative for absolute logo */
        }

        /* Navigation links */
        .navbar a {
            color: #FFF; /* Navbar link text color */
            text-decoration: none;
            margin: 0 20px; /* Navbar link margin */
            font-size: 18px; /* Navbar link font size */
            transition: color 0.3s; /* Smooth transition for link color */
        }

        /* Change link color on hover */
        .navbar a:hover {
            color: #FFC300; /* Hover link color */
        }

        /* Logo styles */
        .logo {
            width: 80px; /* Adjust the width of your logo */
            height: 40px;
            position: absolute;
            top: 50%;
            left: 20px;
            transform: translateY(-50%); /* Center vertically */
        }

        /* Container styles */
        .container {
            max-width: 800px;
            margin: 50px auto;
        }

        /* Submit Feedback Box */
        .submit-feedback-box {
            padding: 30px;
            background-color: rgba(255, 255, 255, 0.9); /* Transparent background */
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
            margin-bottom: 30px;
        }

        /* Existing Feedback Box */
        .existing-feedback-box {
            padding: 30px;
            background-color: rgba(255, 255, 255, 0.9); /* Transparent background */
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        }

        /* Header styles */
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        /* Form styles */
        form {
            text-align: center;
        }

        /* Label styles */
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        /* Input styles */
        input[type="text"],
        input[type="email"],
        textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: none;
            border-radius: 5px;
            box-sizing: border-box;
            background-color: rgba(255, 255, 255, 0.8); /* Transparent background */
            border: 1px solid rgba(0, 0, 0, 0.2);
            transition: border-color 0.3s;
        }

        input[type="text"]:focus,
        input[type="email"]:focus,
        textarea:focus {
            outline: none;
            border-color: #007bff;
        }

        /* Submit button styles */
        button[type="submit"] {
            background-color: #007bff;
            color: white;
            padding: 14px 20px;
            margin-top: 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            transition: background-color 0.3s;
        }

        button[type="submit"]:hover {
            background-color: #0056b3;
        }

        /* Table styles */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
            color: #333;
        }

        /* Button container */
        .btn-container {
            display: flex;
            justify-content: space-between;
        }

        /* Update and Delete button styles */
        .btn-container button {
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px 15px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .btn-container button:hover {
            background-color: #0056b3;
        }

        /* Footer styles */
        .footer {
            background-color: rgba(0, 51, 102, 0.8); /* Transparent blue color */
            color: #FFF; /* Footer text color */
            text-align: center;
            padding: 10px 0; /* Footer padding */
            border-radius: 0 0 10px 10px; /* Rounded corners */
            position: absolute; /* Position absolute */
            bottom: 0; /* Stick to the bottom */
            width: 100%; /* Full width */
        }

    </style>
    <script>
        // JavaScript function to show popup message
        function showPopup(message) {
            alert(message);
            return false; // Prevent form submission
        }
    </script>
</head>
<body>
    <div class="navbar">
        <img src="logo.png" alt="Logo" class="logo">
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
    </div>
    <div class="container">
        <!-- Submit New Feedback Section -->
        <div class="submit-feedback-box">
            <h1 class="mt-5 mb-4">Submit New Feedback</h1>
            <form action="submitFeedback?action=create" method="post" onsubmit="return showPopup('Feedback has submitted successfully!')">
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" required>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="comment">Comment:</label>
                    <textarea id="comment" name="comment" rows="4" required></textarea>
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>

        <!-- Existing Feedback Section -->
        <div class="existing-feedback-box">
            <h1 class="mt-5 mb-4">Existing Feedback</h1>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Comment</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>No feedback available</td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="footer">
        &copy; 2024 Music Store. All rights reserved.
    </div>
</body>
</html>
