package dev.persiantools.commons;

public class FarsiChars {
    public static final String faAlphabet = "ابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهی";
    public static final String faNumber = "۰۱۲۳۴۵۶۷۸۹";
    public static final String faShortVowels = "َُِ";
    public static final String faOthers = "‌آاً";
    public static final String faMixedWithArabic = "ًٌٍَُِّْٰٔءك‌ةۀأإيـئؤ،";
    public static final String faText = faAlphabet + faNumber + faShortVowels + faOthers;
    public static final String faComplexText = faText + faMixedWithArabic;
}
