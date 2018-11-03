/*
 * The buttons below the screen during a fight
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WalkingButtons extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public WalkingButtons()
    {
        super();
        this.setSize(500, 400);
        this.setVisible(true);

        this.button1 = new JButton("Go");
        button1.setBounds(25,100,100,30);  
        this.button1.addActionListener(this);
        
        this.button2 = new JButton("Run Away");
        button2.setBounds(125,100,100,30);  
        this.button2.addActionListener(this);
        
        this.button3 = new JButton("Up");
        button3.setBounds(125,150,75,30);  
        this.button3.addActionListener(this);
        
        this.button4 = new JButton("Down");
        button4.setBounds(125,250,75,30);  
        this.button4.addActionListener(this);
        
        this.button5 = new JButton("Left");
        button5.setBounds(175,200,75,30);  
        this.button5.addActionListener(this);
        
        this.button6 = new JButton("Right");
        button6.setBounds(75,200,75,30);  
        this.button6.addActionListener(this);
        
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.setLayout(null);  
        this.setVisible(true);  
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
    }

    public static void main(String[] args) {
        WalkingButtons calc = new WalkingButtons();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            if(button3.isVisible() == true) {
                button3.setVisible(false);
                button4.setVisible(false);
                button5.setVisible(false);
                button6.setVisible(false);
            }
            else {
                button3.setVisible(true);
                button4.setVisible(true);
                button5.setVisible(true);
                button6.setVisible(true);
            }
            
        }
        if(e.getSource() == button2)this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        if(e.getSource() == button3);
    }
 

}
