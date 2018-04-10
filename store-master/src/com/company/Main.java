package com.company;

import com.company.handlers.GetCategoriesHandler;
import com.company.handlers.SignInHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/signin", new SignInHandler());
        server.createContext("/getcategories", new GetCategoriesHandler());
        server.setExecutor(null);
        server.start();
    }
}