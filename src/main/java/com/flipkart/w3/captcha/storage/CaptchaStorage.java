package com.flipkart.w3.captcha.storage;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CaptchaStorage {

    public UserDO dequeueUserDO (String usedId) throws Exception;

    public boolean enqueueUserDO (UserDO userObj);

}
