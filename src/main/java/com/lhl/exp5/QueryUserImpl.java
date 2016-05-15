package com.lhl.exp5;

import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 */

@WebService(endpointInterface = "com.lhl.exp5.IQueryUser")
public class QueryUserImpl implements IQueryUser {
    public String query(UserInfo user) {
        if (null == user) {

        }
        return "your name is " + user.getUsername();
    }
}
