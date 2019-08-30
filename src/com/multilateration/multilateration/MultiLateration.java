package com.multilateration.multilateration;

import javax.swing.*;
import java.awt.*;

public class MultiLateration extends JFrame {

    public MultiLateration() {
        // Установка заголовка окна
        setTitle("MultiLateration");

        // Установка главного фрейма программы в максимальный размер
        setExtendedState(Frame.MAXIMIZED_BOTH);
        HelloWorldPanel panel = new HelloWorldPanel();
        add(panel);
    }

    class HelloWorldPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.drawString("Hello, Wold!", 75, 100);
        }
    }

}
