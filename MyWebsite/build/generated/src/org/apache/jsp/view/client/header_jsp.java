package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"top-info\">\n");
      out.write("\t\t\t\t<div class=\"float-left d-md-block d-sm-none d-none\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><i class=\"fas fa-map-marker-alt\"></i>  30 Đường 2/9, Phường Bình Hiên, Quận Hải Châu, Đà Nẵng</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/view/client/login.jsp\">Đăng nhập</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/view/client/signup.jsp\">Đăng ký</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<header class=\"header clearfix relative\">\n");
      out.write("\t\t<div class=\"header__header\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"menu-icon hidden-md hidden-lg\">\n");
      out.write("\t\t\t\t\t\t<div class=\"menu-open menu-default-open\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bars\"></i>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<h1 class=\"logo col-md-2 col-sm-2 col-xs-6 col-xs-push-3 col-sm-push-0\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\" title=\"Mua Yến Sào\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/admin/images/footer-logo.png\" class=\"img-responsive center-block\" width=\"160\" height=\"auto\">\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"menu-primary visible-lg visible-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"main-menu-item current-menu-item current_page_item menu-item-home\"><a href=\"/view/client/trangchu.jsp\" class=\"\">Trang chủ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/gioithieu.jsp\">Giới thiệu</a></li>\n");
      out.write("                                                                        <li class=\"main-menu-item menu-item-has-children\"><a href=\"http://localhost:39639/allSanpham\">Sản phẩm</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Trang phục</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Giày dép</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Túi ví</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Phụ kiện</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"main-menu-item menu-item-has-children\"><a href=\"\" class=\"\">Bộ sưu tập</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"sub-menu \">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"http://localhost:39639/listProductFour\">Summer 2020</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a>A Pretty Comback</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/lienhe.jsp\">Liên hệ</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</nav>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"header__cart d-md-block d-lg-block d-none\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/view/client/giohang.jsp\" title=\"Giỏ hàng \">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-cart-plus\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"total-cart\">0</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"header__search hidden-xs hidden-sm\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<form class=\"search-form\" method=\"POST\" id=\"searchform\" action=\"searchProduct\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" name=\"key\" type=\"text\" value=\"Tìm kiếm\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn buttom-search\" type=\"submit\">a</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
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
