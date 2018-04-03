package com.company.collections;

import com.company.AppConnection;
import com.company.models.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemCollection {
    public static ArrayList<Item> getItems() throws SQLException {
        PreparedStatement ps= AppConnection.conn.prepareStatement("SELECT * FROM items");//отправили запрос на выполнение
        ResultSet result=ps.executeQuery();//рез-т хранится пока тут
        ArrayList<Item> items=new ArrayList<Item>();
        while (result.next()){//построчно записывается
            Item item=new Item();
            item.id=result.getInt("id");
            item.name=result.getString("name");
            item.price=result.getFloat("price");
            item.description=result.getString("description");
            item.image=result.getString("image");
            items.add(item);
        }
        return items;

            }
            public static int addItem(Item item) throws SQLException {
                PreparedStatement ps= AppConnection.conn.prepareStatement("INSERT INTO items (name,description,price,image) VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);//отправили запрос на выполнение
                ps.setString(1,item.name);
                ps.setString(2,item.description);
                ps.setFloat(3,item.price);
                ps.setString(4,item.image);
                return ps.executeUpdate();
                    }

                    public static boolean updateItem(Item item) throws SQLException { // изменяем занчения в таблице и проверяем 0-не верно,1 -верно
                        PreparedStatement ps= AppConnection.conn.prepareStatement("UPDATE items SET name=?, description=?, price=?, image=? WHERE id=?");
                        ps.setString(1,item.name);
                        ps.setString(2,item.description);
                        ps.setFloat(3,item.price);
                        ps.setString(4,item.image);
                        ps.setInt(5,item.id);
                        return ps.executeUpdate()==1;
                                    }

                                   public static boolean deleteItem(int id) throws SQLException {
                                       PreparedStatement ps= AppConnection.conn.prepareStatement("DELETE FROM items WHERE id=?");
                                       ps.setInt(1,id);
                                       return ps.executeUpdate()==1;
                                                                    }

                                                            }
