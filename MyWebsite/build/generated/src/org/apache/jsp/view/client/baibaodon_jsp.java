package org.apache.jsp.view.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class baibaodon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Single-post</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/static/admin/css/styless.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\n");
      out.write("        <script src=\"js/customerz.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"top-info\">\n");
      out.write("            <div class=\"float-left d-md-block d-sm-none d-none\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fas fa-map-marker-alt\"></i>  30 ???????ng 2/9, Ph?????ng B??nh Hi??n, Qu???n H???i Ch??u, ???? N???ng</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("                <ul>\n");
      out.write("\n");
      out.write("                    <li><a href=\"/view/client/login.jsp\">");

                        String name = (String) session.getAttribute("nameUser");
                        if (name == null) {
                            out.print("????ng Nh???p");
                        }
                            
      out.write("</a></li>\n");
      out.write("                    <li><a href=\"/view/client/signup.jsp\">");

                        if (name == null) {
                            out.print("????ng K??");
                        }
                            
      out.write("</a></li>\n");
      out.write("                    <li>");

                        if (name != null) {
                            out.print("Xin Ch??o " + name);
                        }
                            
      out.write("</li>\n");
      out.write("                    <li><a href=\"DangXuat\">");

                        if (name != null) {
                            out.print("????ng Xu???t");
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
      out.write("                    <a href=\"index.html\" title=\"Mua Y???n S??o\">\n");
      out.write("                        <img src=\"/static/admin/images/footer-logo.png\" class=\"img-responsive center-block\" width=\"160\" height=\"auto\">\n");
      out.write("                    </a>\n");
      out.write("                </h1>\n");
      out.write("                <div class=\"col-xs-12 col-sm-6 col-md-6\">\n");
      out.write("                    <div class=\"menu\">\n");
      out.write("                        <nav class=\"menu-primary visible-lg visible-md\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li class=\"main-menu-item current-menu-item current_page_item menu-item-home\"><a href=\"/view/client/trangchu.jsp\" class=\"\">Trang ch???</a></li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/gioithieu.jsp\">Gi???i thi???u</a></li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"http://localhost:39639/view/client/allSanpham\">S???n ph???m</a>\n");
      out.write("                                    <ul class=\"sub-menu\">\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Trang ph???c</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Gi??y d??p</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">T??i v??</a></li>\n");
      out.write("                                        <li class=\"sub-menu-item\"><a class=\"menu-link sub-menu-link\">Ph??? ki???n</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"\" class=\"\">B??? s??u t???p</a>\n");
      out.write("                                    <ul class=\"sub-menu \">\n");
      out.write("                                        <li><a href=\"http://localhost:39639/view/client/listProductFour\">Summer 2020</a></li>\n");
      out.write("                                        <li><a>A Pretty Comback</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"main-menu-item menu-item-has-children\"><a href=\"/view/client/lienhe.jsp\">Li??n h???</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"header__cart d-md-block d-lg-block d-none\">\n");
      out.write("                        <a href=\"/view/client/giohang.jsp\" title=\"Gi??? h??ng \">\n");
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
      out.write("                                    <input class=\"form-control\" name=\"key\" type=\"text\" value=\"T??m ki???m\" >\n");
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
      out.write("        <section class=\"single-post\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"single-left\">\n");
      out.write("                        \n");
      out.write("                            <h1 class=\"title-head\">12 set ????? ?????i th?????ng c???a sao H??n r?? l?? ????n gi???n nh??ng v???n x???n ?????p v?? h??t m???t h???t s???c</h1>\n");
      out.write("                            <div class=\"content-post\">\n");
      out.write("                                <p>Nh??n chung, style ?????i th?????ng c???a c??c sao n??? x??? H??n kh??ng h??? c???u k???, l??m qu??; h??? th?????ng l??n ????? v???i nh???ng items c?? b???n nh??ng v???n ra ???????c nh???ng set trang ph???c ???????c ????nh gi?? cao ??? v??? s??nh ??i???u. V?? v?? l??? ????, b???n s??? kh??ng th??? b??? qua lo???t g???i ?? di???n ????? gi???n ????n, d??? m???c v?? ch???c ch???n s??? ?????p sau ????y c???a c??c m??? nh??n Kbiz; t???t c??? s??? gi??p n??ng style c???a b???n l??n m???t t???m cao m???i.</p>\n");
      out.write("                                <p><img src=\"/static/admin/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${abc.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ></p>\n");
      out.write("                                <p>??o d???t kim l?? m???t item sang  h??a phong c??ch r???t hi???u nghi???m, b???ng ch???ng l?? Joy ch??? di???n ??o tr???ng mix v???i qu???n ??en v?? k???t l???i b???ng ????i sneakers tr???ng tinh t????m, v??? ngo??i ???? b???t l??n v??? s??nh ??i???u</p>\n");
      out.write("                            </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"single-right\">\n");
      out.write("                        <div class=\"post-related\">\n");
      out.write("                            <h2 class=\"h2-title\">B??i vi???t li??n quan</h2>\n");
      out.write("                            <div class=\"item-news-index\" >\n");
      out.write("                                <div class=\"item-news-image\">\n");
      out.write("                                    <a href=\"\" tabindex=\"-1\"> \n");
      out.write("                                        <img src=\"images/blog2.jpg\" class=\"img-fluid\">\n");
      out.write("                                    </a> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item-news-content\">\n");
      out.write("                                    <h4> \n");
      out.write("                                        <a href=\"\">6 ki???u t??c \"hot hit\" ??i ????u c??ng g???p nh??? c??ng c???a Jennie: T???p t??nh di???n theo th?? b???n xinh x???o, trendy h??n l?? c??i ch???c</a> \n");
      out.write("                                    </h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-news-index\" >\n");
      out.write("                                <div class=\"item-news-image\">\n");
      out.write("                                    <a href=\"\" tabindex=\"-1\"> \n");
      out.write("                                        <img src=\"images/blog2.jpg\" class=\"img-fluid\">\n");
      out.write("                                    </a> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item-news-content\">\n");
      out.write("                                    <h4> \n");
      out.write("                                        <a href=\"\">6 ki???u t??c \"hot hit\" ??i ????u c??ng g???p nh??? c??ng c???a Jennie: T???p t??nh di???n theo th?? b???n xinh x???o, trendy h??n l?? c??i ch???c</a> \n");
      out.write("                                    </h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-news-index\" >\n");
      out.write("                                <div class=\"item-news-image\">\n");
      out.write("                                    <a href=\"\" tabindex=\"-1\"> \n");
      out.write("                                        <img src=\"images/blog2.jpg\" class=\"img-fluid\">\n");
      out.write("                                    </a> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item-news-content\">\n");
      out.write("                                    <h4> \n");
      out.write("                                        <a href=\"\">6 ki???u t??c \"hot hit\" ??i ????u c??ng g???p nh??? c??ng c???a Jennie: T???p t??nh di???n theo th?? b???n xinh x???o, trendy h??n l?? c??i ch???c</a> \n");
      out.write("                                    </h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item-news-index\" >\n");
      out.write("                                <div class=\"item-news-image\">\n");
      out.write("                                    <a href=\"\" tabindex=\"-1\"> \n");
      out.write("                                        <img src=\"images/blog2.jpg\" class=\"img-fluid\">\n");
      out.write("                                    </a> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item-news-content\">\n");
      out.write("                                    <h4> \n");
      out.write("                                        <a href=\"\">6 ki???u t??c \"hot hit\" ??i ????u c??ng g???p nh??? c??ng c???a Jennie: T???p t??nh di???n theo th?? b???n xinh x???o, trendy h??n l?? c??i ch???c</a> \n");
      out.write("                                    </h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"evo-newletter\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"txt-left\">\n");
      out.write("                    <p>Nh???n th??ng tin khuy???n m??i m???i nh???t t??? Evo Milana</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt-mail\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Nh???p email\">\n");
      out.write("                    <button type=\"submit\">\n");
      out.write("                        ????ng k??\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        ");
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
      out.write("\t\t\t\t\t\t<div class=\"text-content\"> Evo Milana l?? m???t trong nh???ng c??ng ty ph??n ph???i th???i trang l???n nh???t trong vi???c gi???i thi???u c??c th????ng hi???u th???i trang cao c???p v?? sang tr???ng t???i Vi???t Nam. </div> \n");
      out.write("\t\t\t\t\t\t<ul class=\"social\"> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"fb\"> \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.facebook.com/U-Fit-Shop-561797710650232/\" target=\"_blank\" aria-label=\"Facebook\" title=\"Theo d??i Evo Milana tr??n Facebook\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"25px\" height=\"25px\" viewBox=\"0 0 96.124 96.123\" style=\"enable-background:new 0 0 96.124 96.123;\" xml:space=\"preserve\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M72.089,0.02L59.624,0C45.62,0,36.57,9.285,36.57,23.656v10.907H24.037c-1.083,0-1.96,0.878-1.96,1.961v15.803 c0,1.083,0.878,1.96,1.96,1.96h12.533v39.876c0,1.083,0.877,1.96,1.96,1.96h16.352c1.083,0,1.96-0.878,1.96-1.96V54.287h14.654 c1.083,0,1.96-0.877,1.96-1.96l0.006-15.803c0-0.52-0.207-1.018-0.574-1.386c-0.367-0.368-0.867-0.575-1.387-0.575H56.842v-9.246 c0-4.444,1.059-6.7,6.848-6.7l8.397-0.003c1.082,0,1.959-0.878,1.959-1.96V1.98C74.046,0.899,73.17,0.022,72.089,0.02z\" data-original=\"#000000\" class=\"active-path\" data-old_color=\"#000000\" fill=\"#EBE7E7\"></path>\n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"tt\"> \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://twitter.com/baotrung304\" target=\"_blank\" aria-label=\"Twitter\" title=\"Theo d??i Evo Milana tr??n Twitter\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\" style=\"enable-background:new 0 0 512 512;\" xml:space=\"preserve\" width=\"25px\" height=\"25px\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M512,97.248c-19.04,8.352-39.328,13.888-60.48,16.576c21.76-12.992,38.368-33.408,46.176-58.016 c-20.288,12.096-42.688,20.64-66.56,25.408C411.872,60.704,384.416,48,354.464,48c-58.112,0-104.896,47.168-104.896,104.992 c0,8.32,0.704,16.32,2.432,23.936c-87.264-4.256-164.48-46.08-216.352-109.792c-9.056,15.712-14.368,33.696-14.368,53.056 c0,36.352,18.72,68.576,46.624,87.232c-16.864-0.32-33.408-5.216-47.424-12.928c0,0.32,0,0.736,0,1.152 c0,51.008,36.384,93.376,84.096,103.136c-8.544,2.336-17.856,3.456-27.52,3.456c-6.72,0-13.504-0.384-19.872-1.792 c13.6,41.568,52.192,72.128,98.08,73.12c-35.712,27.936-81.056,44.768-130.144,44.768c-8.608,0-16.864-0.384-25.12-1.44 C46.496,446.88,101.6,464,161.024,464c193.152,0,298.752-160,298.752-298.688c0-4.64-0.16-9.12-0.384-13.568 C480.224,136.96,497.728,118.496,512,97.248z\" data-original=\"#000000\" class=\"active-path\" data-old_color=\"#000000\" fill=\"#EBE7E7\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path> \n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"yt\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.youtube.com/channel/UCxSbzSivoHjPh2V1omoMqoQ\" target=\"_blank\" aria-label=\"Youtube\" title=\"Theo d??i Evo Milana tr??n Youtube\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\" style=\"enable-background:new 0 0 512 512;\" xml:space=\"preserve\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<path d=\"M490.24,113.92c-13.888-24.704-28.96-29.248-59.648-30.976C399.936,80.864,322.848,80,256.064,80 c-66.912,0-144.032,0.864-174.656,2.912c-30.624,1.76-45.728,6.272-59.744,31.008C7.36,138.592,0,181.088,0,255.904 C0,255.968,0,256,0,256c0,0.064,0,0.096,0,0.096v0.064c0,74.496,7.36,117.312,21.664,141.728 c14.016,24.704,29.088,29.184,59.712,31.264C112.032,430.944,189.152,432,256.064,432c66.784,0,143.872-1.056,174.56-2.816 c30.688-2.08,45.76-6.56,59.648-31.264C504.704,373.504,512,330.688,512,256.192c0,0,0-0.096,0-0.16c0,0,0-0.064,0-0.096 C512,181.088,504.704,138.592,490.24,113.92z M192,352V160l160,96L192,352z\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</path>\n");
      out.write("\t\t\t\t\t\t\t\t\t</svg> \n");
      out.write("\t\t\t\t\t\t\t\t</a> \n");
      out.write("\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t<li class=\"ins\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://www.instagram.com/trungncb/?hl=vi\" target=\"_blank\" aria-label=\"Instagram\" title=\"Theo d??i Evo Milana tr??n Instagram\"> \n");
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
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">V??? Evo Milana</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/\" title=\"Trang ch???\" rel=\"nofollow\">Trang ch???</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/gioi-thieu\" title=\"Gi???i thi???u\" rel=\"nofollow\">Gi???i thi???u</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/collections/all\" title=\"S???n ph???m\" rel=\"nofollow\">S???n ph???m</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/blogs/all\" title=\"Tin t???c\" rel=\"nofollow\">Tin t???c</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"B??? s??u t???p\" rel=\"nofollow\">B??? s??u t???p</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Th????ng hi???u n???i b???t\" rel=\"nofollow\">Th????ng hi???u n???i b???t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/lien-he\" title=\"Li??n h???\" rel=\"nofollow\">Li??n h???</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-nav-menu widget\"> \n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">H??? tr??? kh??ch h??ng</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/\" title=\"Trang ch???\" rel=\"nofollow\">Trang ch???</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/gioi-thieu\" title=\"Gi???i thi???u\" rel=\"nofollow\">Gi???i thi???u</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/collections/all\" title=\"S???n ph???m\" rel=\"nofollow\">S???n ph???m</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/blogs/all\" title=\"Tin t???c\" rel=\"nofollow\">Tin t???c</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"B??? s??u t???p\" rel=\"nofollow\">B??? s??u t???p</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"Th????ng hi???u n???i b???t\" rel=\"nofollow\">Th????ng hi???u n???i b???t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"/lien-he\" title=\"Li??n h???\" rel=\"nofollow\">Li??n h???</a>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ft-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"pgs-contact-widget widget\"> \n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-title\">Li??n h??? v???i ch??ng t??i</h4> <div class=\"footer-address\"> \n");
      out.write("\t\t\t\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>?????a ch???:</span> 30 ???????ng 2/9, Ph?????ng B??nh Hi??n, Qu???n H???i Ch??u, ???? N???ng</li> \n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>Email:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"mailto:evoteamthemes@gmail.com\" title=\"evoteamthemes@gmail.com\">evoteamthemes@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span>??i???n tho???i:</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"tel:0123456789\" title=\"0123456789\">0123 456 789</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li> \n");
      out.write("\t\t\t\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"footer-store\"> <a href=\"/he-thong-cua-hang\" title=\"H??? th???ng 10 showroom\">H??? th???ng 10 showroom</a> \n");
      out.write("\t\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"business_registration\"> \n");
      out.write("\t\t\t\t\t<p>C??ng ty c??? ph???n Evo Milana - MST: 0000000000 do s??? K??? Ho???ch v?? ?????u T?? ???? N???ng c???p ng??y 00/00/0000</p> \n");
      out.write("\t\t\t\t\t<p>?????a ch???: 30 ???????ng 2/9, Ph?????ng B??nh Hi??n, Qu???n H???i Ch??u, ???? N???ng</p> \n");
      out.write("\t\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
