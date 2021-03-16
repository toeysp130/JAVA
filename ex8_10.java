import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import jdk.internal.platform.Container;
public class ex8_10 {
    public static void main(String[] args) {
        new MinMaxNumber();
    }
    
}

class MinMaxNumber implements ActionListener{
    JFrame window = new JFrame("Min Max Program");
    JLabel label1,label2,label3;
    JTextField number1,number2,number3;
    JButton btn;
    Container c = window.getContentPane();
    JPanel panel1,panel2;
    Font font = new Font("Tahoma" , Font.BOLD,16);
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
