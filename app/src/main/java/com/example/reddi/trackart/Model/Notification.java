package com.example.reddi.trackart.Model;

/**
 * Created by Reddi on 10/07/2017.
 */

public class Notification {

    private String description;
    private User from;
    private User to;
    private NotificationType type;
    private BaseContent content;

    public Notification(String d,User f,User t,NotificationType nt, BaseContent cnt){
        description = d;
        from = f;
        to = t;
        type = nt;
        content = cnt;
    }

    public String getDescription(){
        return description;
    }

    public User getFrom(){
        return from;
    }

    public User getTo(){
        return to;
    }

    public NotificationType getType(){
        return type;
    }

    public BaseContent getContent(){
        return content;
    }

}