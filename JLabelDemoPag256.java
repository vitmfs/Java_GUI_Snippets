import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemoPag256
{
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("Title of JFrame");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel myJLabel = new JLabel("Write your name: ");
        
        myJFrame.add(myJLabel);
        
        myJFrame.setVisible(true);
        
        
        
        
    }
    
}
