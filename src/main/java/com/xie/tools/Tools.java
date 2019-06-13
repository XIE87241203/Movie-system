package com.xie.tools;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Tools {
    /**
     * 对字符串md5加密
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String getMD5Str(String str) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(md.digest(str.getBytes(UTF_8)));
    }

}
