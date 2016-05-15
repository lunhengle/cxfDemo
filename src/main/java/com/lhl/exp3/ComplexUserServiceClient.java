package com.lhl.exp3;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lunhengle on 2016/2/18.
 */
public class ComplexUserServiceClient {
    public static void main(String[] args) {
        //调用WebService
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(IComplexUserService.class);
        factoryBean.setAddress("http://localhost:9000/complexUser");
        IComplexUserService service = (IComplexUserService) factoryBean.create();
        System.out.println(service.getName("lunhengle"));
        System.out.println("#####Client getUserByName#######");
        User user = service.getUserByName("lunhengle");
        System.out.println(user);
        user.setAddress("China-beijing");
        service.setUser(user);

        System.out.println("######Client getUsers");
        Users users = service.getUsers(4);
        System.out.println(users);

        List<User> tempUsers = new ArrayList<User>();
        for (User u : users.getUsers()) {
            System.out.println(u);
            u.setName("lunhengle" + new Random().nextInt(100));
            u.setAddress("China-beijing#" + new Random().nextInt(100));
            tempUsers.add(u);
        }
        users.getUsers().clear();
        users.getUsers().addAll(tempUsers);
        service.setUsers(users);

        System.out.println("#######Client getUserArray#######");
        users = service.getUserArray(4);
        User[] userArr = new User[4];
        int i = 0;
        for (User u : users.getUserArr()) {
            System.out.println(u);
            u.setName("lunhengle" + new Random().nextInt(100));
            u.setAddress("China-beijing#" + new Random().nextInt(100));
            userArr[i] = u;
            i++;
        }
        users.setUserArr(userArr);
        service.setUserArray(users);

        System.out.println("######Client getUserMap#######");
        users = service.getUserMap();
        System.out.println(users.getMaps());
        users.getMaps().put("ABA", userArr[0]);
        service.setUserMap(users);

    }
}
