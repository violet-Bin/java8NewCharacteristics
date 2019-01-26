package com.java8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: jiangjiabin
 * @Description:
 * Lambda表达式的基本结构:
 *      (param1, param2, param3) -> {}
 * Lambda表达式的基本语法：
 *      (argument) -> (body)
 *   /  (arg1, arg2...) -> {body}
 *   /  (type1 arg1, type2 arg2...) -> {body}
 * @Date: Create in 1:47 2019/1/27
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jframe = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");

        jButton.addActionListener(event -> {
            System.out.println("Button Pressed!");
            System.out.println("hello world");
            System.out.println("executed");
        });

//        jButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Pressed!");
//                System.out.println("hello world");
//                System.out.println("executed");
//            }
//        });

        jframe.add(jButton);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
