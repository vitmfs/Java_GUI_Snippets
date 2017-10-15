import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.*;

public class JButtonDemoPag262
{
    public static void main(String[] args) {
        
        JFrame myFrame = new JFrame();
        
        myFrame.setTitle("Title of JFrame");
        
        myFrame.setSize(350, 150);
        
        myFrame.setLocation(50, 50);
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton myJButton = new JButton("OK");
        
        myFrame.add(myJButton);
        
        myFrame.setVisible(true);
        
        
        
        
        
    }
    
    
    
}
