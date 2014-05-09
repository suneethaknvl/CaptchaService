package com.flipkart.w3.captcha.exceptions;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaptchaNoDataException extends Exception {

    public CaptchaNoDataException(String message){
        super(message);

    }

    public CaptchaNoDataException(String message, Throwable exception){
        super(message,exception);
    }

}
