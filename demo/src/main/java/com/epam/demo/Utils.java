package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String el : args) {
            if(StringUtils.isPositiveNumber(el) == false) return false;
        }
       //magic happens here
        return true;
    }
}