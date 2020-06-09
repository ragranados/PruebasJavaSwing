package com.company;

import com.company.Test.Test;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");

        //Test prueba = new Test();

        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().getContainerMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
