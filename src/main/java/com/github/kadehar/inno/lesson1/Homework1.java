package com.github.kadehar.inno.lesson1;

public class Homework1 {

    public static void main(String[] args) {
        /*
        Метод isEmpty() возвращает true, если строка не содержит символов и
        длина строки == 0
         */
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();
        System.out.printf("Строка emptyString(\"%s\") пустая? - %b\n",
                emptyString, isEmpty);

        /*
        Метод isBlank() возвращает true, если строка не содержит символов или
        содержит только символы пробела
         */
        String blankString = " ";
        boolean isBlank = blankString.isBlank();
        System.out.printf("Строка blankString(\"%s\") пустая? - %b\n",
                blankString, isBlank);

        /*
        Метод substring() возвращает подстроку исходной строки:
         - начиная с n символа и до конца строки
         - начиная с n символа и заканчивая m-1 символом строки
         */
        String originalString = "Синхрофазатрон";
        String firstSubstringResult = originalString.substring(4);
        String secondSubstringResult = originalString.substring(3, 11);
        System.out.printf("Первый вариант подстроки для \"%s\" равен \"%s\"\n",
                originalString, firstSubstringResult);
        System.out.printf("Второй вариант подстроки для \"%s\" равен \"%s\"\n",
                originalString, secondSubstringResult);

        /*
        Метод indexOf возвращает индекс первого вхождения подстроки в строку
         */
        String name = "Павел";
        String searchStringForIndexOf = "ав";
        int resultIndex = name.indexOf(searchStringForIndexOf);
        System.out.printf("В строке \"%s\" индекс подстроки \"%s\" равен %d\n",
                name, searchStringForIndexOf, resultIndex);

        /*
        Метод lastIndexOf возвращает индекс последнего вхождения подстроки в строку
         */
        String surname = "Платонович";
        String searchStringForLastIndexOf = "о";
        int resultLastIndex = surname.lastIndexOf(searchStringForLastIndexOf);
        System.out.printf("В строке \"%s\" последний индекс подстроки \"%s\" равен %d\n",
                surname, searchStringForLastIndexOf, resultLastIndex);

        /*
        Метод toLowerCase создаёт строку, содержащую все символы в нижнем регистре
        Метод toUpperCase создаёт строку, содержащую все символы в верхнем регистре
         */
        String lastname = "Петров";
        String lowercaseLastname = lastname.toLowerCase();
        String uppercaseLastname = lastname.toUpperCase();
        System.out.printf("Строка \"%s\" в lower case - \"%s\"; в upper case - \"%s\"\n",
                lastname, lowercaseLastname, uppercaseLastname);

        /*
        Метод replace изменяет каждую подстроку на заданную и возвращает новую строку
         */
        String originalUsername = "Kaleidoskop";
        String replaceString = "korp";
        String replaceableString = "skop";
        String replaceResult = originalUsername.replace(replaceableString, replaceString);
        System.out.printf("Для строки \"%s\" при замене \"%s\" на \"%s\" результат \"%s\"\n",
                originalUsername, replaceableString, replaceString, replaceResult);

        /*
        Метод startsWith возвращает true, если строка начинается с указанной подстроки
        Метод endsWith возвращает true, если строка заканчивается на указанную подстроку
         */
        String word = "Refrigerator";
        String prefix = "ref";
        String suffix = "tor";
        boolean isStartsWith = word.startsWith(prefix);
        boolean isEndsWith = word.endsWith(suffix);
        System.out.printf("Строка \"%s\" начинается с префикса \"%s\"? - %b\n",
                word, prefix, isStartsWith);
        System.out.printf("Строка \"%s\" заканчивается суффиксом \"%s\"? - %b\n",
                word, suffix, isEndsWith);

        /*
        Метод repeat возвращает строку, значение которой повторяется N раз
         */
        String text = "Word";
        String repeatedText = text.repeat(3);
        System.out.printf("Строка \"%s\" при повторении 3 раза равна \"%s\"\n",
                text, repeatedText);

        /*
        Метод contains возвращает true, если искомая подстрока полностью содрежится в строке
         */
        String songName = "Big City Life";
        String containableString = "Life";
        boolean isContains = songName.contains(containableString);
        System.out.printf("Строка \"%s\" содержит \"%s\"? - %b\n",
                songName, containableString, isContains);

        /*
        Метод concat создаёт новую строку, составленную из двух объединенных между собой строк
         */
        String left = "Left part";
        String right = "Right part";
        String concatResult = left.concat(right);
        System.out.printf("\"%s\".concat(\"%s\") = \"%s\"\n",
                left, right, concatResult);

        /*
        Метод trim возвращает строку, удаляя все пробелы перед и после символов
         */
        String nonTrimmedText = "   trim me   ";
        String trimResult = nonTrimmedText.trim();
        System.out.printf("Строка \"%s\" после trim равна \"%s\"\n",
                nonTrimmedText, trimResult);

        /*
        Метод equals проверяет, что две строки полностью равны между собой
         */
        String firstCharacterClass = "Warlord";
        String secondCharacterClass = "Warlord";
        boolean isEquals = firstCharacterClass.equals(secondCharacterClass);
        System.out.printf("\"%s\".equals(\"%s\") - %b",
                firstCharacterClass, secondCharacterClass, isEquals);
    }
}
