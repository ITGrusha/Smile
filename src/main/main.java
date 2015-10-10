package main;

import javax.swing.*;
import forms.myFrame;

public class main {

    public static void main(String[] args) {
        System.out.println("Это моя первая программа на java!");
        myFrame mainFrame = new myFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.show();
    }
}
