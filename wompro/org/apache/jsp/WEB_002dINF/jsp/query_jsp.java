/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2019-11-21 08:59:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class query_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/one.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/register.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/reg.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"query.do\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Name:</th>\r\n");
      out.write("<td><input type=\"text\" name=\"name\" type=\"name\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td><form:label path=\"image\">Upload Profile Image</form:label></td>\r\n");
      out.write("<td><input type=\"file\" name=\"file\" id=\"image\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>AdharNo:</th>\r\n");
      out.write("<td><input type=\"text\" name=\"ano\" type=\"ano\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Address</th>\r\n");
      out.write("<td><textarea rows=\"4\" cols=\"50\" name=\"add\" required></textarea></td>\r\n");
      out.write("<td><input type=\"file\" name=\"file\" id=\"address_fname\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>DOB:</th>\r\n");
      out.write("<td><input type=\"date\" name=\"date\" type=\"date\" required></td>\r\n");
      out.write("<td><input type=\"file\" name=\"file\" id=\"dob_fname\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Caste:</th>\r\n");
      out.write("<td>\r\n");
      out.write("<select name=\"caste\">\r\n");
      out.write("  <option value=\"OBC\">OBC</option>\r\n");
      out.write("  <option value=\"SC/ST\">SC/ST</option>\r\n");
      out.write("  <option value=\"Others\">Others</option>\r\n");
      out.write(" \r\n");
      out.write("</select></td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Contact:</th>\r\n");
      out.write("<td><input type=\"text\" name=\"contact\" type=\"contact\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Physically Challenged:</th>\r\n");
      out.write("<td><input type=\"radio\" name=\"phychal\" value=\"yes\"> yes<br>\r\n");
      out.write("<input type=\"radio\" name=\"phychal\" value=\"no\"> no<br></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>NGO:</th>\r\n");
      out.write("<td><input type=\"radio\" name=\"ngo\" value=\"ngo1\"> ngo1<br>\r\n");
      out.write("<select name=\"ngo\">\r\n");
      out.write("  <option value=\"Bangalore\">Bangalore</option>\r\n");
      out.write("  <option value=\"Mumbai\">Mumbai</option>\r\n");
      out.write("  <option value=\"Chennai\">Chennai</option>\r\n");
      out.write("  <option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write(" \r\n");
      out.write("</select></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<td><input type=\"radio\" name=\"ngo\" value=\"ngo2\"> ngo2<br>\r\n");
      out.write("<select name=\"ngo\">\r\n");
      out.write("  <option value=\"Kolkata\">Kolkata</option>\r\n");
      out.write("  <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\r\n");
      out.write("  <option value=\"Bihar\">Bihar</option>\r\n");
      out.write("  <option value=\"Orissa\">Orissa</option>\r\n");
      out.write("</select></td>\r\n");
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Working Period in  months:</th>\r\n");
      out.write("<td>\r\n");
      out.write("<select name=\"wp\">\r\n");
      out.write("  <option value=\"1\">1</option>\r\n");
      out.write("  <option value=\"2\">2</option>\r\n");
      out.write("  <option value=\"3\">3</option>\r\n");
      out.write("  <option value=\"4\">4</option>\r\n");
      out.write("  <option value=\"5\">5</option>\r\n");
      out.write("  <option value=\"6\">6</option>\r\n");
      out.write("  <option value=\"7\">7</option>\r\n");
      out.write("  <option value=\"8\">8</option>\r\n");
      out.write("  <option value=\"9\">9</option>\r\n");
      out.write("  <option value=\"10\">10</option>\r\n");
      out.write("  <option value=\"11\">11</option>\r\n");
      out.write("  <option value=\"12\">12</option>\r\n");
      out.write("</select>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Gender of child:</th>\r\n");
      out.write("<td><input type=\"radio\" name=\"gender\" value=\"male\"> male<br>\r\n");
      out.write("<input type=\"radio\" name=\"gender\" value=\"female\"> female<br>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>DOB of child:</th>\r\n");
      out.write("<td><input type=\"date\" name=\"date1\" type=\"date1\" required></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th>Gross Income:</th>\r\n");
      out.write("<td><input type=\"text\" name=\"gi\" type=\"gi\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr><td colspan=\"2\"><input type=\"submit\" value=\"submit\"></td><tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
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
