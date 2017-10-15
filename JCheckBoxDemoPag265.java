import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class JCheckBoxDemoPag265
{
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("My JFrame Title");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        myJFrame.setLayout(new FlowLayout());
        
        JCheckBox myJCheckBoxWhite = new JCheckBox("White");
        
        JCheckBox myJCheckBoxBlack = new JCheckBox("Black");
        
        JCheckBox myJCheckBoxYellow = new JCheckBox("Yellow");
        
        myJFrame.add(myJCheckBoxWhite);
        
        myJFrame.add(myJCheckBoxBlack);
        
        myJFrame.add(myJCheckBoxYellow);
        
        myJFrame.setVisible(true);
        
        
    }
   
}
