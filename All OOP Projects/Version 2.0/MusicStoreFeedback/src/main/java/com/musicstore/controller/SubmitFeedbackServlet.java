package com.musicstore.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        readFeedback(request, response);
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

        // Redirect back to feedback.jsp
        response.sendRedirect("submitFeedback?action=read");
    }

    // Read Feedback
    private void readFeedback(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Feedback> feedbackList = new ArrayList<>();
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM feedback")) {
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String comment = rs.getString("comment");
                        Feedback feedback = new Feedback(id, name, email, comment);
                        feedbackList.add(feedback);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle the SQL exception here, either by showing an error message to the user or redirecting to an error page
                }
            } else {
                System.out.println("Failed to establish a database connection.");
                // Handle the case where connection is null, show an error message or redirect
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the SQL exception here, either by showing an error message to the user or redirecting to an error page
        }
        request.setAttribute("feedbackList", feedbackList);
        request.getRequestDispatcher("feedback.jsp").forward(request, response);
    }

    // Update Feedback
    private void updateFeedback(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");

        Feedback feedback = new Feedback(id, name, email, comment);

        // Update feedback in the database
        updateFeedbackInDB(feedback);

        // Redirect back to feedback.jsp
        response.sendRedirect("submitFeedback?action=read");
    }

    // Delete Feedback
    private void deleteFeedback(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        // Delete feedback from the database
        deleteFeedbackFromDB(id);

        // Redirect back to feedback.jsp
        response.sendRedirect("submitFeedback?action=read");
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

    private void updateFeedbackInDB(Feedback feedback) {
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                try (PreparedStatement ps = conn.prepareStatement("UPDATE feedback SET name=?, email=?, comment=? WHERE id=?")) {
                    ps.setString(1, feedback.getName());
                    ps.setString(2, feedback.getEmail());
                    ps.setString(3, feedback.getComment());
                    ps.setInt(4, feedback.getId());
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

    private void deleteFeedbackFromDB(int id) {
        try (Connection conn = DBUtil.getConnection()) {
            if (conn != null) {
                try (PreparedStatement ps = conn.prepareStatement("DELETE FROM feedback WHERE id=?")) {
                    ps.setInt(1, id);
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
