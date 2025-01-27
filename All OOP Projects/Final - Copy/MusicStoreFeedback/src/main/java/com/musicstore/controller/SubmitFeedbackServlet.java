package com.musicstore.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.musicstore.model.Feedback;
import com.musicstore.util.DBUtil;

@WebServlet("/submitFeedback")
public class SubmitFeedbackServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "create":
                    createFeedback(request, response);
                    break;
                case "read":
                    readFeedback(request, response);
                    break;
                case "update":
                    updateFeedback(request, response);
                    break;
                case "delete":
                    deleteFeedback(request, response);
                    break;
                default:
                    response.sendRedirect("feedback.jsp");
            }
        } else {
            response.sendRedirect("feedback.jsp");
        }
    }

    // Create Feedback
    private void createFeedback(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");

        Feedback feedback = new Feedback();
        feedback.setName(name);
        feedback.setEmail(email);
        feedback.setComment(comment);

        // Save feedback to the database
        saveFeedbackToDB(feedback);

        response.sendRedirect("feedback.jsp");
    }

    // Read Feedback
    private void readFeedback(HttpServletRequest request, HttpServletResponse response) {
        // Read feedback from the database
    }

    // Update Feedback
    private void updateFeedback(HttpServletRequest request, HttpServletResponse response) {
        // Update feedback in the database
    }

    // Delete Feedback
    private void deleteFeedback(HttpServletRequest request, HttpServletResponse response) {
        // Delete feedback from the database
    }

    private void saveFeedbackToDB(Feedback feedback) {
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                try (PreparedStatement ps = conn.prepareStatement("INSERT INTO feedback (name, email, comment) VALUES (?, ?, ?)")) {
                    ps.setString(1, feedback.getName());
                    ps.setString(2, feedback.getEmail());
                    ps.setString(3, feedback.getComment());
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Failed to establish a database connection.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
