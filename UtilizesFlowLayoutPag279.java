import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UtilizesFlowLayoutPag279 {
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setLayout(new FlowLayout());
        
        JLabel myJLabel = new JLabel("Please write your name: ");
        
        JTextField myTextField = new JTextField(10);
        
        JButton myJButton = new JButton("OK");
        
        myJFrame.add(myJLabel);
        
        myJFrame.add(myTextField);
        
        myJFrame.add(myJButton);
        
        myJFrame.setVisible(true);
        
        
        
        
    }

   
}
