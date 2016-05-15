package com.lhl.exp3;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 */
@WebService
public interface IComplexUserService {
    String getName(@WebParam(name = "name") String name);

    User getUserByName(@WebParam(name = "name") String name);

    void setUser(User user);

    Users getUsers(int i);

    void setUsers(Users users);

    Users getUserArray(int i);

    void setUserArray(Users users);

    void setUserMap(Users maps);

    Users getUserMap();
}
