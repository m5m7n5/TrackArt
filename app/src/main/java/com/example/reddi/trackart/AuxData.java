package com.example.reddi.trackart;

import com.example.reddi.trackart.Model.BaseContent;
import com.example.reddi.trackart.Model.ContentType;
import com.example.reddi.trackart.Model.Notification;
import com.example.reddi.trackart.Model.NotificationType;
import com.example.reddi.trackart.Model.User;

import java.util.ArrayList;

/**
 * Created by Reddi on 12/07/2017.
 */

public class AuxData {

    private static AuxData instance;

    private ArrayList<BaseContent> contents;
    private ArrayList<User> users;
    private ArrayList<Notification> notifications;

    private AuxData(){
        generateContents();
        generateUsers();
        generateNotifications();
    }

    public static AuxData getInstance(){
        if(instance == null){
            instance = new AuxData();
        }
        return instance;
    }

    private void generateContents(){
        contents = new ArrayList<>();

        contents.add(new BaseContent("Full metal alchemist",
                "Hermanos guerreros con magia y mas cosas nasis",
                "http://vignette2.wikia.nocookie.net/fma/images/e/e9/Fmab-poster.png/revision/latest?cb=20131124145205",
                ContentType.ANIME));

        contents.add(new BaseContent("Doctor who",
                "Viajes en el tiempo nunca en solitario",
                "https://latimesherocomplex.files.wordpress.com/2009/12/6a00d8341c630a53ef01287676257f970c-300wi.jpg",
                ContentType.SERIES));

        contents.add(new BaseContent("Disgaea 5",
                "Tactic rpg y grindeo infinito",
                "https://s-media-cache-ak0.pinimg.com/736x/9a/3c/8a/9a3c8a27debd48866f66ed49ea699ccc--art-manga-anime-manga.jpg",
                ContentType.GAMES));

        contents.add(new BaseContent("Divergente",
                "Ya tu sabe de que va, y es nais, a medias",
                "https://imagessl7.casadellibro.com/a/l/t0/87/9788427201187.jpg",
                ContentType.BOOKS));
    }

    private void generateUsers(){
        users = new ArrayList<>();

        users.add(new User("m5m7n5","https://scontent.fmad3-2.fna.fbcdn.net/v/t31.0-8/16825791_1336351273096051_9008753833827262845_o.jpg?oh=a8591eaee1831ad7f1673268f8e94637&oe=59CEB4A8"));
        users.add(new User("totodilej","https://cdn.bulbagarden.net/upload/thumb/d/df/158Totodile.png/250px-158Totodile.png"));
    }

    private void generateNotifications(){
        notifications = new ArrayList<>();

        notifications.add(new Notification("ASDF",users.get(0),users.get(1), NotificationType.FRIENDREQUEST,null));
        notifications.add(new Notification("ASDF",users.get(1),users.get(1), NotificationType.FRIENDREQUEST,null));
        notifications.add(new Notification("ASDF",users.get(0),users.get(1), NotificationType.RECOMMENDATION,contents.get(2)));
        notifications.add(new Notification("ASDF",users.get(1),users.get(1), NotificationType.RECOMMENDATION,contents.get(3)));
    }

    public ArrayList<BaseContent> getContents() {
        return contents;
    }

    public ArrayList<Notification> getNotifications() {
        return notifications;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
