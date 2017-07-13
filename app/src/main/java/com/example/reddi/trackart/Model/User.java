package com.example.reddi.trackart.Model;

/**
 * Created by Reddi on 11/07/2017.
 */

public class User {

    private String name;
    private String userPic;

    public User(String Name,String usrPic){
        name = Name;
        userPic = usrPic;
    }

    public String getName(){
        return name;
    }

    public String getUserPic(){
        return userPic;
    }
}
