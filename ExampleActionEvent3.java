import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExampleActionEvent3 extends JFrame implements ActionListener {
    
    JPanel myJPanel = new JPanel();
    
    JButton myJButton01 = new JButton("Button 1");
    
    JButton myJButton02 = new JButton("Button 2");
    
    JLabel myJLabel = new JLabel();
    
    
    public void exampleActionEvent3() {
        
        setTitle("ExampleActionEvent");
        
        setSize(300, 150);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        myJPanel.add(myJButton01);
        
        myJPanel.add(myJButton02);
        
        myJPanel.add(myJLabel);
        
        add(myJPanel);
        
        
        myJButton01.addActionListener(this);
        myJButton02.addActionListener(this);
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == myJButton01) {
            
            myJLabel.setVisible(true);
            
            myJLabel.setText("You pressed Button 1");
            
        }
        
        if (e.getSource() == myJButton02) {
            
            myJLabel.setVisible(false);
            
            JOptionPane.showMessageDialog(this, "You pressed Button 2");
            
        }
        
        
        
    }
    
    public static void main(String[] args) {
            
            new ExampleActionEvent3();
        }
    
    
    
}
