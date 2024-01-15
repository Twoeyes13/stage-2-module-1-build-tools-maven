package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        if (str == null || str.isEmpty())  return false;
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            if (Double.parseDouble(str) < 1) return false;
            if (str.substring(0, 1).equals("0") && !str.substring(1, 2).equals(".")) return false;
        } else return false;
        return true;
    }
}
