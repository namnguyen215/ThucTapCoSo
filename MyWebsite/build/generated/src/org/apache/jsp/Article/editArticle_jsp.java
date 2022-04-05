package org.apache.jsp.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>List Contact</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"/static/admin/css/main.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"dashboard\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <span class=\"left__icon\">\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                        </span>\n");
      out.write("                        <div class=\"left__content\">\n");
      out.write("                            <div class=\"left__logo\">LOGO</div>\n");
      out.write("                            <div class=\"left__profile\">\n");
      out.write("                                <div class=\"left__image\">\n");
      out.write("                                    ");
      out.write("\n");
      out.write("                                    <img src=\"/static/admin/assets/profile.jpg\" />\n");
      out.write("                                    <!--<img src=\"assets/profile.jpg\" alt=\"\">-->\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <p class=\"left__name\">Hatsune Miku</p>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"left__menu\">\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listBill\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-dashboard.svg\" alt=\"\">Dashboard\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <div class=\"left__title\">\n");
      out.write("                                        <a href=\"http://localhost:13708/listProduct\" class=\"left__title\">\n");
      out.write("                                            <img src=\"/static/admin/assets/icon-tag.svg\" alt=\"\">Sản Phẩm\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <div class=\"left__title\">\n");
      out.write("                                        <a href=\"http://localhost:13708/listCategory\" class=\"left__title\">\n");
      out.write("                                            <img src=\"/static/admin/assets/icon-edit.svg\" alt=\"\">Danh Mục SP\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listUser\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-users.svg\" alt=\"\">Khách Hàng\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listBill\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-book.svg\" alt=\"\">Đơn Đặt Hàng\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listLogo\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-settings.svg\" alt=\"\">Logo\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listArticle\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-pencil.svg\" alt=\"\">Article\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"http://localhost:13708/listContact\" class=\"left__title\">\n");
      out.write("                                        <img src=\"/static/admin/assets/icon-book.svg\" alt=\"\">Contact\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"left__menuItem\">\n");
      out.write("                                    <a href=\"\" class=\"left__title\"><img src=\"/static/admin/assets/icon-logout.svg\" alt=\"\">Đăng Xuất</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <div class=\"right__content\">\n");
      out.write("                            <div class=\"right__table\">\n");
      out.write("                                <!--<p class=\"right__tableTitle\">Danh sách sản phẩm</p>-->\n");
      out.write("                                <div class=\"right__tableWrapper\">\n");
      out.write("                                    <form method=\"POST\" action=\"editArticleAction\">\n");
      out.write("\n");
      out.write("                                        <h1 align=\"center\">Edit Article</h1>\n");
      out.write("                                        <table>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>ID: </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"id\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleUpdate.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"true\"></td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Name: </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"name\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleUpdate.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Image </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"image\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleUpdate.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"</td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Description </td>\n");
      out.write("                                                <td><input type=\"text\" name=\"des\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articleUpdate.des}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("\n");
      out.write("                                        <input type=\"submit\" value=\"Edit\">\n");
      out.write("                                        <input type=\"reset\" value=\"RESET\">\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"/static/admin/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
