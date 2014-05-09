package com.flipkart.w3.captcha.storage.database;


import com.flipkart.w3.captcha.UserDO;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: venkata.lakshmi
 * Date: 21/03/14
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */

public class UserResultExtractor implements ResultSetExtractor<UserDO> {

  @Override
  public UserDO extractData(ResultSet rs) throws SQLException {
    UserDO usr = new UserDO();
    usr.setUserId(rs.getString(1));
    usr.setUserData(rs.getString(2));
    usr.setAnswer(rs.getString(3));
    return usr;
  }

}