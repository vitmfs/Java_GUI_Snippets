import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleActionEvent01 implements ActionListener {
    
    JFrame myJFrame = new JFrame("ExampleActionEvent");
    
    JPanel myJPanel = new JPanel();
    
    JButton myJButton01 = new JButton("Button 1");
    JButton myJButton02 = new JButton("Button 2");
    
    JLabel myJLabel = new JLabel();
    
    public void ExampleActionEvent1() {
        
        myJFrame.setSize(300, 150);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myJFrame.setVisible(true);
        
        myJPanel.add(myJButton01);
        
        myJPanel.add(myJButton02);
        
        myJPanel.add(myJLabel);
        
        myJFrame.add(myJPanel);
        
        
        myJButton01.addActionListener(this);
        
        myJButton02.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == myJButton01) {
            
            myJLabel.setVisible(true);
            
            myJLabel.setText("You pressed Button 1!");
            
        }
        
        if (e.getSource() == myJButton02) {
            
            myJLabel.setVisible(false);
            
            JOptionPane.showMessageDialog(myJFrame, "You pressed Button 2!");
            
        }
        
    }
    
    public static void main(String[] args) {
        
        new ExampleActionEvent01();
        
        
    }
    
}
