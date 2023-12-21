import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class selectcolor {
  public static void main(String[] args) {
    new MyFrame();
  }
}

class MyFrame extends JFrame implements ActionListener{
    
  JButton button;
  JLabel label ;
  private Color color;

  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());

    button = new JButton("Pick a color");
    button.addActionListener(this);

    label = new JLabel();
    label.setBackground(Color.white);
    label.setText("Hi Friend :)");
    label.setOpaque(true);
 

    this.add(button);
    this.add(label);
    this.pack();
    this.setVisible(true);
  }
  
  
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
      JColorChooser  colorChooser = new JColorChooser();
      
      Color color = JColorChooser.showDialog(null,"Pick a color....I guess",Color.black);    }
      label.setForeground(color);
      label.setBackground(color);
    
    }
  
}