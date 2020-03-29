package com.github.kixalt;

import java.util.List;

public class ObjectUtils {

    /**
     * Test if a List is empty or null
     * @param list the List itself
     * @return true if null or empty 
     */
    public static boolean isNullOrEmpty(List<?> list) {

        if (null == list || list.isEmpty()) {
            return true;
        }
        return false;

    }
    /**
     * Test if an object is  null
     * @param o object  the object itself
     * @return true if null   
     */
    public static boolean isNull(Object o) {
        if (null == o) {
            return true;
        }
        return false;
    }

}
