
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;

public class BasicDraw {
  JButton button1;
  JButton button2;
  JButton button3;
  public static void main(String[] args) {
      BasicDraw hi = new BasicDraw();    
  }

  BasicDraw() {
    JFrame frame = new JFrame();
    frame.setSize(800, 800);
    ImageIcon image = new ImageIcon("calculator.png");
    button1 = new JButton(image);
    button1.setBounds(600,200,125,148);
    frame.add(button1);
    ImageIcon image2 = new ImageIcon("OfficePen.png");
    button2 = new JButton(image2);
    button2.setBounds(250,100,75,75);
    frame.add(button2);
    ImageIcon image3 = new ImageIcon("folder.png");
    button3 = new JButton(image3);
    button3.setBounds(350,150,100,148);
    frame.add(button3);
    frame.add(new MyComponent());

    
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            
            
        }
        if(e.getSource() == button2)
        if(e.getSource() == button3)
        {
           
        }
}

class MyComponent extends JComponent {
  private JButton button1;
  public void paint(Graphics g) {   
    ImageIcon icon = new ImageIcon("desk.png");
    g.drawImage(icon.getImage(), 0 , 0, 800, 500, null);
  }
  

    }
}