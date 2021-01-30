//wow I'm fucked
//
//@Trevor
//
//@1/29/21
//
//

import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;



public class Maze implements MouseListener{
    JFrame frame;
    JPanel panel;
    JLabel label0;
    JTable table;

    int row;
    int column;

    ArrayList[][] tableArray = new ArrayList[10][10];





    public Maze(){
        frame = new JFrame("help");
        panel = new JPanel();
        table = new JTable(10, 10);


        frame.add(panel);




        table.setCellSelectionEnabled(false);
        table.setRowHeight(55);
        table.setEnabled(false);
        table.addMouseListener(this);

        panel.add(table);




        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String args[]){

        new Maze();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        if (e.getClickCount() == 2) {

          JTable target = (JTable)e.getSource();
          row = target.rowAtPoint(e.getPoint());
          column = target.columnAtPoint(e.getPoint());

          System.out.println(row + ", " + column);
          System.out.println();



        }



    }  

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }
    
    public void mouseExited(MouseEvent e) {

    }



    /*
    DefaultTableModel tableModel = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
    };
    */
}

