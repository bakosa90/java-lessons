package com.company;

public class User implements Cloneable{
    public String name;
    public String login;
    public User(String name,String login){
        //инициализация свойств
        this.name=name;
        this.login=login;
        //конструктор копирования
        }

    public User(User u){
       // this.name=u.name;
        //this.login=u.login;==->
        this(u.name,u.login);
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();//скопировали объект и присв.свойства родителя
            }

            public Message message;

}
