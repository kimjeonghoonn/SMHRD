/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-05-20 08:05:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class people3travel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/people.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- nav -->\r\n");
      out.write("    <div class = \"nav\">\r\n");
      out.write("        <div class = \"logo\">\r\n");
      out.write("          <a href =\"main.jsp\">바나다</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class =\"nav_but\">\r\n");
      out.write("            <a href =\"object.jsp\">소분해요</a>\r\n");
      out.write("            <a href =\"peoplecategory.jsp\">재능나눔</a>\r\n");
      out.write("            <a href =\"post.jsp\">자유게시판</a>\r\n");
      out.write("            <a href =\"\" style =\"margin-right:200px\">로그아웃</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <section class=\"category\">\r\n");
      out.write("      <div id=\"cateimg\">\r\n");
      out.write("        <a href=\"people1sports.jsp\">\r\n");
      out.write("        <img title=\"스포츠\" src =\"assets/category/2.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people2game.jsp\">\r\n");
      out.write("        <img title=\"게임/오락\" src =\"assets/category/3.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"people3travel.jsp\">\r\n");
      out.write("        <img title=\"아웃도어/여행\" src =\"assets/category/4.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"people4read.jsp\">\r\n");
      out.write("        <img title=\"인문학/책/글\" src =\"assets/category/5.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people5culture.jsp\">\r\n");
      out.write("        <img title=\"문화/공연/축제\" src =\"assets/category/6.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people6make.jsp\">\r\n");
      out.write("        <img title=\"공예/만들기\" src =\"assets/category/7.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people7music.jsp\">\r\n");
      out.write("        <img title=\"음악/악기\" src =\"assets/category/8.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people8bongsa.jsp\">\r\n");
      out.write("        <img title=\"봉사활동\" src =\"assets/category/9.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people9inmec.jsp\">\r\n");
      out.write("        <img title=\"사교/인맥\" src =\"assets/category/10.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people10car.jsp\">\r\n");
      out.write("        <img title=\"차/오토바이\" src =\"assets/category/11.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people11picture.jsp\">\r\n");
      out.write("        <img title=\"사진/영상\" src =\"assets/category/12.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people12cook.jsp\">\r\n");
      out.write("        <img title=\"요리/베이킹\" src =\"assets/category/13.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people13animal.jsp\">\r\n");
      out.write("        <img title=\"반려동물\" src =\"assets/category/14.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people14language.jsp\">\r\n");
      out.write("        <img title=\"외국/언어\" src =\"assets/category/17.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <a href=\"people15shopping.jsp\">\r\n");
      out.write("        <img title=\"쇼핑\" src =\"assets/category/15.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- maps -->\r\n");
      out.write("    <section class =\"header\">\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("            <img src=\"\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"Contents-Box\" style = \"padding : 0px 200px 50px 200px\">\r\n");
      out.write("        <!--목록-->\r\n");
      out.write("        <div class=\"List-Box box-height\">\r\n");
      out.write("          <ul >\r\n");
      out.write("            <li>\r\n");
      out.write("              <span>목록</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <span>닉네임</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <span>제목</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <span>작성일</span>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("          <!--{{#each contents}}-->\r\n");
      out.write("          <a href=\"#\" class=\"List-1 flex\">\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                01\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                facere\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                오늘 날씨가 너무 좋네요~\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                2021.09.27 15 : 00\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <!--2-->\r\n");
      out.write("          <a href=\"#\" class=\"List-1 flex\">\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                02\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                Lorem\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                와 오늘 하늘마당 사람 실화냐...\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("              <span>\r\n");
      out.write("                2021.09.27 15 : 00\r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <!--{{/each}}-->\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"write\">\r\n");
      out.write("            <a href=\"peoplepostwrite123.jsp\">글쓰기</a>\r\n");
      out.write("        </section>\r\n");
      out.write("      </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    <!-- footer -->\r\n");
      out.write("    <footer class = \"footer\">\r\n");
      out.write("        <ul class = \"list\" style=\"width:max-content\">\r\n");
      out.write("            <li class = \"list-object\">\r\n");
      out.write("                <a href = \"#\">About</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class = \"list-object\">⋅</li>\r\n");
      out.write("            <li class = \"list-object\">\r\n");
      out.write("                <a href = \"#\">Contact</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class = \"list-object\">⋅</li>\r\n");
      out.write("            <li class = \"list-object\">\r\n");
      out.write("                <a href = \"#\">Terms of Use</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class = \"list-object\">⋅</li>\r\n");
      out.write("            <li class = \"list-object\">\r\n");
      out.write("                <a href = \"#\">Privacy Policy</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <br>\r\n");
      out.write("        <p>© Your Website 2022. Made by H5</p>\r\n");
      out.write("    </footer>\r\n");
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
