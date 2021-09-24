package Lab5;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    Application() {
        super("SHREEEKk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\Александр\\Desktop\\JavaLab\\src\\Lab5\\312.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jLabel);
        jLabel.setIcon(imageIcon);

        add(jLabel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}