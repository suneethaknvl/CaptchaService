package com.flipkart.w3.captcha;

import com.flipkart.w3.captcha.exceptions.CaptchaValidationException;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 14/03/14
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenerateCaptcha {

    public String captchaTextGenerator();

    public boolean storeUserCaptcha(String userId,Object userData,String captchaText) throws Exception;

    public byte[] imageGenerator(String captchaText);
}
