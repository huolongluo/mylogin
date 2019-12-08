package com.huolongluo.mylogin;

import java.util.Random;

/**
 * Created by 火龙裸 on 2019/11/30.
 * desc   :
 * version: 1.0
 */
public class StringUtil {
    //length用户要求产生字符串的长度
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
