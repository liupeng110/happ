package com.andlib.lp.util;

import android.text.TextUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public final class RegUtil {

    private RegUtil() {
        throw new Error("Do not need instantiate!");
    }


    public static boolean isEmail(String email) {
        Pattern pattern = Pattern
                .compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static boolean isEmpoty(String data) {
        return TextUtils.isEmpty(data);
    }


    public static boolean isEmail2(String data) {
        String expr = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return data.matches(expr);
    }


    public static boolean isMobileNumber(String data) {
        String expr = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        return data.matches(expr);
    }


    public static boolean isNumberLetter(String data) {
        String expr = "^[A-Za-z0-9]+$";
        return data.matches(expr);
    }


    public static boolean isNumber(String data) {
        String expr = "^[0-9]+$";
        return data.matches(expr);
    }


    public static boolean isLetter(String data) {
        String expr = "^[A-Za-z]+$";
        return data.matches(expr);
    }


    public static boolean isChinese(String data) {
        String expr = "^[\u0391-\uFFE5]+$";
        return data.matches(expr);
    }


    public static boolean isContainChinese(String data) {
        String chinese = "[\u0391-\uFFE5]";
        if (isEmpoty(data)) {
            for (int i = 0; i < data.length(); i++) {
                String temp = data.substring(i, i + 1);
                boolean flag = temp.matches(chinese);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean isDianWeiShu(String data, int length) {
        String expr = "^[1-9][0-9]+\\.[0-9]{" + length + "}$";
        return data.matches(expr);
    }


    public static boolean isCard(String data) {
        String expr = "^[0-9]{17}[0-9xX]$";
        return data.matches(expr);
    }


    public static boolean isPostCode(String data) {
        String expr = "^[0-9]{6,10}";
        return data.matches(expr);
    }

    public static boolean isLength(String data, int length) {

        return data != null && data.length() == length;
    }
}
