package com.flipkart.w3.captcha.storage.database;
import com.flipkart.w3.captcha.UserDO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: venkata.lakshmi
 * Date: 21/03/14
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserRowMapper implements RowMapper<UserDO>{
    @Override
    public UserDO mapRow(ResultSet rs, int line) throws SQLException {
      UserResultExtractor extractor = new UserResultExtractor();
      return extractor.extractData(rs);
    }

}
