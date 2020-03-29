package com.lombokext.lang;

import java.util.List;

public class ObjectUtils {

    public static <T> boolean isNullOrEmpty(List<T> list) {

        if (null == list || list.isEmpty()) {
            return true;
        }
        return false;

    }

    public static boolean isNull(Object o) {
        if (null == o) {
            return true;
        }
        return false;
    }

}
