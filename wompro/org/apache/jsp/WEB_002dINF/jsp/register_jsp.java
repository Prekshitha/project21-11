/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2019-11-21 09:44:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--   <!DOCTYPE html>  -->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>Sign Up Form</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/register.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/reg.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form action=\"register.do\" method=\"POST\" onsubmit=\"return valids()\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h1>Sign Up</h1>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend>Your basic info</legend>\r\n");
      out.write("\t\t  \t\r\n");
      out.write("\t\t\t<label for=\"name\">Name:</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"name\" name=\"name\" ></input>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<label for=\"username\">User Name:</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"username\" name=\"username\" ></input>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"msg\">\r\n");
      out.write(" \t \t\t<p id=\"letter\" class=\"invalid\"></p>\r\n");
      out.write("\t\t\t<p id=\"capital\" class=\"invalid\"></p>\r\n");
      out.write("  \t\t\t<p id=\"number\" class=\"invalid\"></p>\r\n");
      out.write("  \t\t\t<p id=\"length\" class=\"invalid\"></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"password\">Password:</label>\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"password\" name=\"password\" onkeyup='check();'>\r\n");
      out.write("\t\t\t\t <h4>Password must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters</h4>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t\t<label for=\"confirm_password\">Confirm Password:\r\n");
      out.write("\t\t\t<input type=\"password\" id=\"confirm_password\" name=\"confirm_password\" onkeyup='check();'   >\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<span id='message'></span>\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<label for=\"date_of_birth\">Date Of Birth:</label>  \r\n");
      out.write("\t\t\t<input type=\"date\" name=\"date_of_birth\" id=\"date_of_birth\" ></input>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"email_id\">Email Id:</label>\r\n");
      out.write("\t\t\t<input type=\"email\" id=\"email_id\" name=\"email_id\" ></input>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t       \r\n");
      out.write("\t\t\t<label for=\"contact_number\">Contact Number:</label>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"contact_number\" name=\"contact_number\" ></input>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<label for=\"role\">Role:</label>\r\n");
      out.write("\t\t\t<select name=\"role\">\r\n");
      out.write("\t\t\t<option value=\"NGO\">NGO</option>\r\n");
      out.write("\t\t\t<option value=\"workingwomen\">Working Women</option>\r\n");
      out.write("\t\t\t<option value=\"admin\">Admin</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t\t<button type=\"submit\" id=\"login\" name=\"login\">Sign Up</button>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
