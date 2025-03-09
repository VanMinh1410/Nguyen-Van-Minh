/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joptionpane;
import javax.swing.*;
public class CofirmDialogExample {
    public static void main(String[] args){
        int choie = JOptionPane.showConfirmDialog(null,"Erase your hard disk?");
        System.out.println(choie);
        if(choie==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Disk erased!");
            
        }else{
            JOptionPane.showMessageDialog(null,"Cancelled.");
        }
    }
}
