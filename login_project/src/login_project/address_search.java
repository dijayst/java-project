package login_project;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class address_search extends JPanel {
    
    private JTable table;
    
    private personTableModel tablemodel;
    
         public address_search() {
         
             table=new JTable(tablemodel);
               tablemodel=new personTableModel() {
                 @Override
                 public Object getValueAt(int rowIndex, int columnIndex) {
                     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 }
                    
             };
             
             setLayout(new BorderLayout());
             
             add(table,BorderLayout.CENTER);
         
         
         
         }
}