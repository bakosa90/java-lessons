package com.company;

import java.io.Serializable;

public class Settings implements Serializable{
    public int posX;
    public int posY;
    public boolean fullSScreen;//запускал ли пользователь в полноэкранном режиме

    @Override
    public String toString(){  //переопределяем метод
        return String.format("%d,%d,%b",posX,posY,fullSScreen); // тип int-%d, тип boolean-%b

    }
}
