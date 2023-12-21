//progess bar = Visual aid to let user know than an operation is progressed 

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.Color;

public class progressbar{
  public static void main(String[] args) {
    ProgressBarDemo demo = new ProgressBarDemo();
  }
}

class ProgressBarDemo{
  
  JFrame frame = new JFrame();
  JProgressBar bar = new JProgressBar(0,500);

  ProgressBarDemo(){
   
    bar.setValue(0);
    bar.setBounds(40, 250, 400, 50);//because we are using no layout manager
    bar.setStringPainted(true);//sets percentange to the progress bar
    bar.setForeground(Color.red);
   

   frame.add(bar);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(500,500);
   frame.setLayout(null);
   frame.setVisible(true);

   fill();
  }

  public void fill(){
    //bar.setValue(10);

    int counter = 0;

    while(counter<=100){
      bar.setValue(counter);
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
      counter +=10;
    }
    bar.setString("Done! :)");
    
  }
}