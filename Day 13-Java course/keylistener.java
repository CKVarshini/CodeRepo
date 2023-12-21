import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keylistener {
  public static void main(String[] args) {
    new MyFrame();
  }
}

class MyFrame extends JFrame implements KeyListener{

  ImageIcon imageIcon;
  JLabel label;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(null);

    imageIcon = new ImageIcon("download.png");

    label = new JLabel();
    label.setBounds(0,0,100,100);
    label.setBackground(Color.red);
    label.setOpaque(true);

    this.getContentPane().setBackground(Color.black);
    this.add(label);
    this.pack();
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // KeyTyped = Invoked when a key is typed.Uses keychar,char object
     switch (e.getKeyChar()) {
      case 'a': label.setLocation(label.getX()-10,label.getY());
                 break;
      
      case 'w' : label.setLocation(label.getX(),label.getY()-10);
                 break;
      
      case 's' :label.setLocation(label.getX(),label.getY()+10);
                 break;

      case 'd' :label.setLocation(label.getX()+10,label.getY());
                 break;
     }
  }

  @Override
  public void keyPressed(KeyEvent e) {
    //KeyPressed = Invokeed when a physical key is pressed down,Uses KeyCode,int output
     switch (e.getKeyCode()) {
      case 37: label.setLocation(label.getX()-10,label.getY());//move t left by 10
                 break;
      
      case 38 : label.setLocation(label.getX(),label.getY()-10);//moving Up by 10 pixel
                 break;
      
      case 39 :label.setLocation(label.getX(),label.getY()+10);//move to the right by 10
                 break;

      case 40 :label.setLocation(label.getX()+10,label.getY());//square will move down 
                 break;
     }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    //keyReleased = Called whenever a button is released
    System.out.println("You released Key char : " +e.getKeyChar());
    System.out.println("You released Key code : " +e.getKeyCode());
  }
}