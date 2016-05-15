package com.lhl.exp3;

import java.util.HashMap;
import java.util.List;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class Users {
    private List<User> users;
    private User[] userArr;
    private HashMap<String, User> maps;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User[] getUserArr() {
        return userArr;
    }

    public void setUserArr(User[] userArr) {
        this.userArr = userArr;
    }

    public HashMap<String, User> getMaps() {
        return maps;
    }

    public void setMaps(HashMap<String, User> maps) {
        this.maps = maps;
    }
}
