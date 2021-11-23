package ru.javawebinar.topjavagraduation.web;

import org.slf4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

public class RestaurantServlet extends HttpServlet {
    private static final Logger log = getLogger(RestaurantServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.debug("forward to restaurants");
        response.sendRedirect("restaurants.jsp");
    }
}
