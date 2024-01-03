import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class mouselisternerinterface {
  public static void main(String[] args) {
    new MyFrame();
  }
}

class MyFrame extends JFrame implements MouseInputListener{

  JLabel label;
  
  MyFrame(){
   
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setSize(500,500);
   this.setLayout(null);

   label = new JLabel();
   label.setBounds(0,0,100,100);
   label.setBackground(Color.red);
   label.setOpaque(true);
   label.addMouseListener(this);
   //this.addMouseListener(this);entire frame is going to respond for mouse events 

   this.add(label);
   this.pack();
   this.setVisible(true);
  
   
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    //Invoked when the mouse button has been clicked (pressed and released) on a component 
    System.out.println("You clicked on mouse");
    label.setBackground(Color.yellow);
  }

  @Override
  public void mousePressed(MouseEvent e) {
    //Invoked when a mouse button has been pressed on a component 
    System.out.println("You pressed the mouse");
    label.setBackground(Color.green);
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // Invoked when a mouse button has been released on a component
    System.out.println("You released the mouse"); 
    label.setBackground(Color.blue);
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    //Invoked when a mouse enters a component   
   //System.out.println("You entered a component");  
  }

  @Override
  public void mouseExited(MouseEvent e) {
    // Invoked when a mouse exits a component 
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    // Invoked when a mouse is dragged on a component 
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    // Invoked when a mouse is moved away from the  component 
  }
}
