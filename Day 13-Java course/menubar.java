import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubar {
  public static void main(String[] args) {
    new MyFrame();
  }
}

class MyFrame extends JFrame implements ActionListener{
   JMenuBar menuBar;
   JMenu fileMenu,editMenu,helpMenu;
   JMenuItem loadItem,saveItem,exitItem;
   ImageIcon loadIcon,saveIcon,exitIcon;

  
  MyFrame(){
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setSize(500,500);
   this.setLayout(new FlowLayout());

   loadIcon = new ImageIcon("image.png");
   saveIcon = new ImageIcon("image.png");
   exitIcon = new ImageIcon("image.png");


  menuBar = new JMenuBar();

  fileMenu = new JMenu("File");
  editMenu = new JMenu("Edit");
  helpMenu = new JMenu("Help");

  loadItem = new JMenuItem("Load");
  saveItem = new JMenuItem("Save");
  exitItem = new JMenuItem("Exit");

  loadItem.addActionListener(this);
  saveItem.addActionListener(this);
  exitItem.addActionListener(this);
  

  loadItem.setIcon(loadIcon);
  saveItem.setIcon(saveIcon);
  exitItem.setIcon(exitIcon);

  //setMnemonic underline the 
  fileMenu.setMnemonic(KeyEvent.VK_F);
  editMenu.setMnemonic(KeyEvent.VK_E);
  helpMenu.setMnemonic(KeyEvent.VK_H);

  loadItem.setMnemonic(KeyEvent.VK_L);//L for load
  saveItem.setMnemonic(KeyEvent.VK_S);//S for load
  exitItem.setMnemonic(KeyEvent.VK_E);//E for exit 

  fileMenu.add(loadItem);
  fileMenu.add(saveItem);
  fileMenu.add(exitItem);

   menuBar.add(fileMenu);
   menuBar.add(editMenu);
   menuBar.add(helpMenu);
   this.setJMenuBar(menuBar);
   this.setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    
    if(e.getSource()==loadItem){
      System.out.println("+beep boop+ you loaded a file");
    }
    if(e.getSource()==saveItem){
      System.out.println("+beep boop+ you saveed a file");
    }
    if(e.getSource()==exitItem){
      System.exit(0);
    }
  }
  
}
