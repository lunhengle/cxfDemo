package com.lhl.exp5;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by lunhengle on 2016/2/18.
 */
@WebService
public interface IQueryUser {
    String query(@WebParam(name = "user") UserInfo user);
}
