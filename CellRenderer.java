import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class CellRenderer extends DefaultTableCellRenderer {

  TableModel tableModel;



    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
  
      System.out.println("tablecell works");
      //Cells are by default rendered as a JLabel.
      JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
  
      String val = (String)value;

      if (val == "red") {
        l.setBackground(Color.RED);
        l.setText("");
        System.out.println("red" + row + col);

      } else if (val == "blue") {
        l.setBackground(Color.BLUE);
        l.setText("");
    
      } else if (val == "black") {
        l.setBackground(Color.BLACK);
        l.setText("");

      } else if (val == "") {
        l.setBackground(Color.white);
        l.setText("");

      } else {
        System.out.println("stops?");
        l.setBackground(Color.white);
        l.setText("");
      }
  

    //Return the JLabel which renders the cell.
    return l;
  
  }
}