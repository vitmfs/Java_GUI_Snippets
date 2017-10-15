import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class UtilizesGridLayoutPag281
{
    public static void main(String[] args) {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(400, 170);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setLayout(new GridLayout(3, 2));
        
        JLabel myJLabelFruit = new JLabel("Write the name of the fruit: ");
        
        JTextField myJTextField = new JTextField(10);
        
        JLabel myJLabelDrink = new JLabel("Select a drink: ");
        
        JComboBox myJComboBox = new JComboBox();
        
        myJComboBox.addItem("Water");
        
        myJComboBox.addItem("Milk");
        
        myJComboBox.addItem("Wine");
        
        JButton myJButton = new JButton("OK");
        
        myJFrame.add(myJLabelFruit);
        
        myJFrame.add(myJTextField);
        
        myJFrame.add(myJLabelDrink);
        
        myJFrame.add(myJComboBox);
        
        myJFrame.add(myJButton);
        
        myJFrame.setVisible(true);
        
        
        
        
        
        
    }
}
