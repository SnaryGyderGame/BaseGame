/*
 * The buttons below the screen during a fight
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class fightingButtons extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public fightingButtons()
    {
        super();
        this.setSize(500, 400);
        this.setVisible(true);

        this.button1 = new JButton("Fight");
        button1.setBounds(25,100,100,30);  
        this.button1.addActionListener(this);
        
        this.button2 = new JButton("Run Away");
        button2.setBounds(125,100,100,30);  
        this.button2.addActionListener(this);
        
        this.button3 = new JButton("HW free weekend");
        button3.setBounds(50,150,150,30);  
        this.button3.addActionListener(this);
        
        this.button4 = new JButton("Give tiger time");
        button4.setBounds(200,150,150,30);  
        this.button4.addActionListener(this);
        
        this.button5 = new JButton("Give puppy");
        button5.setBounds(125,200,150,30);  
        this.button5.addActionListener(this);
        
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.setLayout(null);  
        this.setVisible(true);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
    }

    public static void main(String[] args) {
        fightingButtons calc = new fightingButtons();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(button3.isVisible() == true) {
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
            }
            else {
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
            }
            
        }
        if(e.getSource() == button2)this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        if(e.getSource() == button3);
    }
 

}
