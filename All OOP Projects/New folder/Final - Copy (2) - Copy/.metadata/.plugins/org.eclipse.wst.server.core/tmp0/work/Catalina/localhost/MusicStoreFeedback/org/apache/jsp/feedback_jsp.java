/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-13 03:02:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Music Store Feedback</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Reset CSS */\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Body styles */\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-image: url('background.jpg'); /* Replace with your background image */\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-attachment: fixed;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            line-height: 1.6;\r\n");
      out.write("            min-height: 100vh; /* Set minimum height to 100% of viewport height */\r\n");
      out.write("            position: relative; /* Required for footer positioning */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Navigation header styles */\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background-color: rgba(0, 51, 102, 0.8); /* Transparent blue color */\r\n");
      out.write("            color: #FFF; /* Navbar text color */\r\n");
      out.write("            padding: 10px 0; /* Navbar padding */\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            border-radius: 0 0 10px 10px; /* Rounded corners */\r\n");
      out.write("            position: relative; /* Position relative for absolute logo */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Navigation links */\r\n");
      out.write("        .navbar a {\r\n");
      out.write("            color: #FFF; /* Navbar link text color */\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            margin: 0 20px; /* Navbar link margin */\r\n");
      out.write("            font-size: 18px; /* Navbar link font size */\r\n");
      out.write("            transition: color 0.3s; /* Smooth transition for link color */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Change link color on hover */\r\n");
      out.write("        .navbar a:hover {\r\n");
      out.write("            color: #FFC300; /* Hover link color */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Logo styles */\r\n");
      out.write("        .logo {\r\n");
      out.write("            width: 80px; /* Adjust the width of your logo */\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 50%;\r\n");
      out.write("            left: 20px;\r\n");
      out.write("            transform: translateY(-50%); /* Center vertically */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Container styles */\r\n");
      out.write("        .container {\r\n");
      out.write("            max-width: 800px;\r\n");
      out.write("            margin: 50px auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Submit Feedback Box */\r\n");
      out.write("        .submit-feedback-box {\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.9); /* Transparent background */\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Existing Feedback Box */\r\n");
      out.write("        .existing-feedback-box {\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.9); /* Transparent background */\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Header styles */\r\n");
      out.write("        h1 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Form styles */\r\n");
      out.write("        form {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Label styles */\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin-bottom: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Input styles */\r\n");
      out.write("        input[type=\"text\"],\r\n");
      out.write("        input[type=\"email\"],\r\n");
      out.write("        textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8); /* Transparent background */\r\n");
      out.write("            border: 1px solid rgba(0, 0, 0, 0.2);\r\n");
      out.write("            transition: border-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"]:focus,\r\n");
      out.write("        input[type=\"email\"]:focus,\r\n");
      out.write("        textarea:focus {\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border-color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Submit button styles */\r\n");
      out.write("        button[type=\"submit\"] {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 14px 20px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        button[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Table styles */\r\n");
      out.write("        table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border-bottom: 1px solid #ddd;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Button container */\r\n");
      out.write("        .btn-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Update and Delete button styles */\r\n");
      out.write("        .btn-container button {\r\n");
      out.write("            background-color: #007bff;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            padding: 10px 15px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-container button:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Footer styles */\r\n");
      out.write("        .footer {\r\n");
      out.write("            background-color: rgba(0, 51, 102, 0.8); /* Transparent blue color */\r\n");
      out.write("            color: #FFF; /* Footer text color */\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 10px 0; /* Footer padding */\r\n");
      out.write("            border-radius: 0 0 10px 10px; /* Rounded corners */\r\n");
      out.write("            position: absolute; /* Position absolute */\r\n");
      out.write("            bottom: 0; /* Stick to the bottom */\r\n");
      out.write("            width: 100%; /* Full width */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        // JavaScript function to show popup message\r\n");
      out.write("        function showPopup(message) {\r\n");
      out.write("            alert(message);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        <img src=\"logo.png\" alt=\"Logo\" class=\"logo\">\r\n");
      out.write("        <a href=\"#\">Home</a>\r\n");
      out.write("        <a href=\"#\">About</a>\r\n");
      out.write("        <a href=\"#\">Contact</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <!-- Submit New Feedback Section -->\r\n");
      out.write("        <div class=\"submit-feedback-box\">\r\n");
      out.write("            <h1 class=\"mt-5 mb-4\">Submit New Feedback</h1>\r\n");
      out.write("            <form action=\"submitFeedback?action=create\" method=\"post\" onsubmit=\"showPopup('Feedback has submitted successfully!')\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"name\">Name:</label>\r\n");
      out.write("                    <input type=\"text\" id=\"name\" name=\"name\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"email\">Email:</label>\r\n");
      out.write("                    <input type=\"email\" id=\"email\" name=\"email\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"comment\">Comment:</label>\r\n");
      out.write("                    <textarea id=\"comment\" name=\"comment\" rows=\"4\" required></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\">Submit</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Existing Feedback Section -->\r\n");
      out.write("        <div class=\"existing-feedback-box\">\r\n");
      out.write("            <h1 class=\"mt-5 mb-4\">Existing Feedback</h1>\r\n");
      out.write("            <table>\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>ID</th>\r\n");
      out.write("                        <th>Name</th>\r\n");
      out.write("                        <th>Email</th>\r\n");
      out.write("                        <th>Comment</th>\r\n");
      out.write("                        <th>Action</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>No feedback available</td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                        <td></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        &copy; 2024 Music Store. All rights reserved.\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
