import javax.swing.JOptionPane;

public class JOptionPaneDemoPag274 {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Thank you for using this program!");
        
        int chosenOption = JOptionPane.showConfirmDialog(null, "Do you wish to save the changes?");
        JOptionPane.showMessageDialog(null, "You chose option: " + chosenOption);

        String name = JOptionPane.showInputDialog("Please write your name: ");
        JOptionPane.showMessageDialog(null, "Your name is: " + name);

        
        String[] connectionTypes = {"Wireless", "ADSL", "Optic Fiber"};
        int chosenConnection = JOptionPane.showOptionDialog(
        null, 
        "Choose one of the connections", 
        "Types of Connection", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        connectionTypes, 
        "Wireless"
        );
        JOptionPane.showMessageDialog(null, "You chose connection: " + chosenConnection);
         

        
         
       
    }

}
