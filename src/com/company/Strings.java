package com.company;

public class Strings {
    public static void main(String[] args) {
        String s = "Strings examples";
        //Получить символ по его номеру, а также номер символа в кодовой таблице UTF-8
        char c = s.charAt(0);
        //System.out.println(s);
        System.out.printf("Symbol:%c, number:%d%n", c, (int) c);

        //Собрать строку из символов
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        s = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8;
        System.out.println(s);

        char[] chars = {'2', '\u00B7', '\u03C0', '1', '8'};
        String stroke = new String(chars);
        System.out.println(stroke);

        //Сравнение строк.
        System.out.println('a' - 'b');

        String s1 = "", s2 = "First";  //сравнение строк
        System.out.println(s1.compareTo(s2));

        //Конкатенация строк
        s1 += s2;
        System.out.println(s1);
        s1 = s1.concat(s2);
        System.out.println(s1);

 /*       //Проверить, содержит ли строковое значение только цифры
        s = "123s";
        System.out.println(isContainsOnlyDigits(s));*/

        //Заменить символ в строке (точку на вопросительный знак)
        s = "Why is garbage collection necessary in Java.";
        int pos = s.indexOf('.');
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(pos,'?');
        System.out.println(sb);

        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine.";
        String result = s.replace("%s", "JAVA");
        System.out.println(result);

        //Извлечь из строки подстроки JVM и JRE
        s = "JDK vs JRE vs JVM";
        result = s.substring(s.length()-3);
        System.out.println(result);
        result = s.substring(7,10);
        System.out.println(result);



    }

    private static boolean isContainsOnlyDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

}
