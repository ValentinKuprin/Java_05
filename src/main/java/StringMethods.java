public class StringMethods {
    /** Видео1: https://youtu.be/78ZAzmNbUYQ?t=173
     Методы isEmpty(), length(), trim(), replace()


     Написать метод removeSpaces(), который принимает на вход строку.
     Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце строки.
     Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
     Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
     Если пробелов не было, вернуть сообщение “Пробелов не было”.
     Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”.

     Test Data:
     “    Red Rover School   “ → “Лишние пробелы удалены”
     “Red Rover School“ → “Пробелов не было”
     “” → “Строка пустая” */

    public String removeSpaces(String str) {
        if (!str.isEmpty()) {
            String newStr = str.trim();
            if (!(str.equals(newStr))) {

                return "Лишние пробелы удалены";
            } else {

                return  "Пробелов не было";
            }
        }

        return "Строка пустая";
    }

    /** Написать алгоритм removeAllAs().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
     то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     Test Data:
     “    Red Rover School   “ →  “Red Rover School“
     “panda   “ → “pnd”
     “taramasalata” → “trmslt” */

    public String removeAllAs(String str) {
        if (!str.isEmpty()) {

            return str = str.trim().replace("a", "");
        }
        return "";
    }

    /** Написать алгоритм removeAllZeros().
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
     Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
     строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.
     Test Data:
     “3504209706040000 “ →  “35429764“
     “0000000111“ → “111”   */

    public String removeAllZeros(String str){
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

    /** Написать алгоритм removeAllSpaces.
     С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод
     удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     Test Data:
     “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     “p a     n   d a   “ → “panda” */

     }
