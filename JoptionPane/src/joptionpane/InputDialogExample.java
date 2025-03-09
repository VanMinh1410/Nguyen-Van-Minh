
package joptionpane;

import javax.swing.*;
public class InputDialogExample {
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog(null,"What yer name,pandner?");
        JOptionPane.showMessageDialog(null,"Yeehaw "+name);
    }
}
