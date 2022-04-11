package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baibao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/client/header.jsp");
    _jspx_dependants.add("/view/client/footer.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>archive-post</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/static/admin/css/styless.css\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\n");
      out.write("\t<script src=\"js/customerz.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<div class=\"header-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"top-info\">\n");
      out.write("            <div class=\"float-left d-md-block d-sm-none d-none\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fas fa-map-marker-alt\"></i>  30 Đường 2/9, Phường Bình Hiên, Quận Hải Châu, Đà Nẵng</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("                <ul>\n");
      out.write("\n");
      out.write("                    <li><a href=\"/view/client/login.jsp\">");

                        String name = (String) session.getAttribute("nameUser");
                        if (name == null) {
                            out.print("Đăng Nhập");
                        }
                            
      out.write("</a></li>\n");
      out.write("                    <li><a href=\"/view/client/signup.jsp\">");

                        if (name == null) {
                            out.print("Đăng Ký");
                        }
                            
      out.write("</a></li>\n");
      out.write("                    <li>");

                        if (name != null) {
                            out.print("Xin Chào " + name);
                        }
                            
      out.write("</li>\n");
      out.write("                    <li><a href=\"DangXuat\">");

                        if (name != null) {
                            out.print("Đăng Xuất");
                        }
                            
      out.write("</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<header class=\"header clearfix relative\">\n");
      out.write("    <div class=\"header__header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"menu-icon hidden-md hidden-lg\">\n");
      out.write("                    <div class=\"menu-open menu-default-open\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <h1 class=\"logo col-md-2 col-sm-2 col-xs-6 col-xs-push-3 col-sm-push-0\">\n");
      out.write("\n");
      out.write("                    <a href=\"index.html\" title=\"Mua Yến Sào\">\n");
      out.write("                        <img src=\"/static/admin/images/footer-logo.png\" class=\"img-responsive center-block\" width=\"160\" height=\"auto\">\n");
      out.write("                    </a>\n");
      out.write("                </h1>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <nav class=\"menu-primary visible-lg visible-md\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"main-menu-item current-menu-item current_page_item menu-item-home\"><a href=\"/view/client/trangchu.jsp\" class=\"\">Trang chủ</a></li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/gioithieu.jsp\">Giới thiệu</a></li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"http://localhost:39639/view/client/allSanpham\">Sản phẩm</a>\n");
      out.write("                                    <ul class=\"sub-menu\">\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Trang phục</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Giày dép</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Túi ví</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Phụ kiện</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"\" class=\"\">Bộ sưu tập</a>\n");
      out.write("                                    <ul class=\"sub-menu \">\n");
      out.write("                                        <li><a href=\"http://localhost:39639/view/client/listProductFour\">Summer 2020</a></li>\n");
      out.write("                                        <li><a>A Pretty Comback</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/lienhe.jsp\">Liên hệ</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"header__cart d-md-block d-lg-block d-none\">\n");
      out.write("                        <a href=\"/view/client/giohang.jsp\" title=\"Giỏ hàng \">\n");
      out.write("                            <i class=\"fa fa-cart-plus\"></i>\n");
      out.write("                            <span class=\"total-cart\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header__search hidden-xs hidden-sm\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <form class=\"search-form\" method=\"POST\" id=\"searchform\" action=\"searchProduct\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control\" name=\"key\" type=\"text\" value=\"Tìm kiếm\" >\n");
      out.write("                                    <div class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn buttom-search\" type=\"submit\">a</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\t<section class=\"archive-post\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h1 class=\"title-category\">Tất cả Tin tức</h1>\n");
      out.write("\t\t\t<div class=\"all-post\">\n");
      out.write("                           \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<section class=\"evo-newletter\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"txt-left\">\n");
      out.write("\t\t\t\t<p>Nhận thông tin khuyến mãi mới nhất từ Evo Milana</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"txt-mail\">\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"Nhập email\">\n");
      out.write("\t\t\t\t<button type=\"submit\">\n");
      out.write("\t\t\t\t\tĐăng ký\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\t");
      out.write("\n");
      out.write("<footer class=\"footer\"> \n");
      out.write("\t\t\t<div class=\"container\"> \n");
      out.write("\t\t\t\t<div class=\"ft-around\"> \n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo-wrapper\"> \n");
      out.write("\t\t\t\t\t\t\t<a href=\"/\" title=\"Evo Milana\"> \n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/static/admin/images/footer-logo.png\" class=\"img-fluid\">\n");
      out.write("\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t<div class=\"text-content\"> Evo Milana là một trong những công ty phân phối thời trang lớn nhất trong việc giới thiệu các thương hiệu thời trang cao cấp và sang trọng tại Việt Nam. </div> \n");
      out.write("\t\t\t\t\t\t<ul class=\"social\"> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"fb\"> \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/U-Fit-Shop-561797710650232/\" target=\"_blank\" aria-label=\"Facebook\" title=\"Theo dõi Evo Milana trên Facebook\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"25px\" height=\"25px\" viewBox=\"0 0 96.124 96.123\" style=\"enable-background:new 0 0 96.124 96.123;\" xml:space=\"preserve\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M72.089,0.02L59.624,0C45.62,0,36.57,9.285,36.57,23.656v10.907H24.037c-1.083,0-1.96,0.878-1.96,1.961v15.803 c0,1.083,0.878,1.96,1.96,1.96h12.533v39.876c0,1.083,0.877,1.96,1.96,1.96h16.352c1.083,0,1.96-0.878,1.96-1.96V54.287h14.654 c1.083,0,1.96-0.877,1.96-1.96l0.006-15.803c0-0.52-0.207-1.018-0.574-1.386c-0.367-0.368-0.867-0.575-1.387-0.575H56.842v-9.246 c0-4.444,1.059-6.7,6.848-6.7l8.397-0.003c1.082,0,1.959-0.878,1.959-1.96V1.98C74.046,0.899,73.17,0.022,72.089,0.02z\" data-original=\"#000000\" class=\"active-path\" data-old_color=\"#000000\" fill=\"#EBE7E7\"></path>\n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"tt\"> \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/baotrung304\" target=\"_blank\" aria-label=\"Twitter\" title=\"Theo dõi Evo Milana trên Twitter\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\" style=\"enable-background:new 0 0 512 512;\" xml:space=\"preserve\" width=\"25px\" height=\"25px\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M512,97.248c-19.04,8.352-39.328,13.888-60.48,16.576c21.76-12.992,38.368-33.408,46.176-58.016 c-20.288,12.096-42.688,20.64-66.56,25.408C411.872,60.704,384.416,48,354.464,48c-58.112,0-104.896,47.168-104.896,104.992 c0,8.32,0.704,16.32,2.432,23.936c-87.264-4.256-164.48-46.08-216.352-109.792c-9.056,15.712-14.368,33.696-14.368,53.056 c0,36.352,18.72,68.576,46.624,87.232c-16.864-0.32-33.408-5.216-47.424-12.928c0,0.32,0,0.736,0,1.152 c0,51.008,36.384,93.376,84.096,103.136c-8.544,2.336-17.856,3.456-27.52,3.456c-6.72,0-13.504-0.384-19.872-1.792 c13.6,41.568,52.192,72.128,98.08,73.12c-35.712,27.936-81.056,44.768-130.144,44.768c-8.608,0-16.864-0.384-25.12-1.44 C46.496,446.88,101.6,464,161.024,464c193.152,0,298.752-160,298.752-298.688c0-4.64-0.16-9.12-0.384-13.568 C480.224,136.96,497.728,118.496,512,97.248z\" data-original=\"#000000\" class=\"active-path\" data-old_color=\"#000000\" fill=\"#EBE7E7\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path> \n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"yt\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.youtube.com/channel/UCxSbzSivoHjPh2V1omoMqoQ\" target=\"_blank\" aria-label=\"Youtube\" title=\"Theo dõi Evo Milana trên Youtube\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\" style=\"enable-background:new 0 0 512 512;\" xml:space=\"preserve\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M490.24,113.92c-13.888-24.704-28.96-29.248-59.648-30.976C399.936,80.864,322.848,80,256.064,80 c-66.912,0-144.032,0.864-174.656,2.912c-30.624,1.76-45.728,6.272-59.744,31.008C7.36,138.592,0,181.088,0,255.904 C0,255.968,0,256,0,256c0,0.064,0,0.096,0,0.096v0.064c0,74.496,7.36,117.312,21.664,141.728 c14.016,24.704,29.088,29.184,59.712,31.264C112.032,430.944,189.152,432,256.064,432c66.784,0,143.872-1.056,174.56-2.816 c30.688-2.08,45.76-6.56,59.648-31.264C504.704,373.504,512,330.688,512,256.192c0,0,0-0.096,0-0.16c0,0,0-0.064,0-0.096 C512,181.088,504.704,138.592,490.24,113.92z M192,352V160l160,96L192,352z\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path>\n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"ins\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/trungncb/?hl=vi\" target=\"_blank\" aria-label=\"Instagram\" title=\"Theo dõi Evo Milana trên Instagram\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg viewBox=\"0 0 512 512\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"m75 512h362c41.355469 0 75-33.644531 75-75v-362c0-41.355469-33.644531-75-75-75h-362c-41.355469 0-75 33.644531-75 75v362c0 41.355469 33.644531 75 75 75zm-45-437c0-24.8125 20.1875-45 45-45h362c24.8125 0 45 20.1875 45 45v362c0 24.8125-20.1875 45-45 45h-362c-24.8125 0-45-20.1875-45-45zm0 0\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"m256 391c74.4375 0 135-60.5625 135-135s-60.5625-135-135-135-135 60.5625-135 135 60.5625 135 135 135zm0-240c57.898438 0 105 47.101562 105 105s-47.101562 105-105 105-105-47.101562-105-105 47.101562-105 105-105zm0 0\"></path>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"m406 151c24.8125 0 45-20.1875 45-45s-20.1875-45-45-45-45 20.1875-45 45 20.1875 45 45 45zm0-60c8.269531 0 15 6.730469 15 15s-6.730469 15-15 15-15-6.730469-15-15 6.730469-15 15-15zm0 0\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path>\n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-nav-menu widget\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">Về Evo Milana</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/\" title=\"Trang chủ\" rel=\"nofollow\">Trang chủ</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/gioi-thieu\" title=\"Giới thiệu\" rel=\"nofollow\">Giới thiệu</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/collections/all\" title=\"Sản phẩm\" rel=\"nofollow\">Sản phẩm</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/blogs/all\" title=\"Tin tức\" rel=\"nofollow\">Tin tức</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Bộ sưu tập\" rel=\"nofollow\">Bộ sưu tập</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Thương hiệu nổi bật\" rel=\"nofollow\">Thương hiệu nổi bật</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/lien-he\" title=\"Liên hệ\" rel=\"nofollow\">Liên hệ</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-nav-menu widget\"> \n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">Hỗ trợ khách hàng</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/\" title=\"Trang chủ\" rel=\"nofollow\">Trang chủ</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/gioi-thieu\" title=\"Giới thiệu\" rel=\"nofollow\">Giới thiệu</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/collections/all\" title=\"Sản phẩm\" rel=\"nofollow\">Sản phẩm</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/blogs/all\" title=\"Tin tức\" rel=\"nofollow\">Tin tức</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Bộ sưu tập\" rel=\"nofollow\">Bộ sưu tập</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Thương hiệu nổi bật\" rel=\"nofollow\">Thương hiệu nổi bật</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/lien-he\" title=\"Liên hệ\" rel=\"nofollow\">Liên hệ</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pgs-contact-widget widget\"> \n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">Liên hệ với chúng tôi</h4> <div class=\"footer-address\"> \n");
      out.write("\t\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>Địa chỉ:</span> 30 Đường 2/9, Phường Bình Hiên, Quận Hải Châu, Đà Nẵng</li> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>Email:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"mailto:evoteamthemes@gmail.com\" title=\"evoteamthemes@gmail.com\">evoteamthemes@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>Điện thoại:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"tel:0123456789\" title=\"0123456789\">0123 456 789</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer-store\"> <a href=\"/he-thong-cua-hang\" title=\"Hệ thống 10 showroom\">Hệ thống 10 showroom</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"business_registration\"> \n");
      out.write("\t\t\t\t\t<p>Công ty cổ phần Evo Milana - MST: 0000000000 do sở Kế Hoạch và Đầu Tư Đà Nẵng cấp ngày 00/00/0000</p> \n");
      out.write("\t\t\t\t\t<p>Địa chỉ: 30 Đường 2/9, Phường Bình Hiên, Quận Hải Châu, Đà Nẵng</p> \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
