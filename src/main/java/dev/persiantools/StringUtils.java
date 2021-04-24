package dev.persiantools;

import dev.persiantools.commons.FarsiChars;

import java.util.regex.Pattern;

public class StringUtils {

    /**
     * Check if string is in persian.
     * @param text A phrase consist of alphabets of any language
     * @param isComplex In complex mode, the method accepts some specific characters which are common in Farsi text.
     * @param trimPattern Pattern of characters which you want to trim from the string e.g. "-+. ()"
     * @return A boolean to indicate the input phrase is persian phrase or not
     */
    public static boolean isPersian(String text, boolean isComplex, String trimPattern) {

        String trimmedText = text.replaceAll(trimPattern, "");

        String faRegex = isComplex ? FarsiChars.faComplexText : FarsiChars.faText;
        Pattern pattern = Pattern.compile("^[" + faRegex + "]+$");
        return pattern.asPredicate().test(trimmedText);
    }

    /**
     * Check if string is in persian.
     * <blockquote>
     *     Not that the default pattern of characters which you want to trim from the string is ["'-+()؟\s.]
     * </blockquote>
     * @param text A phrase consist of alphabets of any language
     * @param isComplex In complex mode, the method accepts some specific characters which are common in Farsi text.
     * @return A boolean to indicate the input phrase is persian phrase or not
     */
    public static boolean isPersian(String text, boolean isComplex) {
        return isPersian(text, isComplex, "[\"'-+()؟\\s.]");
    }

    /**
     * Check if string is in persian.
     * <blockquote>
     *     Not that the default pattern of characters which you want to trim from the string is ["'-+()؟\s.]
     *     and isComplete is false
     * </blockquote>
     * @param text A phrase consist of alphabets of any language
     * @return A boolean to indicate the input phrase is persian phrase or not
     */
    public static boolean isPersian(String text) {
        return isPersian(text, false, "[\"'-+()؟\\s.]");
    }


    /**
     * Check if string includes persian alphabet.
     * @param text A phrase consist of alphabets of any language
     * @param isComplex In complex mode, the method accepts some specific characters which are common in Farsi text.
     * @return A boolean to indicate the input phrase has persian alphabet or not
     */
    public static boolean hasPersian (String text, boolean isComplex) {
        String faRegex = isComplex ? FarsiChars.faComplexText : FarsiChars.faText;
        Pattern pattern = Pattern.compile("[" + faRegex + "]");
        return pattern.asPredicate().test(text);
    }

    /**
     * Check if string includes persian alphabet.
     * <blockquote>
     *     Not that isComplete is false by default
     * </blockquote>
     * @param text A phrase consist of alphabets of any language
     * @return A boolean to indicate the input phrase has persian alphabet or not
     */
    public static boolean hasPersian (String text) {
        return hasPersian(text, false);
    }
}
