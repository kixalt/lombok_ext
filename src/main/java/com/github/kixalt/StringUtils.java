package com.github.kixalt;

public class StringUtils {

    /**
     * {@link org.apache.commons.lang3.StringUtils#capitalize(String)}
     *  @param self the String itself
     *  @return the capitalized String, {@code null} if null String input 
     */
    public static String capitalize(final String self) {
        return org.apache.commons.lang3.StringUtils.capitalize(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#contains(CharSequence, CharSequence)}
     * @param self the String itself
     * @param searchSeq the String to find, may be null
     * @return true if the CharSequence contains the search CharSequence,
     */
    public static boolean contains(final String self, final String searchSeq) {
        return org.apache.commons.lang3.StringUtils.contains(self, searchSeq);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#defaultString(String)}
     * @param self the String itself
     * @return the passed in String, or the empty String if it
     */
    public static String defaultString(final String self) {
        return org.apache.commons.lang3.StringUtils.defaultString(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#defaultString(String, String)}
     * @param self the String itself
     * @param str2  the default String to return
     * @return the passed in String, or the default if it was {@code null}
     */
    public static String defaultString(final String self, final String str2) {
        return org.apache.commons.lang3.StringUtils.defaultString(self, str2);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#deleteWhitespace(String)}
     * @param self the String itself
     * @return the String without whitespaces, {@code null} if null String input
     */
    public static String deleteWhitespace(final String self) {
        return org.apache.commons.lang3.StringUtils.deleteWhitespace(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#endsWith(CharSequence, CharSequence)}
     * @param self the String itself
     * @param suffix 
     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or
     *  both {@code null}
     */
    public static boolean endsWith(final String self, final String suffix) {
        return org.apache.commons.lang3.StringUtils.endsWith(self, suffix);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#equalsIgnoreCase(CharSequence, CharSequence)}
     * @param self the String itself
     * @param str2 the String to test
     * @return {@code true} if the CharSequences are equal (case-insensitive), or both {@code null}
     */
    public static boolean equalsIgnoreCase(final String self, final String str2) {
        return org.apache.commons.lang3.StringUtils.equalsIgnoreCase(self, str2);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isAllLowerCase(CharSequence)}
     * @param self the String itself
     * @return {@code true} if only contains lowercase characters, and is non-null
     */
    public static boolean isAllLowerCase(final String self) {
        return org.apache.commons.lang3.StringUtils.isAllLowerCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isAllUpperCase(CharSequence)}
     * @param self the String itself
     * @return {@code true} if only contains uppercase characters, and is non-null
     */
    public static boolean isAllUpperCase(final String self) {
        return org.apache.commons.lang3.StringUtils.isAllUpperCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isBlank(CharSequence)}
     * @param self the String itself
     * @return {@code true} if the CharSequence is null, empty or whitespace only
     */
    public static boolean isBlank(final String self) {
        return org.apache.commons.lang3.StringUtils.isBlank(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#isEmpty(CharSequence)}
     * @param self the String itself
     */
    public static boolean isEmpty(final String self) {
        return org.apache.commons.lang3.StringUtils.isEmpty(self);
    }

    /**
    * {@link org.apache.commons.lang3.StringUtils#isNumeric(CharSequence)}
    * @param self the String itself
    * @return {@code true} if the String is empty or null
    */
    public static boolean isNumeric(final String self) {
        return org.apache.commons.lang3.StringUtils.isNumeric(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#leftPad(String, int, char)}
     * @param self the String itself
     *  @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     */
    public static String leftPad(final String self, final int size, final char padChar) {
        return org.apache.commons.lang3.StringUtils.leftPad(self, size, padChar);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#lowerCase(String)}
     * @param self the String itself
     * @return the lower cased String, {@code null} if null String input
     */
    public static String lowerCase(final String self) {
        return org.apache.commons.lang3.StringUtils.lowerCase(self);
    }

    /**
     * {@link org.apache.commons.lang3.StringUtils#remove(String, String)}
     * @param self the String itself
     * @param remove the String to remove
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     */
    public static String remove(final String self, final String remove) {
        return org.apache.commons.lang3.StringUtils.remove(self, remove);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#repeat(String, int)}
     * @param self the String itself
     * @param repeat  number of times to repeat String, negative treated as zero
     *  @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     */
    public static String repeat(final String self, final int repeat) {
        return org.apache.commons.lang3.StringUtils.repeat(self, repeat);

    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#replace(String, String, String)}
     * @param self the String itself
     *  @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String self, final String searchString, final String replacement) {
        return org.apache.commons.lang3.StringUtils.replace(self, searchString, replacement);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#replaceIgnoreCase(String, String, String)}
     * @param self the String itself
     *  @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replaceIgnoreCase(final String self, final String searchString, final String replacement) {
        return org.apache.commons.lang3.StringUtils.replaceIgnoreCase(self, searchString, replacement);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#reverse(String)}
     * @param self the String itself
     * @return the reversed String, {@code null} if null String input
     */
    public static String reverse(final String self) {
        return org.apache.commons.lang3.StringUtils.reverse(self);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#rightPad(String, int, String)}
     * @param self the String itself
     *  @return right padded String or original String if no padding is necessary,
     *  @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     *  {@code null} if null String input
     */
    public static String rightPad(final String self, final int size, String padStr) {
        return org.apache.commons.lang3.StringUtils.rightPad(self, size, padStr);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#startsWith(CharSequence, CharSequence)}
     * @param self the String itself
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the String starts with the prefix, case sensitive, or
     *  both {@code null}
     */
    public static boolean startsWith(final String self, final String prefix) {
        return org.apache.commons.lang3.StringUtils.startsWith(self, prefix);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#substring(String, int)}
     * @param self the String itself
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     *  @return substring from start position, {@code null} if null String input
     */
    public static String substring(final String self, int start) {
        return org.apache.commons.lang3.StringUtils.substring(self, start);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#substring(String, int, int)}
     * @param self the String itself@param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @param end  the position to end at (exclusive), negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position to end position,
     *  {@code null} if null String input
     */
    public static String substring(final String self, int start, int end) {
        return org.apache.commons.lang3.StringUtils.substring(self, start, end);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#uncapitalize(String)}
     * @param self the String itself
     * @return the uncapitalized String, {@code null} if null String input
     */
    public static String uncapitalize(final String self) {
        return org.apache.commons.lang3.StringUtils.uncapitalize(self);
    }
    /**
     * {@link org.apache.commons.lang3.StringUtils#upperCase(String)}
     * @param self the String itself
     * @return the upper cased String, {@code null} if null String input
     */
    public static String upperCase(final String self) {
        return org.apache.commons.lang3.StringUtils.upperCase(self);
    }
}
