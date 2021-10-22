package com.company;

import com.sun.deploy.util.StringUtils;

import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opt = 0;

        while (opt != 4) {

            opt = showMenu();
            switch (opt) {
                case 1:
                    System.out.print("Введите тернарное условие в виде: (условие) ? выражение1 : выражение2\n");
                    String s = input.next();
                    System.out.println("\nВаше тернарное условие: " + s);
                    break;
                case 2:
                    System.out.print("Введите обычное условие: ");
                    String t = input.next();
                    System.out.println("\nВаше обычное условие: " + t);
                    break;
                case 3:
                    System.out.print("Хотите ли Вы уйти с урока пораньше?\nОтветьте: Да или Нет, Yes или No - ");
                    String r = input.next();
                    if (Objects.equals(r, "Yes") || Objects.equals(r, "yes") || Objects.equals(r, "Да") || Objects.equals(r, "да") || Objects.equals(r, "YES") || Objects.equals(r, "ДА")) {
                        for (int i = 0; i < 1; i++) {
                            i--;
                            System.out.println("Is not true, ERROR!!! Не правильный ответ, ОШИБКА!!! Is not true, ERROR!!! Не правильный ответ, ОШИБКА!!! Is not true, ERROR!!! Не правильный ответ, ОШИБКА!!! Is not true, ERROR!!!");
                        }

                    } else if (Objects.equals(r, "No") || Objects.equals(r, "no") || Objects.equals(r, "Нет") || Objects.equals(r, "нет")) {
                        System.out.println("\nКРАСАВЧИК! Javы много не бывает!");
                        return;
                    } else {
                        System.out.println("\nНаписано же: Да или Нет, Yes или No. Давай по новой!");
                        break;
                    }
                case 4:
                    System.out.println("\nСпасибо за внимание. До встречи.");
                    return;
                default:
                    System.out.print("Простите, но такого пункта меню нет, попробуйте еще раз\n");

            }

        }

    }


    public static int showMenu() {

        int opt = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\n--------------");
        System.out.println("Главное меню:");
        System.out.println("--------------");
        System.out.println("1.Ввести тернарное условие");
        System.out.println("2.Ввести обычное условие");
        System.out.println("3.Ответить на вопрос");
        System.out.println("4.Выход");
        System.out.println("--------------");
        System.out.println("Введите номер пункта меню:");
        opt = keyboard.nextInt();
        return opt;

    }
}
