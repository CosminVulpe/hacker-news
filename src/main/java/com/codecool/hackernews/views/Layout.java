package com.codecool.hackernews.views;

public class Layout {
    public String getHeaderHtml(String titlePage) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>" + titlePage + "</title>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />\n" +
                "<link rel=\"stylesheet\" href=\"path/to/bootstrap/css/bootstrap.min.css\">\n" +
                "<script src=\"/static/js/main.js\" defer>" + "</script>\n" +
                "</head>";
    }


    public String getNavBarHtml(String title) {
        return "<body>\n" +
                "<header>\n" +
                "<h2 align = \"center\">" + title + "</h2>\n" +
                "<nav>\n" +
                "<ul class=\"nav-links\">\n" +
                "<li><a href=\"#\" id='top-news-header'>Top news</a></li>\n" +
                "<li><a href=\"#\" id='newest-header'>Newest</a></li>\n" +
                "<li><a href=\"#\"id='jobs-header'>Jobs</a></li>\n" +
                "<li><a href=\"#\">Curriculum</a></li>\n" +
                "</ul>\n" +
                "</nav>\n" +
                "<a class=\"cta\" href=\"#\"><button>Sign up</button></a>\n" +
                "<a class=\"cta\" href=\"#\"><button>Login</button></a>\n" +
                "</header>\n";
    }

    public String getMainBodyHtml() {
        return "<div id='news'></div>\n" +
                "<div id='newest'></div>\n" +
                "<div id='jobs'></div>\n";
    }

    public String getFooterHtml() {
        return "<footer>\n" +
                "<div class='footer-content'>\n" +
                "<ul class='socials'>" +
                "<li><a href='#'><i class='fa fa-facebook-official' aria-hidden='true'></i></a></li>\n" +
                "<li><a href='#'><i class='fa fa-twitter' aria-hidden='true'></i></a></li>\n" +
                "<li><a href='#'><i class='fa fa-github' aria-hidden='true'></i></a></li>\n" +
                "<li><a href='#'><i class='fa fa-linkedin-square' aria-hidden='true'></i></a></li>\n" +
                "</ul>" +
                "</div>" +
                "<div class='footer-bottom'>\n"+
                "<p>copyright &copy;2022  designed by Cosmin Vulpe</p>\n" +
                "<p>email: cosmin98vulpe@gmail.com</p>\n" +
                "<li><a href='#'><span class=\"fa-brands fa-github\"></span></i></a></li>\n" +
                "</div>\n"+
                "</footer>\n" +
                "</body>\n" +
                "</html>";
    }
}
