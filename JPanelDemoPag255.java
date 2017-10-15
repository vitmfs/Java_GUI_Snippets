import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemoPag255
{
    
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("Title of JFrame");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel myJPanel = new JPanel();
        
        myJFrame.add(myJPanel);
        
        myJFrame.setVisible(true);
        
        
    }
   
    
}
