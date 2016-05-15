package com.lhl.exp1;

import javax.jws.WebService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lunhengle on 2016/2/17.
 */
@WebService
public class CxfImpl implements CxfIface {
    Map<Integer, User> users = new LinkedHashMap<Integer, User>();

    public String sayHi(String text) {
        return "hello" + text;
    }

    public String sayHiToUser(User user) {
        users.put(users.size() + 1, user);
        return "Hello" + user.getName();
    }

    public String[] sayHiToUserList(List<User> listUser) {
        String[] result = new String[listUser.size()];
        int i = 0;
        for (User u : listUser) {
            result[i] = "Hello" + u.getName();
            i++;
        }
        return result;
    }
}
