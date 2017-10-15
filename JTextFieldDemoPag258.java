import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class JTextFieldDemoPag258
{
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("Title of JFrame");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setLayout(new FlowLayout());
        
        JLabel myJLabel = new JLabel("Write your name: ");
        
        JTextField myJTextField = new JTextField(10);
        
        myJFrame.add(myJLabel);
        
        myJFrame.add(myJTextField);
        
        myJFrame.setVisible(true);
        
        
    }
    
}
