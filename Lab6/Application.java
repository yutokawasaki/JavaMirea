package Lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame {

    JTextArea text = new JTextArea("SOME TEXT", 10, 30);

    Application() {
        super("Lab6");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        JPanel content = new JPanel();
        content.add(new JScrollPane(text));
        setContentPane(content);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Цвет");
        JMenuItem item1 = new JMenuItem("Синий");
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setForeground(Color.BLUE);
            }
        });
        JMenuItem item2 = new JMenuItem("Красный");
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setForeground(Color.RED);
            }
        });
        JMenuItem item3 = new JMenuItem("Черный");
        item3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setForeground(Color.BLACK);
            }
        });
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);

        JMenu menu2 = new JMenu("Шрифт");
        JMenuItem item4 = new JMenuItem("Times New Roman");
        item4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            }
        });
        JMenuItem item5 = new JMenuItem("MS Sans Serif");
        item5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 12));
            }
        });
        JMenuItem item6 = new JMenuItem("Courier New");
        item6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.setFont(new Font("Courier New", Font.PLAIN, 12));
            }
        });
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);

        menuBar.add(menu1);
        menuBar.add(menu2);

        setJMenuBar(menuBar);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }

}
