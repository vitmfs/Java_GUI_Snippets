import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


public class UtilizesBorderLayoutPag282
{
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(400, 170);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setLayout(new BorderLayout());
        
        JButton jmyJButtonNorth = new JButton("North");
        
        JButton jmyJButtonSouth = new JButton("South");
        
        JButton jmyJButtonWest = new JButton("West");
        
        JButton jmyJButtonEast = new JButton("East");
        
        JButton jmyJButtonCenter = new JButton("Center");
        
        myJFrame.add("North", jmyJButtonNorth);
        myJFrame.add("South", jmyJButtonSouth);
        myJFrame.add("West", jmyJButtonWest);
        myJFrame.add("East", jmyJButtonEast);
        myJFrame.add("Center", jmyJButtonCenter);
        
        
        myJFrame.setVisible(true);
        
        
    }
}
