package com.example.reddi.trackart.Model;

/**
 * Created by Reddi on 12/07/2017.
 */

public enum NotificationType {
    RECOMMENDATION,
    FRIENDREQUEST;

    public static String getDescription(NotificationType t, String user){
        String msg="";
        switch (t){
            case FRIENDREQUEST:
                msg += "The user " + user + " want's to add you to his friend list.";
                break;
            case RECOMMENDATION:
                msg += "The user " + user + " is recommending ";
                break;
        }
        return msg;
    }
}
