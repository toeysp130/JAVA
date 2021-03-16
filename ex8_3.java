import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ex8_3 {
    public static void main(String [] args) {
        JFrame window = new JFrame("Test GUI");
        JTextField textField1,textField2;
        JLabel label1,label2;
        JButton btn1,btn2;
        Container c = window.getContentPane();   //สร้างcontainer แล้วให้setlayout ทันที
        c.setLayout(new FlowLayout());
        label1 = new JLabel("Enter String 1 create by JLabel");
        label2 = new JLabel("Enter String 2 create by JLabel");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        c.add(label1);
        c.add(textField1);
        c.add(label2);
        c.add(textField2);
        btn1 = new JButton(" O K ");
        btn2 = new JButton(" Cancle ");
        c.add(btn1);
        c.add(btn2);
        window.setSize(350, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 



    }
}
