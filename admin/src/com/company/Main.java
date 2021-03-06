package com.company;

import com.company.collections.ItemCollection;
import com.company.handlers.GetItemsHandler;
import com.company.handlers.SignInHandler;
import com.company.models.Item;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            AppConnection.createConnection();//инициалтизируем подкл
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

      /*  try {
            System.out.println(ItemCollection.getItems());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Item item=new Item();
        item.name="Shorts";
        item.image="some image";
        item.price=24.5f;
        item.description="blue";
        item.id=2;
        try {
            ItemCollection.updateItem(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            ItemCollection.deleteItem(4);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

      //пример Http сервера

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/signin", new SignInHandler());
        server.createContext("/getitems", new GetItemsHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    }


