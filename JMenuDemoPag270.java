import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class JMenuDemoPag270
{
    
    public static void main() {
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(350, 150);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar myJmenuBar = new JMenuBar();
        
        JMenu menuContainers = new JMenu("Containers");
        
        JMenuItem jmiJFrame = new JMenuItem("JFrame");
        
        JMenuItem jmiJPanel = new JMenuItem("JPanel");
        
        JMenu menuTextBoxes = new JMenu("Text Boxes");
        
        JMenuItem jmiJTextField = new JMenuItem("JTextField");
        
        JMenuItem jmiJTextArea = new JMenuItem("JTextArea");
        
        JMenu menuButtons = new JMenu("Buttons");
        
        JMenuItem jmiJJButton = new JMenuItem("JButton");
        
        JMenuItem jmiJCheckBox = new JMenuItem("JCheckBox");
        
        JMenuItem jmiJRadioButton = new JMenuItem("JRadioButton");
        
        JMenu menuOtherComponents = new JMenu("Others");
        
        JMenuItem jmiJLabel = new JMenuItem("JLabel");
        
        JMenuItem jmiJComboBox = new JMenuItem("JComboBox");
        
        JMenuItem jmiJTable = new JMenuItem("JTable");
        
        
        
        myJFrame.setJMenuBar(myJmenuBar);
        
        
        
        myJmenuBar.add(menuContainers);
        
        menuContainers.add(jmiJFrame);
        
        menuContainers.add(jmiJPanel);
        
        myJmenuBar.add(menuTextBoxes);
        
        menuTextBoxes.add(jmiJTextField);
        
        menuTextBoxes.add(jmiJTextArea);
        
        myJmenuBar.add(menuButtons);
        
        menuButtons.add(jmiJJButton);
        
        menuButtons.add(jmiJCheckBox);
        
        menuButtons.add(jmiJRadioButton);
        
        myJmenuBar.add(menuOtherComponents);
        
        menuOtherComponents.add(jmiJLabel);
        
        menuOtherComponents.add(jmiJComboBox);
        
        menuOtherComponents.add(jmiJTable);
        
        myJFrame.setVisible(true);

    }
   
}
