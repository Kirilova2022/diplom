package ru.netology.data;

import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
public class Data {

    @Value
    public static class CardData {
        String number;
        String month;
        String year;
        String holder;
        String cvc;
    }

    public static CardData getCorrectlyCompletedApprovedCardForm() {
        return new CardData("4444 4444 4444 4441", "10", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getCorrectlyCompletedDeclinedCardForm() {
        return new CardData("4444 4444 4444 4442", "10", "23", "ZAIZEVA DANIIL", "899");
    }

    public static CardData getFormWithAllEmptyFields() {
        return new CardData("", "", "", "", "");
    }

    //For Number Card Field

    public static CardData getFormWithEmptyFieldNumberCard() {
        return new CardData("", "10", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithIncorrectNumberCard() {
        return new CardData("4444 4444 4444 5865", "10", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithDeficientNumberCard() {
        return new CardData("4444 4444 4444 49", "10", "23", "ZAIZEV DANIIL", "899");
    }

    //For Month Field

    public static CardData getFormWithEmptyFieldMonth() {
        return new CardData("4444 4444 4444 4441", "", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithIncorrectFieldMonthZero() {
        return new CardData("4444 4444 4444 4441", "00", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithInvalidMonth() {
        return new CardData("4444 4444 4444 4441", "15", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithCurrentDate() {
        return new CardData("4444 4444 4444 4441", "12", "23", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithIncorrectFieldMonthOneNumber() {
        return new CardData("4444 4444 4444 4441", "8", "23", "ZAIZEV DANIIL", "899");
    }

    //For Year Field

    public static CardData getFormWithEmptyYear() {
        return new CardData("4444 4444 4444 4441", "10", "", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithIncorrectFieldYearOneNumber() {
        return new CardData("4444 4444 4444 4441", "10", "2", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithExpiredYear() {
        return new CardData("4444 4444 4444 4441", "10", "19", "ZAIZEV DANIIL", "899");
    }

    public static CardData getFormWithInvalidYear() {
        return new CardData("4444 4444 4444 4441", "10", "29", "ZAIZEV DANIIL", "899");
    }

    //For Holder Field

    public static CardData getFormWithHolderRu() {
        return new CardData("4444 4444 4444 4441", "10", "23", "ЗАЙЦЕВ ДАНИИЛ", "152");
    }

    public static CardData getFormWithHolderZh() {
        return new CardData("4444 4444 4444 4441", "10", "23", "彼得 罗", "899");
    }

    public static CardData getFormWithEmptyFieldHolder() {
        return new CardData(""4444 4444 4444 4441", "10", "23", "", "899");
    }

    public static CardData getFormWithNumbersInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "01", "24", "4444 4444 4444 4441", "899");
    }

    public static CardData getFormWithShortNameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "10", "23", "Z", "899");
    }

    public static CardData getFormWithLongNameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "10", "23", "ZZZZZZZZ", "899");
    }

    public static CardData getFormWithDoubleSurnameInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "10", "23", "ZAICEV-ORLOV DANIIL", "899");
    }

    public static CardData getFormWithNumbersAndPunctuationMarksInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "10", "23", "ZAICEV\\.0", "030");
    }

    public static CardData getFormWithManySpaceInFieldHolder() {
        return new CardData("4444 4444 4444 4441", "01", "24", "ZAICEV    DANIIL ", "999");
    }

    //For CVC Field

    public static CardData getFormWithEmptyFieldCvc() {
        return new CardData("4444 4444 4444 4441", "10", "29", "ZAIZEV DANIIL", "");
    }

    public static CardData getFormWithIncorrectCvc() {
        return new CardData("4444 4444 4444 4441", "10", "29", "ZAIZEV DANIIL", "5");
    }
}

