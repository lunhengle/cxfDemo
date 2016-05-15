package com.lhl.exp3;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lunhengle on 2016/2/18.
 */
@WebService
public class ComplexUserService {
    public String getName(@WebParam(name = "name") String name) {
        return "name:" + name;
    }

    /**
     * 根据name 获取user对象
     *
     * @param name
     * @return
     */
    public User getUserByName(@WebParam(name = "name") String name) {
        User user = new User();
        user.setId(1);
        user.setName(name);
        user.setAddress("china");
        user.setEmail(name + "@lunhengle.com");
        return user;
    }

    public void setUser(User user) {
        System.out.println("######Service setUser######");
        System.out.println("setUser" + user);
    }

    public Users getUsers(int i) {
        List<User> users = new ArrayList<User>();
        for (int j = 0; j <= i; j++) {
            User user = new User();
            user.setId(j);
            user.setName("lunhengle" + 1);
            user.setAddress("china");
            user.setEmail("lunehgle" + i + "@lunhengle.com");
            users.add(user);
        }
        Users u = new Users();
        u.setUsers(users);
        return u;
    }

    public void setUsers(Users users) {
        System.out.println("######Service setUsers#######");
        for (User u : users.getUsers()) {
            System.out.println("setUsers" + users);
        }
    }

    public Users getUserArray(int i) {
        User[] users = new User[i];
        for (int j = 0; j < i; j++) {
            User user = new User();
            user.setId(j);
            user.setName("lunhengle" + 1);
            user.setAddress("china");
            user.setEmail("lunehgle" + i + "@lunhengle.com");
            users[j] = user;
        }
        Users u = new Users();
        u.setUserArr(users);
        return u;
    }
    public void setUserArray(Users users) {
        System.out.println("############Server setUserArray###########");
        for (User u : users.getUserArr()) {
            System.out.println("setUserArray:" + u);
        }
    }
    public void setUserMap(Users maps) {
        System.out.println("######Service setUserMap######");
        System.out.println("setUserMap:" + maps.getMaps());
    }

    public Users getUserMap() {
        HashMap<String, User> users = new HashMap<String, User>();
        User user = new User();
        user.setId(1);
        user.setName("lunhengle1");
        user.setAddress("china");
        user.setEmail("lunhengle1@lunhengle.com");
        users.put("A", user);
        user = new User();
        user.setId(1);
        user.setName("lunhengle2");
        user.setAddress("china");
        user.setEmail("lunhengle2@lunhengle.com");
        users.put("B", user);

        Users u = new Users();
        u.setMaps(users);
        return u;
    }
}
