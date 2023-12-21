// JFileChosser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class selectfile {
  public static void main(String[] args) {
    new MyFrame();
  }

  public static File getSelectedFile() {
    return null;
  }
}

class MyFrame extends JFrame implements ActionListener{
  JButton button ;

  MyFrame(){
    
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setSize(500,500);
   this.setLayout(new FlowLayout());
   
   button = new JButton("Select File");
   button.addActionListener(this);

   this.add(button);
   this.pack();
   this.setVisible(true);
  

  }
  
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
      
      JFileChooser fileChooser = new JFileChooser();
       
      //System.out.println(fileChooser.showOpenDialog(null));//select file to open and returns interger vlaue 
      int response =fileChooser.showOpenDialog(null);
      //int response =fileChooser.showSaveDialog(null);
      if(response ==  JFileChooser.APPROVE_OPTION){
        File file = new File(selectfile.getSelectedFile().getAbsolutePath());
        System.out.println(file);
      }
    }  
  }
  
}