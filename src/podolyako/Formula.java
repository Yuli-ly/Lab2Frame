package podolyako;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

public class Formula extends JFrame {
    private JButton button1 = new JButton("Вычислить"); // создаем кнопки
    private JButton button2 = new JButton("Очистить");
    private JButton button3 = new JButton("M+");
    private JButton button4 = new JButton("MC");
    private JTextField input_x = new JTextField(""); // создаем текстовое поле для ввода
    private JTextField input_y = new JTextField("");
    private JTextField input_z = new JTextField("");
    private JTextField result = new JTextField("");
    private JLabel label1 = new JLabel("  Введите х:"); // создаем подписи к текстовым полям
    private JLabel label2 = new JLabel("  Введите y:");
    private JLabel label3 = new JLabel("  Введите z:");
    private JLabel label4 = new JLabel("  Результат:");
    private JRadioButton radio1 = new JRadioButton("Формула 1"); // создаем радиокнопки
    private JRadioButton radio2 = new JRadioButton("Формула 2");
    Double resultat = 0.0;
    Double sum = 0.0;



}