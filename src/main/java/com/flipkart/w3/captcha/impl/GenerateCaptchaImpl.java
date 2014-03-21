package com.flipkart.w3.captcha.impl;

import com.flipkart.w3.captcha.GenerateCaptcha;
import com.flipkart.w3.captcha.exceptions.CaptchaValidationException;
import jj.play.ns.nl.captcha.Captcha;


/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
class GenerateCaptchaImpl implements GenerateCaptcha{


    public String captchaTextGenerator() {

        Captcha captcha = new Captcha.Builder(200,50).addText().build();
        return captcha.getAnswer();
    }

    public boolean storeUserCaptcha(String userId, Object userData, String captchaText) throws CaptchaValidationException {
        if(captchaText.isEmpty())
            throw new CaptchaValidationException("Captcha Text should not be empty");
        if(userId.isEmpty())
            throw new CaptchaValidationException("UserId cannot be empty");




        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public byte[] imageGenerator(String captchaText) {
        return new byte[0];  //To change body of implemented methods use File | Settings | File Templates.
    }
}
