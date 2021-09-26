package com.company;

import javax.swing.*;

public class JOptionSample {
    public static void main(String[] args) {
/*
        What is your name? - Hello, name!
        How old are you? - You are 30 years old.
        Enter your height. - You are 170 cm tall.
       */

        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you??"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height."));

        //JOptionPane.showMessageDialog(null, "Hello, "+ name+"!");  //output my name
        JOptionPane.showMessageDialog(null, String.format("Hello, %s!%nYou are %d years old%nYou are %f cm tall.", name, age, height));   //output all my parametres
    }
}
