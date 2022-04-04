package com.codecool.hackernews.views;

public class Layout {
    public String getHeaderHtml(String titlePage) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>" + titlePage + "</title>\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href='/static/css/site.css' />\n" +
                "<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>\n" +
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
                "<a class=\"cta\" href=\"#footer\"><button>Contact</button></a>\n" +
                "</header>\n";
    }

    public String getMainBodyHtml() {
        return "<div id='news'></div>\n" +
                "<div id='newest'></div>\n" +
                "<div id='jobs'></div>\n" +
                "<div id='pagination'></div>\n";
    }

    public String getFooterHtml() {
        return "<footer>\n" +
                "<section id='footer'>" +
                "<div class='footer-bottom'>\n" +
                "<p>copyright &copy;2022  designed by Cosmin Vulpe</p>\n" +
                "<p>email: cosmin98vulpe@gmail.com</p>\n" +
                "<div class='footer-content'>\n" +
                "<ul class='socials'>" +
                "<li><a href='https://github.com/CosminVulpe' target='_blank'><i class='fa fa-github' aria-hidden='true'></i></a></li>\n" +
                "<li><a href='https://uk.linkedin.com/in/cosmin-vulpe-885114181/ro?trk=people-guest_people_search-card' target='_blank'><i class='fa fa-linkedin-square' aria-hidden='true'></i></a></li>\n" +
                "</ul>" +
                "</div>" +
                "</div>\n" +
                "</section>" +
                "</footer>\n" +
                "</body>\n" +
                "</html>";
    }
}
