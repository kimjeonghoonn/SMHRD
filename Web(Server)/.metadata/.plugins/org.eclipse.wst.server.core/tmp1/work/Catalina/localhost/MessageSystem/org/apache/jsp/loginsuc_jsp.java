/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-24 06:25:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginsuc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/김정훈/Web(Server)/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/project2_h5/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1651644703037L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("<script src = \"jquery-3.6.0.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: 'IBM';\r\n");
      out.write("  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/IBMPlexSansKR-SemiBold.woff') format('woff');\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*얇은 ibm*/\r\n");
      out.write("@font-face {\r\n");
      out.write("    font-family: 'IBMs';\r\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/IBMPlexSansKR-Light.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: 'jalnan';\r\n");
      out.write("  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_four@1.2/JalnanOTF00.woff') format('woff');\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: 'paybooc';\r\n");
      out.write("  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-07@1.0/paybooc-Bold.woff') format('woff');\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: 'OTW';\r\n");
      out.write("  src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2110@1.0/OTWelcomeBA.woff2') format('woff2');\r\n");
      out.write("  font-weight: normal;\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    text-align: center;\">\r\n");
      out.write("       <section style=\"border-radius:25px; border:2px solid #eaeaea; padding:50px;\">\r\n");
      out.write("  \r\n");
      out.write("        <div>\r\n");
      out.write("         <h1 style=\"font-family:ibm; font-size:40px; color:#ffc107;\">로그인 성공!</h1>  \r\n");
      out.write("         </div>\r\n");
      out.write("       \r\n");
      out.write("        <div style=\"font-size:20px; margin-bottom:30px; font-family:ibms;\" >\r\n");
      out.write("         <span>바나다에 어서오세요.</span>   \r\n");
      out.write("     	</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("            <button onclick=\"location.href='main.jsp'\" \r\n");
      out.write("            style=\"cursor:pointer; font-family:ibm; width: 200px; height: 50px; border-radius:25px; font-size:20px; border:none; background:#ffc107; color:white; margin-bottom:15px;\">메인으로 가기</button>\r\n");
      out.write("        </div>\r\n");
      out.write("     \r\n");
      out.write("      \r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
