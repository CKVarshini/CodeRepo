import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class draganddropimage {
  public static void main(String[] args) {
    MyFrame frame = new MyFrame();

  }
}

class MyFrame extends JFrame{
  
  DragPanel dragPanel = new DragPanel();

  MyFrame(){

    this.add(dragPanel);
    this.setTitle("Drag and Drop");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,600);
    this.setLayout(null);
    this.pack();
    this.setVisible(true);

  }
}

class DragPanel extends JPanel{
 
  ImageIcon image = new ImageIcon("load.png");
  final int WIDTH = image.getIconWidth();
  final int HEIGHT = image.getIconHeight();
  Point imageCorner;
  Point prevPt; // prevPt = previous point


  DragPanel(){
    imageCorner = new Point(0,0);
    ClickListerner clickListerner = new ClickListerner();
    DragListener dragListener = new DragListener();
    this.addMouseListener(clickListerner);
    this.addMouseMotionListener(dragListener);

  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    image.paintIcon(this, g,(int) imageCorner.getX(),(int) imageCorner.getY());
  }

  private class ClickListerner extends MouseAdapter{
    
    public void mousePressed(MouseEvent e){
      prevPt = e.getPoint();//this will update the previos point to where ever we click 
    }
  }

  private class DragListener extends MouseMotionAdapter{
    public void mouseDragged(MouseEvent e){

      Point currePoint = e.getPoint();

      imageCorner.translate(
        (int)(currePoint.getX() - prevPt.getX()),(int)(currePoint.getY() - prevPt.getY()));
        prevPt = currePoint;
        repaint();
    }
  }
}

