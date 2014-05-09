package com.flipkart.w3.captcha.impl;

import com.flipkart.w3.captcha.GenerateCaptcha;
import com.flipkart.w3.captcha.UserDO;
import com.flipkart.w3.captcha.exceptions.CaptchaValidationException;
import com.flipkart.w3.captcha.storage.CaptchaStorage;
import com.flipkart.w3.captcha.storage.database.DBClient;
import jj.play.ns.nl.captcha.Captcha;


/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
class GenerateCaptchaImpl implements GenerateCaptcha{

    CaptchaStorage storage;

    public GenerateCaptchaImpl(){
        storage = new DBClient();
    }

    public String captchaTextGenerator() {

        Captcha captcha = new Captcha.Builder(200,50).addText().build();

        return captcha.getAnswer();
    }

    public boolean storeUserCaptcha(String userId, Object userData, String captchaText) throws Exception {

        if(captchaText.isEmpty())
            throw new CaptchaValidationException("Captcha Text should not be empty");
        if(userId.isEmpty())
            throw new CaptchaValidationException("UserId cannot be empty");

        UserDO obj = new UserDO(userId, userData, captchaText);
        return storage.enqueueUserDO(obj);
    }

    public byte[] imageGenerator(String captchaText) {
        return new byte[0];
    }

    public void setStorage(CaptchaStorage storage) {
        this.storage = storage;
    }
}
