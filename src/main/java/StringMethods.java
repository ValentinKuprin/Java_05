public class StringMethods {
    /**
     * Видео1: https://youtu.be/78ZAzmNbUYQ?t=173
     * Методы isEmpty(), length(), trim(), replace()
     * <p>
     * <p>
     * Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     * Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public String removeSpaces(String str) {
        if (!str.isEmpty()) {
            String newStr = str.trim();
            if (!(str.equals(newStr))) {

                return "Лишние пробелы удалены";
            } else {

                return "Пробелов не было";
            }
        }

        return "Строка пустая";
    }

    /**
     * Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     * то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

    public String removeAllAs(String str) {
        if (!str.isEmpty()) {

            return str = str.trim().replace("a", "");
        }
        return "";
    }

    /**
     * Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
     * строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    public String removeAllZeros(String str) {
        if (!str.isEmpty()) {
            String newStr = str.replace(" ", "").replace("0", "");
            if (str.equals(newStr)) {

                return "This is a valid string";
            } else {

                return newStr;
            }
        }
        return "";
    }

    /**
     * Написать алгоритм removeAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод
     * удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    public String removeAllSpaces(String str) {
        if (!str.isEmpty()) {
            return str.replace(" ", "");
        }
        return "";
    }

    /** Видео2: https://www.youtube.com/watch?v=thzfsPEYXfI
     Методы
     charAt(), concat(), contains(), substring(), toLowerCase(),  toUpperCase()
     Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A. Итоговый результат должен строится с помощью метода из видео 2.
     Test Data:
     “Abracadabra” → “5, 6”
     “Homenum Revelio” → “0, 15”
     “3 tarAmasAlatA” → “6, 8”  */

    public String countAs(String str) {
        if (!str.isEmpty()) {
            int countLetters = 0;
            int countOther = 0;
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    countLetters++;
                } else {
                    countOther++;
                }
            }

            return countLetters + result.concat(", ") + countOther;
        }

        return "";
    }

    /** Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
     Test Data:
     “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions.
     Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use,
     although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun
     to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.” → true

     “99 little bugs in a code.
     99 little bugs in a code.
     Take one down, and patch it around.
     235 critical bugs in the code.” → false */

    public boolean countJava(String str) {
        if (!str.isEmpty()) {
            if (str.contains("Java")) {

                return true;
            }else{

                return false;
            }
        }
        return false;
    }

    /** Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это слово “обернуто” в кавычки:
     Test Data:
     “Abracadabra” →  ““Abracadabra”” */

    public String insertQuotes(String str) {
        if (!str.isEmpty()) {

            return "\"" + str + "\"";
        }
        return "";
    }

}
