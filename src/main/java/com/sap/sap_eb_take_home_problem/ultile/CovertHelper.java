package com.sap.sap_eb_take_home_problem.ultile;

public class CovertHelper {
    public static Object convertValue(Class<?> fieldType, String value) {
        if (fieldType == Long.class) {
            return Long.parseLong(value);
        } else if (fieldType == Integer.class) {
            return Integer.parseInt(value);
        } else if (fieldType == Boolean.class) {
            if(String.valueOf(value).equalsIgnoreCase("Yes")){
                return true;
            }
            return false;
        } else {
            return value;  // For String and other types
        }
    }
}
