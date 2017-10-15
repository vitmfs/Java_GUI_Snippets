import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleActionEvent4 extends JFrame {
    
    JPanel myJPanel = new JPanel();
    
    JButton myJButton01 = new JButton("Button 1");
    
    JButton myJButton02 = new JButton("Button 2");
    
    JLabel myJLabel = new JLabel();
    
    public void exampleActionEvent4() {
        
        setSize(300, 150);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        myJPanel.add(myJButton01);
        
        myJPanel.add(myJButton02);
        
        myJPanel.add(myJLabel);
        
        myJButton01.addActionListener(new ProcessButtons());
        myJButton02.addActionListener(new ProcessButtons());

    }
    
    public static void main(String[] args) {
        
        new ExampleActionEvent4();
        
    }

    private class ProcessButtons implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == myJButton01) {
                
                myJLabel.setVisible(true);
                
                myJLabel.setText("You pressed Button 1");
                
            }
            
            if (e.getSource() == myJButton02) {
                
                myJLabel.setVisible(false);
                
                JOptionPane.showMessageDialog(null, "You pressed Button 2!");
                
            }

        }

    }
    
    

    
}
