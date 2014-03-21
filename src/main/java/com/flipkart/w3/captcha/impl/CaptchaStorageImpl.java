package com.flipkart.w3.captcha.impl;

import com.flipkart.w3.captcha.config.DBConfig;
import com.flipkart.w3.captcha.storage.CaptchaStorage;
import com.flipkart.w3.captcha.storage.UserDO;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by IntelliJ IDEA.
 * User: venkata.lakshmi
 * Date: 21/03/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaptchaStorageImpl implements CaptchaStorage{

    public DataSource createConnection() throws Exception {
        DBConfig config=new DBConfig();
        DataSource source = BasicDataSourceFactory.createDataSource(config.getDBConfig());
        return source;
    }



    public UserDO dequeueUserDO(String usedId) throws Exception {

        JdbcTemplate tmpl = new JdbcTemplate(this.createConnection());

        String SELECT = "SELECT * FROM captchaStore WHERE id = ? ";

        try {
//             return tmpl.que
            //return tmpl.query(SELECT, usedId, new FirstRowExtractor());

        } catch (BadSqlGrammarException be) {
            throw be;
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean enqueueUserDO(UserDO userObj) {


        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
