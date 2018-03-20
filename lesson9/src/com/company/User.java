package com.company;

import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String avatar;

    //base64-хранить ресурсы в ввиде строки(картинки)

    @Override
    public String toString() {  //переопределяем метод
        return String.format("%s,%s", name, avatar); //строкa String-%s
    }
}
