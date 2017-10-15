import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class JTextAreaDemoPag260
{
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("Title of JFrame");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setLayout(new FlowLayout());
        
        JLabel myJLabel = new JLabel("Notes:");
        
        JTextArea myJTextArea = new JTextArea();
        
        myJTextArea.setLineWrap(true);
        
        myJTextArea.setWrapStyleWord(true);
        
        JScrollPane myJScrollPane = new JScrollPane(myJTextArea);
        
        myJScrollPane.setPreferredSize(new Dimension(325, 80));
        
        myJFrame.add(myJLabel);
        
        myJFrame.add(myJScrollPane);
        
        myJFrame.setVisible(true);
        
        
        
        
        
        
        
    }
    
}
