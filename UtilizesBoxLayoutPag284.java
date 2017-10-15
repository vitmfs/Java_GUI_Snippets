import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class UtilizesBoxLayoutPag284
{
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(200, 200);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel myJPanel = new JPanel();
        
        myJPanel.setLayout(new BoxLayout(myJPanel, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < 5; i++) {
            
            myJPanel.add(new JButton("Button " + (i+1)));
            
        }
        
        myJFrame.add(myJPanel);
        
        
        myJFrame.setVisible(true);
        
        
    }
}
