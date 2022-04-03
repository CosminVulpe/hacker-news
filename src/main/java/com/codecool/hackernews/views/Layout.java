package com.codecool.hackernews.views;

public class Layout {
    public String getHeaderHtml(String titlePage) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>" + titlePage + "</title>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />\n" +
                "<script src=\"/static/js/main.js\" defer>" + "</script>\n" +
                "</head>";
    }


    public String getNavBarHtml(String title) {
        return "<body>\n" +
                "<header>\n" +
                "<h2 align = \"center\">" + title + "</h2>\n" +
                "<nav>\n" +
                "<ul class=\"nav-links\">\n" +
                "<li><a href=\"#\">Top news</a></li>\n" +
                "<li><a href=\"#\">Newest</a></li>\n" +
                "<li><a href=\"#\">Jobs</a></li>\n" +
                "<li><a href=\"#\">Curriculum</a></li>\n" +
                "</ul>\n" +
                "</nav>\n" +
                "<a class=\"cta\" href=\"#\"><button>Sign up</button></a>\n" +
                "<a class=\"cta\" href=\"#\"><button>Login</button></a>\n" +
                "</header>\n";

    }

    public String getMainBodyHtml() {
        return "<div id='test'></div>"
                + "</body>\n" +
                "</html>";
    }

    public String getFooterHtml() {
        return "";
    }


}
