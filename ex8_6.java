import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class ex8_6 {
    JFrame window = new JFrame("Summation Number Application");
    JLabel numberLabel,resultLabel;
    JTextField numberField,resultField;

    public ex8_6(){
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
        numberLabel = new JLabel("Enter an integer and press Enter");
        c.add(numberLabel);
        numberField = new JTextField(10);
        c.add(numberField);
        numberField.addActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent event){
                long number,sumValue;
                number = Long.parseLong(numberField.getText());
                sumValue = summation(number);
                resultField.setText(Long.toString(sumValue));
                numberField.setText("");
            }
        });
        resultLabel = new JLabel("Summation valur is ");
        c.add(resultLabel);
        resultField = new JTextField(15);
        resultField.setEditable(false);
        c.add(resultField);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(350,150);
        window.setVisible(true);

    }
    public long summation(long n){
        long total = 0 ;
        for(long x = 0 ; x <= n ; x++){
            total += x;
        }
        return total;
    }
    public static void main(String[] args) {
        ex8_6 obj = new ex8_6();
    }
}
