
package flowlayout;

import java.awt.*;
import javax.swing.*;
public class CompositeLayoutExample {
    public static void main(String[] args){
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(250,200));
        frame.setTitle("Telephone");
        frame.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel(new GridLayout(4,3));
        for(int i =1;i<=9;i++){
            centerPanel.add(new JButton(""+i));
            
        }
        centerPanel.add(new JButton("*"));
        centerPanel.add(new JButton("o"));
        centerPanel.add(new JButton("#"));
        frame.add(centerPanel,BorderLayout.CENTER);
        JPanel southPanel = new JPanel (new FlowLayout());
        southPanel.add(new JLabel("Number to dial: "));
        southPanel.add(new JTextField(10));
        frame.add(southPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
