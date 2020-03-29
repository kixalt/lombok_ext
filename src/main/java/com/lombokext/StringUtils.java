package com.lombokext;

public class StringUtils {

    /**
     * {@link org.apache.commons.lang3.StringUtils#capitalize(String)}
     *  @param self the String itself
     */
    public static String capitalize(final String self) {
        return org.apache.commons.lang3.StringUtils.capitalize(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#contains(String)}
     * @param self the String itself
     * @param searchSeq the String to find, may be null
     */
    public static boolean contains(final String self, final String searchSeq) {
        return org.apache.commons.lang3.StringUtils.contains(self, searchSeq);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#defaultString(String)}
     */
    public static String defaultString(final String self) {
        return org.apache.commons.lang3.StringUtils.defaultString(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#defaultString(String, String)}
     */
    public static String defaultString(final String self, final String str2) {
        return org.apache.commons.lang3.StringUtils.defaultString(self, str2);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#deleteWhitespace(String)}
     */
    public static String deleteWhitespace(final String self) {
        return org.apache.commons.lang3.StringUtils.deleteWhitespace(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#endsWith(String, String)}
     */
    public static boolean endsWith(final String self, final String suffix) {
        return org.apache.commons.lang3.StringUtils.endsWith(self, suffix);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#endsWith(String, String)}
     */
    public static boolean equalsIgnoreCase(final String self, final String str2) {
        return org.apache.commons.lang3.StringUtils.endsWith(self, str2);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isAllLowerCase(String)}
     */
    public static boolean isAllLowerCase(final String self) {
        return org.apache.commons.lang3.StringUtils.isAllLowerCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isAllUpperCase(String)}
     */
    public static boolean isAllUpperCase(final String self) {
        return org.apache.commons.lang3.StringUtils.isAllUpperCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isBlank(String)}
     */
    public static boolean isBlank(final String self) {
        return org.apache.commons.lang3.StringUtils.isBlank(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isEmpty(String)}
     */
    public static boolean isEmpty(final String self) {
        return org.apache.commons.lang3.StringUtils.isEmpty(self);
    }

    /**
    * {@link org.apache.commons.lang3.StringUtils#isNumeric(String)}
    */
    public static boolean isNumeric(final String self) {
        return org.apache.commons.lang3.StringUtils.isNumeric(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#leftPad(String, int, char)}
     */
    public static String leftPad(final String self, final int size, final char padChar) {
        return org.apache.commons.lang3.StringUtils.leftPad(self, size, padChar);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#lowerCase(String)}
     */
    public static String lowerCase(final String self) {
        return org.apache.commons.lang3.StringUtils.lowerCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#remove(String, String)}
     */
    public static String remove(final String self, final String remove) {
        return org.apache.commons.lang3.StringUtils.remove(self, remove);
    }

    public static String repeat(final String self, final int repeat) {
        return org.apache.commons.lang3.StringUtils.repeat(self, repeat);

    }

    public static String replace(final String self, final String searchString, final String replacement) {
        return org.apache.commons.lang3.StringUtils.replace(self, searchString, replacement);
    }

    public static String replaceIgnoreCase(final String self, final String searchString, final String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceIgnoreCase(self, searchString, replacement);
    }

    public static String reverse(final String self) {
        return org.apache.commons.lang3.StringUtils.reverse(self);
    }

    public static String rightPad(final String self, final int size, String padStr) {
        return org.apache.commons.lang3.StringUtils.rightPad(self, size, padStr);
    }

    public static boolean startsWith(final CharSequence self, final CharSequence prefix) {
        return org.apache.commons.lang3.StringUtils.startsWith(self, prefix);
    }

    public static String substring(final String self, int start) {
        return org.apache.commons.lang3.StringUtils.substring(self, start);
    }

    public static String substring(final String self, int start, int end) {
        return org.apache.commons.lang3.StringUtils.substring(self, start, end);
    }

    public static String uncapitalize(final String self) {
        return org.apache.commons.lang3.StringUtils.uncapitalize(self);
    }

    public static String upperCase(final String self) {
        return org.apache.commons.lang3.StringUtils.upperCase(self);
    }
}
