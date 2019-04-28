package com.imooc.sell.util;

import java.util.Random;

public class KeyUtil{
    /**
     * 生成唯一的主键
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer a = random.nextInt(90000)+100000;

        return System.currentTimeMillis()+String.valueOf(a);
    }
}
