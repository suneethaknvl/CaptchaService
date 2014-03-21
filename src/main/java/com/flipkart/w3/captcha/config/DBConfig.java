package com.flipkart.w3.captcha.config;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: venkata.lakshmi
 * Date: 21/03/14
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBConfig {

    /* db related config */
    public String dbHost = "localhost";
    public String dbUser = "root";
    public String dbPass = "";
    public String dbName = "captchaService_db";
    public String dbThreadsInitialSize = "5";
    public String dbThreadsMaxActive = "25";
    public String dbThreadsMaxIdle = "10";
    public String tableName = "captchaStore";
    public int dbBucketInterval = 60;
    public int dbTtl = 30 * 24 * 3600;

    public Properties getDBConfig() {
        Properties props = new Properties();
        props.setProperty("url","jdbc:mysql://" + dbHost + "/" + dbName + "?autoReconnect=true");
        props.setProperty("driverClassName", "com.mysql.jdbc.Driver");
        props.setProperty("username", dbUser);
        props.setProperty("password", dbPass);
        props.setProperty("maxIdle", dbThreadsMaxIdle);
        props.setProperty("initialSize", dbThreadsInitialSize);
        props.setProperty("maxActive", dbThreadsMaxActive);
        return props;
    }
}
