package com.flipkart.w3.captcha;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */

public class UserDO {

    private String userId;
    private Object userData;
    private String answer;

    public UserDO(){}

    public UserDO(String userId, Object userData, String answer) {
        this.userId = userId;
        this.userData = userData;
        this.answer = answer;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object userData) {
        this.userData = userData;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
