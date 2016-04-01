package com.tiger.restful.utils;

import java.util.Random;

public class StringUtil {

    /**
     * 生成随机密码
     *
     * @param len 生成的密码的总长度
     * @return 密码的字符串
     */
    public static String genRandomCode(int len) {
        final int maxNum = 36;
        int i; // 生成的随机数
        int count = 0; // 生成的密码的长度
        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        StringBuffer pwd = new StringBuffer();
        Random r = new Random();
        while (count < len) {
            // 生成随机数，取绝对值，防止生成负数，
            i = Math.abs(r.nextInt(maxNum)); // 生成的数最大为36-1

            if (i >= 0 && i < str.length) {
                pwd.append(str[i]);
                count++;
            }
        }

        return pwd.toString();
    }

    public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[1] = (byte) (c & 0xFF);
        b[0] = (byte) (c >> 8 & 0xFF);
        return b;
    }

    public static char byteToChar(byte[] b) {
        return (char) (((b[0] & 0xFF) << 8) | (b[1] & 0xFF));
    }

    public static boolean hasLength(String str, int len) {
        char[] chars = str.toCharArray();
        for (char c : chars) {
            int val = (int) c;
            if (val < -128 || val > 127) {
                len--;
            }
        }
        return len <= 0;
    }

    public static void main(String[] args) {
        byte[] b = charToByte('刘');
        System.out.println(byteToChar(b));
    }
}
