package com.lhl.exp1;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by lunhengle on 2016/2/17.
 */
@WebService
public interface CxfIface {
    String sayHi(@WebParam(name="text")String text);
    String sayHiToUser(User user);
    String[] sayHiToUserList(List<User> listUser);
}
