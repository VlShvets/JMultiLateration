package com.multilateration;

import com.multilateration.multilateration.MultiLateration;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MultiLateration multiLateration = new MultiLateration();
                multiLateration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                multiLateration.setVisible(true);
            }
        });
    }
}
