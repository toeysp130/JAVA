import java.awt.*;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DimensionUIResource;


public class ex8_9 {
    JFrame window;
    JPanel panel1,panel2;
    Container c;
    public ex8_9(){
        window = new JFrame("Test JPanel");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        panel1 = new JPanel();
        panel1.setPreferredSize(new DimensionUIResource(350, 120));
        panel1.setLayout(new FlowLayout());
        panel1.setBorder(new LineBorder(Color.red,3));
        panel1.add(new JLabel("This is JPanel 1"));

        panel2 = new JPanel();
        panel2.setPreferredSize(new DimensionUIResource(350, 120));
        panel2.setLayout(new FlowLayout());
        panel2.setBorder(new LineBorder(Color.blue,3));
        panel2.add(new JLabel("This is JPanel 2"));

        window.add(panel1);
        window.add(panel2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.setVisible(true);
        
    }
    public static void main(String[] args) {
        
        new ex8_9();
    }
}
