import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class ex8_4 {
    public static void main(String[] args) {
        JFrame window = new JFrame("GUI 2 with BorderLayout");
        JTextArea textArea1,textArea2,textArea3;
        JButton btn;
        JScrollPane scroll;
        Container c = window.getContentPane();
        c.setLayout(new BorderLayout(10,10));
        c.add(new JLabel("Example use BorderLayout"),BorderLayout.NORTH);
        textArea1 = new JTextArea(6,14);
        textArea1.setText("This West");
        c.add(textArea1, BorderLayout.WEST);
        textArea2 = new JTextArea(6,14);
        textArea2.setText("This Center");
        scroll = new JScrollPane(textArea2);  //add textarea2 ไปที่  scroll และไปที่  container
        c.add(scroll, BorderLayout.CENTER);
        textArea3 = new JTextArea(6,14);
        textArea3.setEditable(false);   //ทำให้เข้าไปแก้ไขข้อความภายในได้
        textArea3.setText("This East");
        c.add(textArea3, BorderLayout.EAST);
        btn = new JButton("South");
        c.add(btn, BorderLayout.SOUTH);
        window.setSize(400,300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
