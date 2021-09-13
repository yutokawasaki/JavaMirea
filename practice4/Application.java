package practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Application extends JFrame
{
    JButton RMbutton = new JButton("Real Madrid");
    JButton ACMbutton = new JButton("AC Milan");
    JLabel result = new JLabel("Result: 0 X 0", JLabel.CENTER);
    JLabel Lscorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", JLabel.CENTER);
    int RM = 0;
    int ACM = 0;
    public Application()
    {
        super("Application");
        setSize(500,300);
        setLayout(new BorderLayout());
        add(RMbutton, BorderLayout.WEST);
        add(ACMbutton, BorderLayout.EAST);
        add(result, BorderLayout.CENTER);
        add(Lscorer, BorderLayout.NORTH);
        add(winner, BorderLayout.SOUTH);
        RMbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                RM += 1;
                result.setText("Result: "+ RM + " X " + ACM);
                Lscorer.setText("Last Scorer: Real Madrid");
                if (RM > ACM) {winner.setText("Winner: Real Madrid");}
                else {if (RM < ACM){winner.setText("Winner: AC Milan");} else {winner.setText("Winner: DRAW");}}
            }
        });
        ACMbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                ACM += 1;
                result.setText("Result: "+ RM + " X " + ACM);
                Lscorer.setText("Last Scorer: AC Milan");
                if (RM > ACM) {winner.setText("Winner: Real Madrid");}
                else {if (RM < ACM){winner.setText("Winner: AC Milan");} else {winner.setText("Winner: DRAW");}}
            }
        });
    }
    public static void main(String[]args)
    {
        new Application().setVisible(true);
    }
}