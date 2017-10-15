import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;


public class JTableDemoPag268
{
    
    public static void main(String[] args) {
        
        Object[][] products = {
            
            {new Integer(1), "pencil", "Pencil & Co"},
            {new Integer(2), "pen", "Pens & Pens"},
            {new Integer(3), "notebook", "Notebooks & Others"}
        
        
        };
        
        Object[] titles = {"Code", "Product", "Supplier"};
        
        JFrame myJFrame = new JFrame();
        
        myJFrame.setTitle("JFrame Title");
        
        myJFrame.setSize(640, 480);
        
        myJFrame.setLocation(50, 50);
        
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTable myJTable = new JTable(products, titles);
        
        JScrollPane myJScrollPane = new JScrollPane(myJTable);
        
        myJTable.setPreferredScrollableViewportSize(new Dimension(325, 80));
        
        
        myJFrame.add(myJScrollPane);
        
        
        myJFrame.setVisible(true);
    }
    
}
