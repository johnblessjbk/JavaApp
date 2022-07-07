package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>    \n");
      out.write("    <head>\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <script>\n");
      out.write("            //var fname=document.form.unam.value;\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("        }\n");
      out.write("        * {box-sizing: border-box}\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            font-size: 28px;\n");
      out.write("            padding: 15px;\n");
      out.write("            margin: 5px 0 22px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: none;\n");
      out.write("            background: #f1f1f1;\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("            font-size: 15px;\n");
      out.write("        }\n");
      out.write("        input[type=text]:focus, input[type=password]:focus {\n");
      out.write("            background-color: #ddd;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        hr {\n");
      out.write("            border: 1px solid #f1f1f1;\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            background-color: rgb(10, 119, 13);\n");
      out.write("            color: white;\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("            opacity: 0.9;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            opacity:1;\n");
      out.write("        }\n");
      out.write("        .cancel {\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            background-color: #ff3d2f;\n");
      out.write("        }\n");
      out.write("        .formContainer {\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("        .formContainer p{\n");
      out.write("            font-size: 28px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ControllerSignUp\" method=\"post\" name=\"form\">\n");
      out.write("            <div class=\"formContainer\">\n");
      out.write("                <hr>\n");
      out.write("                  <label for=\"name\"><b>Name</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required>\n");
      out.write("                  <label for=\"email\"><b>Email</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                <label for=\"phone\"><b>Phone</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Email\" name=\"phone\" required>\n");
      out.write("                <label for=\"password\"><b>Password</b></label>\n");
      out.write("                <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("               \n");
      out.write("                <div>\n");
      out.write("                    <button type=\"submit\" class=\"signup\">Sign Up</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
