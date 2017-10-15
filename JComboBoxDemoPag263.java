import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

public class JComboBoxDemoPag263
{
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("Title of JFrame");
        
        myJFrame.setSize(640, 480);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        myJFrame.setLayout(new FlowLayout());
        
        
        JLabel myJLabel = new JLabel("Select a color: ");
       
        JComboBox myJComboBox = new JComboBox();
         
        myJFrame.add(myJLabel);
        
        

        myJComboBox.addItem("White");
        myJComboBox.addItem("Black");
        myJComboBox.addItem("Yellow");
        
        myJFrame.add(myJComboBox);
        
        myJFrame.setVisible(true);
    }
    
}
