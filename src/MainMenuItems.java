import javax.swing.*;
import java.util.Objects;

public class MainMenuItems {
    public static void main(String[] args) {

        String case1 = JOptionPane.showInputDialog("Введите тернарное условие в виде: (условие) ? выражение1 : выражение2");
        String case2 = JOptionPane.showInputDialog("Введите обычное условие");
        String case3 = JOptionPane.showInputDialog("Хотите ли Вы уйти с урока пораньше?");
        if (Objects.equals(case3, "Да") || Objects.equals(case3, "да") || Objects.equals(case3, "Yes") || Objects.equals(case3, "yes"))
            JOptionPane.showMessageDialog(null, "Я от тебя такого не ожидал...");
        JOptionPane.showMessageDialog(null, String.format("Ваше тернарное условие: %s%nВаше обычное условие: %s%nВаш ответ: %s, (правильный ответ Нет)", case1, case2, case3));
    }
}

