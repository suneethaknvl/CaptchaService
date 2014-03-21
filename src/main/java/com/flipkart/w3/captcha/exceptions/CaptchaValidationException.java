package com.flipkart.w3.captcha.exceptions;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class CaptchaValidationException extends Exception {

    public CaptchaValidationException(String message){
        super(message);

    }

    public CaptchaValidationException(String message,Throwable exception){
        super(message,exception);
    }

}
