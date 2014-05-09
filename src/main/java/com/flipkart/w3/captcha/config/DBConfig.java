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
    private static String tableName = "captchaStore";
    public int dbBucketInterval = 60;
    public int dbTtl = 30 * 24 * 3600;

    public String getDbHost() {
        return dbHost;
    }

    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public void setDbPass(String dbPass) {
        this.dbPass = dbPass;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbThreadsInitialSize() {
        return dbThreadsInitialSize;
    }

    public void setDbThreadsInitialSize(String dbThreadsInitialSize) {
        this.dbThreadsInitialSize = dbThreadsInitialSize;
    }

    public String getDbThreadsMaxActive() {
        return dbThreadsMaxActive;
    }

    public void setDbThreadsMaxActive(String dbThreadsMaxActive) {
        this.dbThreadsMaxActive = dbThreadsMaxActive;
    }

    public String getDbThreadsMaxIdle() {
        return dbThreadsMaxIdle;
    }

    public void setDbThreadsMaxIdle(String dbThreadsMaxIdle) {
        this.dbThreadsMaxIdle = dbThreadsMaxIdle;
    }

    public static String getTableName() {
        return tableName;
    }

    public static void setTableName(String tableName) {
        DBConfig.tableName = tableName;
    }

    public int getDbBucketInterval() {
        return dbBucketInterval;
    }

    public void setDbBucketInterval(int dbBucketInterval) {
        this.dbBucketInterval = dbBucketInterval;
    }

    public int getDbTtl() {
        return dbTtl;
    }

    public void setDbTtl(int dbTtl) {
        this.dbTtl = dbTtl;
    }

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
