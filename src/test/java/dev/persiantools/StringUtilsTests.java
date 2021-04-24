package dev.persiantools;

import org.junit.Test;

public class StringUtilsTests {

    @Test
    public void isPersian_WithPersianPhrase_ReturnsTrue() {
        assert StringUtils.isPersian("این یک متن فارسی است؟");
        assert StringUtils.isPersian("به نظر میاد (این جمله داخل پرانتز) مشکلی ایجاد نکنه");
        assert StringUtils.isPersian("آیا سیستم میتواند گزینه های دیگری را به اشتباه به عنوان متن فارسی تشخیص دهد؟");
        assert StringUtils.isPersian("گیت‌هاب مأمن کدهای ماست", true);
        assert StringUtils.isPersian("این یک متن!@#$%&* فارسی است", false, "[!@#$%&*\\s.]");
    }

    @Test
    public void isPersian_WithNonPersianPhrase_ReturnsFalse() {
        assert !StringUtils.isPersian("Lorem Ipsum Test");
        assert !StringUtils.isPersian("これはペルシア語のテキストですか");
        assert !StringUtils.isPersian("Это персидский текст?");
        assert !StringUtils.isPersian("这是波斯文字吗?");
        assert !StringUtils.isPersian("هل هذا نص فارسي؟");
        assert !StringUtils.isPersian("أكد رئيس اللجنة العسكرية الممثلة لحكومة الوفاق الوطني في ليبيا أحمد علي أبو شحمة، أن اللجنة لا تستطيع تنفيذ خطتها لإخراج العناصر الأجنبية من أراضي البلاد.");
        assert !StringUtils.isPersian("");
        assert !StringUtils.isPersian("گیت‌هاب مأمن کدهای ماست", false);
    }


    @Test
    public void hasPersian_WithPersianPhrase_ReturnsTrue() {
        assert StringUtils.hasPersian("این یک متن فارسی است؟");
        assert StringUtils.hasPersian("هل هذا نص فارسي؟");
        assert StringUtils.hasPersian("آیا سیستم میتواند گزینه های دیگری را به اشتباه به عنوان متن فارسی تشخیص دهد؟");
        assert StringUtils.hasPersian("This text includes فارسی");
        assert StringUtils.hasPersian("Это персидский س текст?");
        assert StringUtils.hasPersian("أكد رئيس اللجنة العسكرية الممثلة لحكومة الوفاق أراضي البلاد.");
        assert StringUtils.hasPersian("github مأمن کدهای ماست", true);
    }

    @Test
    public void hasPersian_WithNonPersianPhrase_ReturnsFalse() {
        assert !StringUtils.hasPersian("Lorem Ipsum Test");
        assert !StringUtils.hasPersian("これはペルシア語のテキストですか");
        assert !StringUtils.hasPersian("Это персидский текст?");
        assert !StringUtils.hasPersian("这是波斯文字吗?");
        assert !StringUtils.hasPersian("");
    }
}
