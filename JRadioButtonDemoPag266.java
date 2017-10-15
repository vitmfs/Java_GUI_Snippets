import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class JRadioButtonDemoPag266
{
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        myJFrame.setLayout(new FlowLayout());
        
        JRadioButton myJRadioButton01 = new JRadioButton("White");
        
        JRadioButton myJRadioButton02 = new JRadioButton("Black");
        
        JRadioButton myJRadioButton03 = new JRadioButton("Amarelo");
        
        
        myJFrame.add(myJRadioButton01);
        
        myJFrame.add(myJRadioButton02);
        
        myJFrame.add(myJRadioButton03);
        
        myJFrame.setVisible(true);
        
        
        
        
    }
}
