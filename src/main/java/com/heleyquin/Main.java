package com.heleyquin;

import com.heleyquin.ui.ListUser;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(450, 190, 1014, 597);
        Home jPanel = new Home();
        jPanel.init();
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
    }
}
