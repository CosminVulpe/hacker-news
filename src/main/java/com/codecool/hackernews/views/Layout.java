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
                "<a class=\"cta\" href=\"#\"><button>Contact</button></a>\n" +
                "</header>\n" +
                "</body>\n" +
                "</html>";
    }

    public String getMainBodyHtml() {
        return "<body>\n" +
                "<div class='visit'>You can serve any static content from <span class='folder'>webapp/static</span> folder, like a css file.</div>\n" +
                "<div>Visit another servlet: <a href=\"/another\">Visit the other servlet</a></div> \n" +
                "<div>You can provide a json file as well: <a href=\"/json\">Visit Hacker News json data example</a></div>\" \n" +
                "</body>\n" +
                "</html>";
    }

    public String getFooterHtml() {
        return "";
    }


}
