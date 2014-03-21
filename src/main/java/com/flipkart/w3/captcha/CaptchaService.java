package com.flipkart.w3.captcha;

import java.awt.image.BufferedImage;

/**
 * Created by IntelliJ IDEA.
 * UserDO: venkata.lakshmi
 * Date: 21/03/14
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CaptchaService {

    public BufferedImage generateCaptcha(String userId,Object userData);

    public boolean validateCaptcha(String userId, String captchaAnswer);
}
