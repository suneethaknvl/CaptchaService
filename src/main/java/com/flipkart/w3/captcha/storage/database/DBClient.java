package com.flipkart.w3.captcha.storage.database;

import com.flipkart.w3.captcha.UserDO;
import com.flipkart.w3.captcha.config.DBConfig;
import com.flipkart.w3.captcha.exceptions.CaptchaNoDataException;
import com.flipkart.w3.captcha.storage.CaptchaStorage;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: venkata.lakshmi
 * Date: 21/03/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBClient implements CaptchaStorage {

    public DataSource createConnection() throws Exception {
        DBConfig config=new DBConfig();
        DataSource source = BasicDataSourceFactory.createDataSource(config.getDBConfig());
        return source;
    }

    public UserDO dequeueUserDO(String userId) throws Exception {

        JdbcTemplate SELECT = new JdbcTemplate(this.createConnection());
        List<UserDO> resultset= SELECT.query("select  * from" + DBConfig.getTableName() + "PERSON where id= ?",
                new Object[]{userId}, new UserRowMapper());

        if(resultset.isEmpty()){
            throw new CaptchaNoDataException("No such user found!");
        }
        else{
            for (UserDO usr : resultset ){
                return usr;
            }
        }
        return null;
    }

    public boolean enqueueUserDO(UserDO userObj) throws Exception {

        JdbcTemplate INSERT = new JdbcTemplate(this.createConnection());

        int ret = INSERT.update("INSERT INTO "+DBConfig.getTableName()+"(userId,userData,answer) VALUES (?, ?, ?)",
                userObj.getUserId(),userObj.getUserData(),userObj.getAnswer());

        if(ret>0)
            return true;
        else
            return false;
    }
}
