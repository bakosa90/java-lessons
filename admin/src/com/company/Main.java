package com.company;

import com.company.collections.ItemCollection;
import com.company.models.Item;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            AppConnection.createConnection();//инициалтизируем подкл
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
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
        }
    }
}
